# CROM-Validator

The CROM Validator is a plugin for [FRaMED 2.0](https://github.com/Eden-06/FRaMED-2.0)), for detecting well-formedness errors in CROM models.

### Requirements
* Tested with Eclipse Photon Modeling Tools
* [FRaMED 2.0](https://github.com/Eden-06/FRaMED-2.0)
* or alternatively only [CROM](https://github.com/Eden-06/CROM)

### How to import CROM Validator repository into Eclipse
1. Install *FRaMED 2.0* using the [Step-by-Step installation guied](https://github.com/Eden-06/FRaMED-2.0/wiki/Install)
2. Install the following packages via `Help -> Eclipse Marketplace`
    * Install *EclipseOCL 6.4* (or higher)
        * Search for `EclipseOCL`
        * Select it, click on the *"Install"* link, and complete the installation
3. Import the *CROM-Validator* repository into Eclipse.
    1. Select "File" -> "Import" to open the import wizard, select "Projects from Git" and hit "Next>".
    2. Enter <https://github.com/Eden-06/CROM-Validator.git> into the URI field and hit "Next>"
    3. Only select the **master** branch and continue with "Next>"
    4. Continue with "Next>" until you can "Finish" the project import.

### How to use the validation?
1. Right click on a CROM model (`*.crom`) in the file explorer in Eclipse
2. Choose *"Validate Variant"*
3. The result of the evaluation will be displayed in a error message
