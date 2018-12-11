# soapui-plugin-dev

this is a sample codebase to add custom test steps to soapUI

attached zip file contains a *.factories.xml file whhich should go inside soapui/bin/factories
create factories directory if it doesn't exist

rest of the files are codebase which can be compiled an dmade into a jar. this jar needs to be put into soapui/bin/ext directory.

restart soapUI and you should be able to see some popups and in logs you'll see our extension has been loaded.

this documentation is not perfect, will rewrite later
