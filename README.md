# OAuth 2.0 with Facebook Login

>This is a simple spring boot application implemented to illustrate the OAuth protocol process. This application when run will request the user to grant access to Facebook by logging in to their account and when done, will display the Facebook name of the user.


To run this application, clone or download the source code to your local machine, and open the extracted zip file or the cloned project folder using Eclipse IDE or IntelliJ IDE. The IDE would first install the required dependencies for the project, and once done, you can run the application as any other spring boot application by clicking the run button.

However, the following are required to be installed in the local machine in order to compile and run this application.
- Java Development Kit
- Maven
- Eclipse IDE OR IntelliJ IDE

Once you run the project you will get the following screen. Click the Authenticate button in here to display the request access user interface.

[![Welcome Page](https://1.bp.blogspot.com/-6_5HgpbBQB8/XYdg-4CeQqI/AAAAAAAABAc/KWkjIbDjqb4VnAdD4nYNvrxgJWJBSW6swCLcBGAsYHQ/s640/Capture6.PNG)]()


The following user interface is requesting the permission from the user to access their Facebook account data. Click next Continue to grant permission for this application.

[![Request Access to Facebook Account](https://1.bp.blogspot.com/-BKrT2gcc9uc/XYdh7xFPP1I/AAAAAAAABA4/FAptNu28WMsrnV4MSEOZEr400XOI6t-mACLcBGAsYHQ/s640/Capture.PNG)]()


After the application is successfully authorized, it would fetch the name of the user's Facebook profile and will display it in a Hello user view.

[![Get User Data from Facebook](https://1.bp.blogspot.com/-UAexvX7aDOc/XYdg_mv0PuI/AAAAAAAABAg/HPdJsJ3davYQqJdBumX0BcouTZE-vPJvQCLcBGAsYHQ/s640/Capture7.PNG)]()



The OAuth 2.0 protocol is explained in my blog, Visit the following link to view my blog post on OAuth 2.0
http://kaveenabeywansa.blogspot.com/2019/09/oauth-20-facebook-authentication.html
