# KROKI-CERIF-Model
CERIF data model web application generated by the KROKI tool

#### Contents:

- Cerif_model.kroki: KROKI project file containing the imported CERIF data model
- CerifModel/ApplicationRepository: Application repository for exported project
- CerifModel/WebApp: Eclipse IDE project exported using KROKI tool based on imported CERIF data model.

#### Usage:

1. Open the provided Cerif_model.kroki file using the KROKI tool.
2. In the project properties panel, set the 'Associated Eclipse project' path so it points to the cloned 'CerifModel' directory and save KROKI project.

#### Notes:
All manual additions to exported WebApplication should be done in the CerifModel/WebApp/src_manual directory, all other directories are being overwritten by subsequent exports from the KROKI tool.
