/*****************************************************************
	KROKI Web Application Flat UI - JavaScript implementation

	Author: Milorad Filipovic [mfili@uns.ac.rs]
	Copyrigth (c) 2014 KROKI Team, 
					   Chair of Informatics
					   Faculty of Technical Sciences
					   Novi Sad, Serbia

	https://github.com/KROKIteam
 *****************************************************************/
 $(document).ready(function(e) {

	//number of miliseconds that popup messages are being visible for
	var delay = 2000;
	//speed of fade out and fade in effects
	var fadeSpeed = 300;
	//window (div.windows) that is currently being dragged
	var dragged = null;
	//offsets for dragging forms
	var ox = 0;
	var oy = 0;
	//remember username so it can be switched with logout text
	var username = $("#logoutLink").text();
	//if the username is shorter than the word "Logout", keep the minimal width of the link
	if(username.length < 6) {
		$("#logoutLink").outerWidth(88);
	}

	//delete dummy text generated by KROKI menu generator for empty divs
	$(".arrow-down").empty();
	$(".arrow-right").empty();

	//cache container and body for later use
	var container = $("#container");
    var body =  $("body");

	//if the confirm dialog is shown, remember which form to refresh after hiding the overlay
	var formToRefresh;

	/**************************************************************************************************************************
	   MENU EFFECTS
      **************************************************************************************************************************/
	//PAGE LOAD ANIMATION
	//Slide down the navigation
	$("nav").animate({height: calculateNavigationHeight()}, "slow", function() {
		$("#mainMenu").css("visibility","visible").hide().fadeIn("fast", function() {
			$("#logoutDiv").fadeIn("slow");
		});
	});

	//MAKE MAIN MENU ITEMS INVERT COLORS ON MOUSE HOVER
	$(".mainMenuItems").hover(function(e) {
		if($(this).find("ul.L1SubMenu").css('visibility') == 'hidden') {
			$(this).addClass("hover");
		}
	}, function(e) {
		if($(this).find("ul.L1SubMenu").css('visibility') == 'hidden') {
			$(this).removeClass("hover");	
		}
	});

	//OPEN SUBMENU ON CLICK
	// $(".menu") is a <div> within main menu list elements which contains text and down arrow
	// so getting parent of $(".menu") we get the actual <li> element
	$(".mainMenuItems").click(function(e) {
		//if corresponding submenu is not allready open, open it while closing all other submenus
		if($(this).find("ul.L1SubMenu").css('visibility') == 'hidden') {
			$(".mainMenuItems").each(function(index, element) {
				$(this).removeClass("hover");
				$(this).find("ul.L1SubMenu").css("visibility","hidden");
				$(this).find("ul.L2SubMenu").hide();
			});
			$(this).addClass("hover");
			$(this).find("ul.L1SubMenu").css("visibility","visible");
		}else {
			//if a submenu is open, just close it on click
			//$(this).addClass("hover");
			$(this).find("ul.L1SubMenu").css("visibility","hidden");
		}
	});

	//INVERT SUBMENU ITEMS COLORS ON MOUSE HOVER
	$("li.subMenuItem").hover(function(e) {
		e.stopPropagation();
		$(this).addClass("hover-li");
		$(this).find("span").addClass("arrow-right-hover");
	}, function(e) {
		e.stopPropagation();
		$(this).removeClass("hover-li");
		$(this).find("span").removeClass("arrow-right-hover");
	});

	//SHOW HIGHER LEVEL SUBMENUS ON CLICK
	$(".subMenuLink").click(function(e) {
		e.stopPropagation();
		// if submenu is not visible, click opens it
		if(!$(this).find("ul.L2SubMenu").is(":visible")) {
			// first close all others
			$(this).parent().find("ul.L2SubMenu").each(function(index, element) {
				$(this).hide();
			});
			$(this).children("ul.L2SubMenu").first().show();
		}else {
			//if submenu is allready opened, it is closed on click
			$(this).children("ul.L2SubMenu").first().hide();
		}

	});

	//SHOW "LOGOUT" TEXT WHEN HOVERING OVER USERNAME
	$("#logoutLink").hover(function() {
		//keep original width if username is longer than "Logout" so link doesn't shrink
		if(username.length > 6) {
			$(this).outerWidth($(this).outerWidth())
		}
		$(this).text("Logout");
	}, function(){
		$(this).text(username);
	});

	//if a window is resized, keep headers and fixed div aligned
	$(window).resize(function(e) {
		container.find(".standardForms").each(function(index, element) {
			updateBounds($(this));
		});
		$("nav").height(calculateNavigationHeight());
	});

	/**************************************************************************************************************************
	  FORM EFFECTS
      **************************************************************************************************************************/
    /*
        GUI components that are used to open standard forms have the 'activator' css class,
        'data-activate', 'data-label' and 'data-paneltype' attributes.
        Clicking these components displays corresponding standard panels in standard form.
        Currently, activators are: a) main menu items, b)lookup buttons and c)next links
    */
    $(document).on("click", ".activator", function(e) {
        e.stopPropagation();
        var activator = $(this);
        var activate = "/show/" + $(this).attr("data-activate");
        var label = $(this).attr("data-label");
        var panelType = $(this).attr("data-paneltype");
        var showback = false;
        resourceId = $(this).attr("data-activate");

        //ACTIVATOR SPECIFIC OPERATIONS:
        //if activator is menu item, return menu to inital state
        if(activator.hasClass(".subMenuItem")) {
            // Hide all the submenus
            $(".mainMenuItems").each(function(index, element) {
                $(this).removeClass("hover");
                $(this).find("ul.L1SubMenu").css("visibility","hidden");
                $(this).find("ul.L2SubMenu").hide();
            });
            activator.closest("li.mainMenuItems").removeClass("hover");
        }
        //if activator is next link, change activate link to get the child panel instead of standard panel
        if(activator.hasClass("panelLinks")) {
            var form = activator.closest("div.standardForms");
            var tableDiv = form.find("div.tableDiv");
            var selectedRow = tableDiv.find(".mainTable tbody tr.selectedTr");
            var returnTo = null;
            var zoomName = null;
            resourceId = $(this).attr("data-resourceId");

            if(selectedRow.length > 0) {
                var id = selectedRow.find("#idCell").text();
                activate = $(this).attr("data-activate") + "/" + id;
                panelType = "next-panel";
            }else {
				// If nothing is selected, show unfiltered data in new form
				label = $(this).attr("data-labelClean");
				activate = "/show/" + resourceId;
            }
            activator.closest(".nextPopup").hide();
        }

        //if activator is lookup button, show back button 
        //and set 'data-returnTo' attribute to caller form ID
        if(activator.hasClass("zoomInputs")) {
            showback = true;
            var form = activator.closest("div.standardForms");
            var activatorColumn = activator.closest("td.inputColumn");
            
            zoomName = activatorColumn.find("input[name]").attr("name");
            returnTo = form.attr("id");
        }

        //finally, pass data to method that creates forms
        makeNewWindow(activate, label, panelType, showback, returnTo, zoomName, resourceId);
    });

	//CLOSE FORM ON 'X' BUTTON CLICK
	container.on("click", ".headerButtons", function(e) {
		e.stopPropagation();
        var window = $(this).parent().parent();
        //TODO: Handle parent child window closing
        var form = window.find("div.standardForms:first");
		closeForm(form);
	});

	//FOCUS FORM ON CLICK
	container.on("click", ".windows", function() {
		focus($(this));
	});

	//DRAG FORMS WHEN DRAGGING HEADERS
	// mousedown on .formheaders - make current form draggable
	container.on("mousedown", ".windowHeaders", function(e) {
		dragged = $(this).parent();
		focus(dragged);
		//coordinates of a mouse
		var ex = e.pageX;
		var ey = e.pageY;
		//coordinates of the form
		var position = dragged.position();
		var fx = position.left;
		var fy = position.top;
		//offsets of these coordinates
		ox = ex - fx;
		oy = ey - fy;
		//offsets are calculated here to avoid calculation on mouse move
		//since the offsets stay the same during the dragging process
	});

	// mouseup  - stop dragging forms
	$("html").mouseup(function() {
		dragged = null;
	});

	$("html").mousemove(function(e) {
		if(dragged != null) {
			var ex = e.pageX;
			var ey = e.pageY;
			dragged.offset({
				left: ex - ox,
				top: ey - oy
			});
		}
	});

	//FUNCTION THAT CREATES HTML WINDOWS
	function makeNewWindow(activate, label, panelType, showback, returnTo, zoomName, resourceId) {
		//make div.window
		var newWindow = $(document.createElement("div"));
        //add unique ID for each window
		newWindow.addClass("windows");
		//make div.windowHeaders and it's contents
		var newWindowHeader = $(document.createElement("div"));
		newWindowHeader.addClass("windowHeaders");
		var newWindowName = $(document.createElement("div"));
		newWindowName.addClass("windowName");
		newWindowName.text(label);
		var newHeaderButtonDiv = $(document.createElement("div"));
		newHeaderButtonDiv.addClass("headerButtons");
		newHeaderButtonDiv.attr("title", "Close window");
		var newHeaderButtonImage = $(document.createElement("img"));
		newHeaderButtonImage.attr("src", "/files/images/icons-white/close.png");

        if(returnTo != null) {
            newWindow.attr("data-returnTo", returnTo);
        }
        if(zoomName != null) {
            newWindow.attr("data-zoomName", zoomName);
        }

		newHeaderButtonDiv.append(newHeaderButtonImage);
		newWindowHeader.append(newWindowName);
		newWindowHeader.append(newHeaderButtonDiv);

		//var activateLink = "/show/" + activate;
		var activateSplit = activate.split("/");

		//make div.windowBody
		newWindowBody = $(document.createElement("div"));
		newWindowBody.addClass("windowBody");

		newWindow.append(newWindowHeader)
		newWindow.append(newWindowBody);

		newWindowBody.bind('scroll', function() {
			updateBounds(newWindowBody);
		});

		container.append(newWindow);
		//if the form that needs to ne displayed is parent-child form
		//get containing panels with ajax call to /getInfo/panelName
		//and get data for each form by envoking standard panel ajax call to server
		if(panelType == "PARENTCHILDPANEL") {
			//get JSON data from server
			$.getJSON("/getInfo/" + resourceId, function(data) {
				//Create <div> element for each contained panel
				for(var i=0; i<data.panels.length; i++) {
					var activate = data.panels[i].activate;
                    var associationEnd = data.panels[i].assoiciation_end;
                    var newStandardForm = $(document.createElement("div"));
                    newStandardForm.attr("id", generateUUID());
                    newStandardForm.addClass("standardForms");
                    newStandardForm.attr("data-activate", "/show/" + activate);
                    newStandardForm.attr("data-assocend", associationEnd);
                    newStandardForm.css({"height": (100/data.panels.length) + "%"});
                    newStandardForm.attr("data-resourceId", activate);

                    newWindowBody.append(newStandardForm);
                    loadDataToForm(newStandardForm, true, false);
                    updateBounds(newWindowBody);

                    $(".datepicker").datepicker({
                        changeMonth: true,
                        changeYear:  true,
                        dateFormat:  "dd.mm.yy.",
                        yearRange:   "1900:2100"
                    });

					var newHeight = (data.panels.length) * 200;
					if(newHeight < $("#container").height()) {
						alert("New New: " + newHeight);
		                newWindow.height(newHeight);
		            }else {
		                newWindow.height("85%");
		                newWindow.css({
		                "top": 60,
		                "left": 20,
		                });
		            }
                }              
            });
		}else {
			var newStandardForm = $(document.createElement("div"));
			newStandardForm.addClass("standardForms");
			newStandardForm.attr("id", generateUUID());
			newStandardForm.attr("data-activate", activate);
			newStandardForm.attr("data-resourceId", resourceId);

			newWindowBody.append(newStandardForm);
			loadDataToForm(newStandardForm, false, showback);
        }

        forms = newWindow.find("div.standardForms").length;

        if(forms > 2) {
            var newHeight = forms*200;
            if(newHeight < $("#container").height()) {
                newWindow.height(newHeight);
            }else {
                newWindow.height("85%");
                newWindow.css({
                "top": 60,
                "left": 20,
                });
            }
        }
        updateBounds(newWindowBody);
    }

	/**************************************************************************************************************************
       TABLE EFFECTS
    ***************************************************************************************************************************/

	// SELECT TABLE ROWS ON MOUSE CLICK
	// Only one row can be selected at a time
	container.on("click", ".mainTable tbody tr", function() {
		var form = $(this).closest(".standardForms");
		var window = $(this).closest(".windows");
		$(this).parent().find("tr").removeClass("selectedTr");
		$(this).addClass("selectedTr");
		form.find("#btnPrev").removeAttr("disabled");
		form.find("#btnNext").removeAttr("disabled");
		form.find("#btnDelete").removeAttr("disabled");
		form.find("#btnNextForms").removeAttr("disabled");
        form.find("#btnZoomBack").removeAttr("disabled");
        form.find("a.panelLinks").removeClass("disabled");

		//if the table is on parent-child panel, filter data on table below and select first row
		if(window.find(".standardForms").length > 1) {
			var parentId = form.attr("data-resourceId");
			var childForm = form.next();
			var childId = childForm.attr("data-resourceId");
			var rowId = $(this).find("#idCell").text();
            var assocEnd = childForm.attr("data-assocend");
			//call server method only if child form exists below this form
			if(childForm.length > 0) {
                $.ajax({
                    url: "/showChildren/" +  childId  + "/" + assocEnd + "/" + rowId,
                    type: 'GET',
                    encoding:"UTF-8",
                    contentType: "text/html; charset=UTF-8",
                    success: function(data) {
                        childForm.html(data);
                        childForm.find("button#btnZoomBack").remove();
                        var firstRow = childForm.find(".mainTable tbody tr:first-child");
                        if(firstRow.length > 0) {
                            firstRow.trigger("click");
                        }else {
                          childForm.next().find(".tablePanel").empty();
                      }
                      updateBounds(childForm);
                      },
                      error: function(XMLHttpRequest, textStatus, errorThrown) { 
                        $("#messagePopup").html("<p>" + errorThrown + "</p>");
                        $("#messagePopup").attr("class", "messageError");
                        $("#messagePopup").prepend("<div></div>");
                        $("#messagePopup").slideToggle(300).delay(delay).slideToggle(500);
                    }
                });
            }
        }
    });

	//"SWITCH VIEW" BUTTON:
	// - Shows forms for adding new and editing existent rows in table
	container.on("click", "#btnSwitch", function(e) {
		var tableDiv = $(this).closest("div.tableDiv");
		var selectedRow = tableDiv.find(".mainTable tbody tr.selectedTr");
		var formBody = $(this).closest(".windowBody");
		var form = $(this).closest("div.standardForms");

		//if a row is selected, edit form needs to be displayed,
		//otherwise, an empty form for adding is shown
		if(selectedRow.length > 0) {
			var id = selectedRow.find("#idCell").text();
			var resName = form.attr("data-resourceId");
			var pid = -1;
			//if the form has been opened as child form, submit parent id
			if(form.attr("data-activate").indexOf("showChildren") != -1) {
				var activateLink = form.attr("data-activate").split("/");
				pid = activateLink[activateLink.length-1];
			}
			//since edit form is fetched from server on each click, remove previous one
			formBody.remove(".inputForm[name=editForm]");
			$.ajax({
				url: "/edit/" + resName + "/" + id + "/" + pid,
				type: 'GET',
				encoding:"UTF-8",
				contentType: "text/html; charset=UTF-8",
				success: function(data) {
					form.append(data);
					form.find(".nextPopup").hide();
					// initialize jQuery UI datepickers
					$(".datepicker").datepicker({
						changeMonth: true,
						changeYear:  true,
						dateFormat:  "dd.mm.yy.",
						yearRange:   "1900:2100"
					});
					form.fadeOut(fadeSpeed, function(e) {
						form.find(".tableDiv").hide();
						form.find(".operationsDiv").hide();
						form.find(".inputForm[name=editForm]").show();
						form.fadeIn(fadeSpeed);
					});
				},
				error: function(XMLHttpRequest, textStatus, errorThrown) { 
					$("#messagePopup").html("<p>" + errorThrown + "</p>");
					$("#messagePopup").attr("class", "messageError");
					$("#messagePopup").prepend("<div></div>");
					$("#messagePopup").slideToggle(300).delay(delay).slideToggle(500);
				}
			});
		}else {
			form.find(".nextPopup").hide();
			form.fadeOut(fadeSpeed, function(e) {
				form.find(".tableDiv").hide();
				form.find(".operationsDiv").hide();
				form.find(".inputForm[name=addForm]").show();
				form.fadeIn(fadeSpeed);
			});
		}
	});

	// FIRST, LAST, PREVIOUS AND NEXT BUTTONS IMPLEMENTATIONS
	container.on("click", "#btnFirst", function(e) {
		var form = $(this).closest("div.standardForms");
		var tableDiv = $(this).closest("div.tableDiv");
		var firstTR = tableDiv.find(".mainTable tbody tr:first-child");
		if(firstTR.length > 0) {
			/*tableDiv.find(".mainTable tbody tr").removeClass("selectedTr");
			//select first element
			firstTR.addClass("selectedTr");*/
			firstTR.trigger("click");
			//scroll to top
			tableDiv.find(".tablePanel").scrollTop(0);
			form.find("#btnPrev").removeAttr("disabled");
			form.find("#btnNext").removeAttr("disabled");
			form.find("#btnDelete").removeAttr("disabled");
			form.find("#btnNextForms").removeAttr("disabled");
		}
	});

	container.on("click", "#btnPrev", function(e) {
		var tableDiv = $(this).closest("div.tableDiv");
		var tablePanel = tableDiv.find(".tablePanel");
		var selectedRow = tableDiv.find(".mainTable tbody tr.selectedTr");

		if(selectedRow.length > 0) {
			if(selectedRow.prev().length > 0) {
				var position = selectedRow.prev().position();
				selectedRow.prev().trigger("click");
				//detect whent the selected row gets out of the view port, and scroll so it gets on top
				if(position.top < tablePanel.position().top) {
					tablePanel.scrollTop((selectedRow.next().index()-2) * selectedRow.next().outerHeight());
				}
			}
		}
	});

	container.on("click", "#btnNext", function(e) {
		var tableDiv = $(this).closest("div.tableDiv");
		var tablePanel = tableDiv.find(".tablePanel");
		var selectedRow = tableDiv.find(".mainTable tbody tr.selectedTr");
		if(selectedRow.length > 0) {
			if(selectedRow.next().length > 0) {
				var position = selectedRow.next().position();
				selectedRow.next().trigger("click");
				//detect whent the selected row gets out of the view port, and scroll so it gets on top
				if((position.top + selectedRow.next().outerHeight()) > (tablePanel.position().top + tablePanel.outerHeight()) ) {
					tablePanel.scrollTop((selectedRow.next().index()+2) * selectedRow.next().outerHeight());
				}
			}
		}
	});

	container.on("click", "#btnLast", function(e) {
		var form = $(this).closest("div.standardForms");
		var tableDiv = $(this).closest("div.tableDiv");
		var lastTR = tableDiv.find(".mainTable tbody tr:last-child");
		if(lastTR.length > 0) {
			//select last element
			lastTR.trigger("click");
			//scroll to bottom
			var position = lastTR.position();
			tableDiv.find(".tablePanel").scrollTop(position.top);
			form.find("#btnPrev").removeAttr("disabled");
			form.find("#btnNext").removeAttr("disabled");
			form.find("#btnDelete").removeAttr("disabled");
			form.find("#btnNextForms").removeAttr("disabled");
		}
	});

	/* SHOW NEXT POPUP BUTTON CLICK */
	container.on("click", "#btnNextForms", function(e) {
		var form = $(this).closest("div.standardForms");
		var popup = form.find(".nextPopup");
		var tableDiv = $(this).closest("div.tableDiv");
		var selectedRow = tableDiv.find(".mainTable tbody tr.selectedTr");
		popup.css({
			'position': 'absolute',
			'left': $(this).position().left,
			'top': $(this).position().top + $(this).height() + 10 
		});
		popup.fadeToggle();
	});

	container.on("click", "#btnRefresh", function(e) {
		var form = $(this).closest("div.standardForms");
		refreshFormData(form);
	});

	container.on("click", "#btnAdd", function(e) {
		var tableDiv = $(this).closest("div.tableDiv");
		var selectedRow = tableDiv.find(".mainTable tbody tr.selectedTr");
		var formBody = $(this).closest(".windowBody");
		var form = $(this).closest("div.standardForms");

		form.find(".nextPopup").hide();
		form.fadeOut("slow", function(e) {
			form.find(".tableDiv").hide();
			form.find(".operationsDiv").hide();
			form.find(".inputForm[name=addForm]").show();
			form.fadeIn("slow");
		});
	});

	container.on("click", "#btnDelete", function(e) {
		var form = $(this).closest("div.standardForms");
		var tableDiv = form.find("div.tableDiv");
		var selectedRow = tableDiv.find(".mainTable tbody tr.selectedTr");

		if(selectedRow.length > 0) {
			var id = selectedRow.find("#idCell").text();
			var presName = form.attr("data-resourceId");
			formToRefresh = form;
			showConfirmDialog("Confirm delete", "/delete/" + presName + "/" + id, "Are you sure you wish to delete the selected row?");
		}
	});

	//OK and Cancel buttons on confirm dialogs
	$("#cancelConfirm").click(function(e) {
		$("#overlay").hide();
	});

	$("#cconfirmBtn").click(function(e) {
		$("#overlay").hide();
		var link = $(this).closest("#confirmDialog").attr("data-confirmLink");
		var params = "?names="
		if(link == "printForm") {
			var confirmDialog = $(this).closest("#confirmDialog");
			var resourceid = $("#confirmDialog").attr("data-resourceid");
			if($('#confirmDialog input:checkbox:checked').length > 0) {
				$('#confirmDialog input:checkbox:checked').each(function() {
					params += $(this).attr("name") + ";"
				});
				link += params + "&resource=" + resourceid;
				$.ajax({
					url: link,
					type: 'GET',
					encoding:"UTF-8",
					contentType: "text/html; charset=UTF-8",
					success: function(data) {
						console.log("RESPONSE: " + data)
						$("#messagePopup").html(data);
						var clas = $("#messagePopup").find("p").attr("data-cssClass");
						$("#messagePopup").attr("class", clas);
						$("#messagePopup").prepend("<div></div>");
						$("#messagePopup").slideToggle(300).delay(delay).slideToggle(500);
						var pdfURI = ""
						window.open('/static/' + resourceid + '.pdf', '_blank');
					},
					error: function(XMLHttpRequest, textStatus, errorThrown) { 
						$("#messagePopup").html("<p>" + errorThrown + "</p>");
						$("#messagePopup").attr("class", "messageError");
						$("#messagePopup").prepend("<div></div>");
						$("#messagePopup").slideToggle(300).delay(delay).slideToggle(500);
					}
				});
			}else {
				alert("Please select at least one column to print.")
			}
		}else {
			if(link != "justClose") {
				$.ajax({
					url: link,
					type: 'GET',
					encoding:"UTF-8",
					contentType: "text/html; charset=UTF-8",
					success: function(data) {
						$("#messagePopup").html(data);
						var clas = $("#messagePopup").find("p").attr("data-cssClass");
						$("#messagePopup").attr("class", clas);
						$("#messagePopup").prepend("<div></div>");
						$("#messagePopup").slideToggle(300).delay(delay).slideToggle(500);
						refreshFormData(formToRefresh);
					},
					error: function(XMLHttpRequest, textStatus, errorThrown) { 
						$("#messagePopup").html("<p>" + errorThrown + "</p>");
						$("#messagePopup").attr("class", "messageError");
						$("#messagePopup").prepend("<div></div>");
						$("#messagePopup").slideToggle(300).delay(delay).slideToggle(500);
					}
				});
			}
		}
	});

	function showConfirmDialog(name, confirmLink, text, form) {
		$("#confirmDialog .windowName").text(name);
		$("#confirmDialog").attr("data-confirmLink", confirmLink);
		$("#confirmDialog p").empty();
		$("#confirmDialog p").text(text);
		// DEFAULT PRINT FORM
		// Show check boxes for columns that need to be printed
		if (typeof form !== "undefined" && confirmLink == "printForm") {
		    var printContainer = $(document.createElement("div"));
		    $("#confirmDialog").attr("data-resourceid", form.attr("data-resourceid"));

		    form.find(".inputFormFields tr").each(function() {
		    	var label = $(this).find('td.labelColumn').text();
		    	var name = $(this).find('*[name]:first').attr('name');

		    	var checkboxLabel = $(document.createElement("label"));
		    	var printCheckBox = $(document.createElement("input"));
		    	printCheckBox.addClass("printCheckBox");
		    	printCheckBox.attr("type", "checkbox");
		    	printCheckBox.attr("name", name);
		    	printCheckBox.attr("id", name);
		    	printCheckBox.attr("value", name);
		    	printCheckBox.attr("checked", "checked");

		    	var checkboxLabel = $(document.createElement("label"));
		    	checkboxLabel.addClass("printLabel");
		    	checkboxLabel.attr("for", name);
		    	checkboxLabel.text(label);
		    	printContainer.append(printCheckBox);
		    	printContainer.append(checkboxLabel);
		    });
		    var count = printContainer.find("input").length;
		    if(count > 3) {
		    	$("#confirmDialog").css({height: 42*count + "px"});
		    }else {
		    	$("#confirmDialog").css({height: "170px"});
		    }
		    $("#confirmDialog p").append(printContainer);
		}else {
			$("#confirmDialog").css({height: "170px"});
		}
		$("#overlay").show();
	}

    // Return from zoom button
    container.on("click", "#btnZoomBack", function(e) {
        var form = $(this).closest("div.standardForms");
        var window = $(this).closest("div.windows");
        var tableDiv = form.find("div.tableDiv");
        var selectedRow = tableDiv.find(".mainTable tbody tr.selectedTr");

        if(selectedRow.length > 0) {
            closeForm(form);
            var id = selectedRow.find("#idCell").text();
            var zoomName = window.attr("data-zoomname");
            var returnTo = window.attr("data-returnto");
            var caller = getForm(returnTo);
            var callerPanel = caller.attr("data-resourceId");
            $.getJSON("/getZooms/" + callerPanel + "/" + zoomName + "/" + id, function(data) {
                for(var i = 0; i < data.zoomValues.length; i++) {
                    var zoomName = data.zoomValues[i].name;
                    var zoomValue = data.zoomValues[i].value;
                    // Get visible input since, one is always hidden, depending on which form is in use (add or edit)
                    var zoomInput = caller.find("#" + zoomName + ":visible"); 
                    
                    console.log("Menjam     :" + zoomInput.attr("id") + " iz " + zoomInput.closest("form.inputForm").attr("name"));
                    console.log(zoomInput.val() + " --> " + zoomValue);
                    zoomInput.val(zoomValue);
                }
            });
        }
    });

	// OPERATION BUTTON CLICKS
	container.on("click", ".operationButton[data-operation]", function(e) {
		var name = $(this).text();
		var link = $(this).attr("data-confirmLink");
		var text = $(this).attr("data-confirmText");
		var form = $(this.closest(".standardForms"));
		showConfirmDialog(name, link, text, form);
	});

	/**************************************************************************************************************************
    INPUT PANEL EFFECTS
    **************************************************************************************************************************/
    container.on("click", "#button-cancel", function(e) {
        e.preventDefault();
        var form = $(this).closest("div.standardForms");
        form.fadeOut("slow", function(e) {
            refreshFormData(form);
            form.find(".tableDiv").show();
            form.find(".operationsDiv").show();
            form.find(".inputForm").hide();
            form.fadeIn(fadeSpeed);
        });
        form.trigger("reset");
    });

    container.on("click", "#button-ok", function(e) {
        e.preventDefault();
        var form = $(this).closest(".inputForm");
        var act = form.attr('action');
        var method = form.attr('method');
        $.ajax({
            type: method,
            url: act,
            data: form.serialize(),
            encoding:"UTF-8",
            contentType: "text/html; charset=UTF-8",
            success: function (data) {
                $("#messagePopup").html(data);
                var clas = $("#messagePopup").find("p").attr("data-cssClass");
                $("#messagePopup").attr("class", clas);
                $("#messagePopup").prepend("<div></div>");
                $("#messagePopup").slideToggle(300).delay(delay).slideToggle(500);
                if(clas == "messageOk") {
                    if(form.attr("name") == "addForm") {
                        form.trigger("reset");
                        form.find(".inputFormFields tr:first-child input").focus();
                    }
                }
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) { 
                $("#messagePopup").html("<p>" + errorThrown + "</p>");
                $("#messagePopup").attr("class", "messageError");
                $("#messagePopup").prepend("<div></div>");
                $("#messagePopup").slideToggle(300).delay(delay).slideToggle(500);
            }
        });
    });
});
//---------------------------------------------------------------------//           UTIL FUNCTIONS

    /*
     * Fetches the data from server to form element
     * */
    function loadDataToForm(form, displayTitle, showback) {
        var activateLink = form.attr("data-activate");
        var window = form.closest(".windows");
        $.ajax({
            url: activateLink,
            type: 'GET',
            encoding:"UTF-8",
            contentType: "text/html; charset=UTF-8",
            success: function(data) {
                form.html(data);
                window.show();
                focus(window);
                if(!displayTitle) {
                    form.find("h1").remove();
                }
                if(!showback) {
                    form.find("button#btnZoomBack").remove();
                }
            	/*
            	 * Set the bounds of table head fixator div and its contents 
            	 */
               updateBounds(form);
            	// initialize jQuery UI datepickers
            	$(".datepicker").datepicker({
            		changeMonth: true,
            		changeYear:  true,
            		dateFormat:  "dd.mm.yy.",
            		yearRange:   "1900:2100"
            	});

            	/*
				 * If number of columns is more than 6, add 200 pixels for each
				 * and 200 px in height for each standard form 
				 */
				newWindow = form.closest(".windows");
		        var columns = newWindow.find("th").length;
		        var siblings = newWindow.find(".standardForms").length;
                if(columns > 6) {
		            var newWidth = columns*200;
		            if(newWidth<$("#container").width()) {
		                newWindow.width(newWidth);
		                newWindow.css("width", "98%");
		            }else {
		                //newWindow.style.width("98%");
		                newWindow.css({
		                	"width": "98%",
		                   	"top": 60,
		                   	"left": 20
		               });
		            }
		        }

                if(siblings > 1) {
                    form.find(".operationsDiv").css("max-height", "100%");
                }

            },
            error: function(XMLHttpRequest, textStatus, errorThrown) {
        	   window.remove();
        	   delete window;
        	   $("#messagePopup").html("<p><b>ERROR:</b> " + errorThrown + "</p>");
        	   $("#messagePopup").attr("class", "messageError");
        	   $("#messagePopup").prepend("<div></div>");
        	   $("#messagePopup").slideToggle(300).delay(2000).slideToggle(500);
            }
        });
    }

    //Form is focused by applying 'focused' css class
    //which adds drop-shadow effect to it and puts the form in front of the others.
    //Only one form can be focused at a time.
    function focus(form) {
    	$(".windows").each(function(index, element) {
    		$(this).removeClass("focused");
    		$(this).addClass("unfocused");
    	});
    	form.removeClass("unfocused");
    	form.addClass("focused");
    }

    /*
     * Refresh form data from database
     */
    function refreshFormData(form) {
        if(typeof form !== "undefined") {
        	var win = form.closest("div.windows");
	        form.fadeOut("fast", function() {
	            var showTitle = false;
	            var showback = false;
	            if((win.find(".standardForms").length) > 1) {
	               showTitle =  true;
	            }
	            if((form.find("button#btnZoomBack").length) > 0) {
	               showback =  true;
	            }
	            loadDataToForm(form, showTitle, showback);
	            $(this).fadeIn("fast", function(e) {
	               if(form.next().length > 0) {
	                    refreshFormData(form.next());
	                }
	            });
	        });
        }
    }

    //Updates the bounds of fixed table headers and main navigation dimensions on resize and scroll events
    function updateBounds(form) {
    	if(form != null) {
    		form.find(".tablePanel").each(function(index, element) {
    			var thead = $(this).find("thead:first");
    			var fixator = $(this).find(".theadFixator:first");
    			fixator.offset({ 
    				top: $(this).offset().top, 
    				left: $(this).offset().left 
    			});
    			fixator.height(thead.height());
    			fixator.width(thead.width());

    			thead.find(".innerTHDiv").each(function(index, element) {
    				var span = $(this).parent().find("span:first");
    				$(this).offset({ 
    					top: fixator.offset().top, 
    					left: $(this).offset().left 
    				});
    				$(this).css("padding-left", (span.offset().left - span.parent().offset().left));
    			});
    		});
    	}
    }

    //calculate main navigation height based on calculated items widht
    function calculateNavigationHeight() {
    	var menuItemsWidth = 0;
    	var mainMenuWidth = $("#mainMenu").width();
    	$(".mainMenuItems").each(function(index, element) {
    		menuItemsWidth += $(this).width();
    	});
    	var rows = 1;
    	if(menuItemsWidth > mainMenuWidth) {
    		rows = Math.round(menuItemsWidth/mainMenuWidth) + 1;
    	}
    	return rows*40;
    }

    // Generate UUID-like uniqe ID for each form
    function generateUUID() {
        var d = new Date().getTime();
        var uuid = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
            var r = (d + Math.random()*16)%16 | 0;
            d = Math.floor(d/16);
            return (c=='x' ? r : (r&0x7|0x8)).toString(16);
        });
        return uuid;
    };

    function getForm(id) {
        var form = null;
        $("div.standardForms").each(function(index, element) {
            if( $(this).attr("id") == id ) {
                form = $(this);
                return false;
            }
        });
        return form;
    };

    //Closes the form and all it's associated forms
    function closeForm(form) {
        //close all zoomed forms first
        var formID = form.attr("id");
        var formWindow = form.closest("div.windows");
        $("div.standardForms").each(function(index, element) {
            if( $(this).attr("data-returnTo") == formID ) {
                closeForm($(this));
            }
        });
        formWindow.remove();
        delete formWindow;
    }