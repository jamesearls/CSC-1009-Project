package views;

import org.h2.mvstore.MVMap;

import model.MyAccounts;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class YourAccountPageView extends DynamicWebPage {

	public YourAccountPageView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		// TODO Auto-generated constructor stub
	}

	public boolean process(WebRequest toProcess) {
			MyAccounts loginuser = new MyAccounts();
			loginuser.username = toProcess.params.get("username");
			loginuser.email = toProcess.params.get("email");
			loginuser.password = toProcess.params.get("password");
			loginuser.confirmPassword = toProcess.params.get("confirmPassword");
			
			MVMap<String, MyAccounts> newloginuser = db.s.openMap("NewsStories");
			newloginuser.put(loginuser.username, loginuser);
			newloginuser.put(loginuser.email, loginuser);
			db.commit();

			String username = toProcess.params.get("username");
			String email = toProcess.params.get("email");
			String password = toProcess.params.get("password"); //make a login verification before allowing user to view account details
			String confirmPassword = toProcess.params.get("confirmPassword");
			
			if(toProcess.path.equalsIgnoreCase("account")){
				String stringToSendToWebBrowser = "<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"\r\n" + 
						"<head>\r\n" + 
						
"  <!-- Required meta tags -->\r\n" + 

						"  <meta charset=\"utf-8\">\r\n" + 
						"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
						"  <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n" + 
						"  <script type=\"text/javascript\" src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n" + 
						"  <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
						"  <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 

"  <!-- Bootstrap CSS -->\r\n" + 
"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
"  <!-- My CSS -->\r\n" + 
"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
"  <!-- Hover CSS -->\r\n" + 
"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">\r\n" + 
"  <title>Nav Bar</title>"+
						
						"</head>\r\n" + 
						"\r\n" + 
						"<body>\r\n" +"<nav class=\"topnav navbar-expand-sm navbar navbar-dark bg-primary fixed-top justify-content-center\">\r\n" + 
						"    <a class=\"navbar-brand hvr-grow-shadow\" href=\"/home\">Coping With Cancer</a>\r\n" + 
						"    <!-- Toggler/collapsibe Button -->\r\n" + 
						"    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n" + 
						"      <span class=\"navbar-toggler-icon\"></span>\r\n" + 
						"    </button>\r\n" + 
						"    <!-- Navbar links -->\r\n" + 
						"    <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n" + 
						"      <ul class=\"navbar-nav\">\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/home\">Home</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/forum\">Forum</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/symptomchecker\">Symptom Checker</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/help\">Help & Appointments</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/donate\">Donate</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/about\">About Us</a>\r\n" + 
						"        </li>\r\n" + 
						"      </ul>\r\n" + 
						"\r\n" + 
						"      <ul class=\"navbar-nav ml-auto\">\r\n" + 
						"        <li class=\"nav-item hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/signup\">Sign Up</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/account\">My Account</a>\r\n" + 
						"        </li>\r\n" + 
						"      </ul>\r\n" + 
						"    </div>\r\n" + 
						"\r\n" + 
						"</nav>"+
						
						"  <div class=\"py-5\">\r\n" + 
						"    <div class=\"container\">\r\n" + 
						"      <div class=\"row\">\r\n" + 
						"        <div class=\"col-md-12\">\r\n" + 
						"<br> " +
						"<br> " +
						"<br> " +
						"<br> " +
						
						"          <h1 class=\"display-1 text-center\">Welcome to your Account Page</h1>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"  </div>\r\n" + 
						"  <div class=\"py-5\" >\r\n" + 
						"    <div class=\"container\">\r\n" + 
						"      <div class=\"row\">\r\n" + 
						"        <div class=\"col-md-12\">\r\n" + 
					
	
						"          <div class=\"body\">\r\n" + 
						"            <br>\r\n" + 
						         
						"            <h2 align=\"left\">Login with your account details to print:</h2>\r\n" + 
						"            <br><br>\r\n" + 
						"            <form name=\"contact\" action=\"/accountinfo\" method=\"post\" align=\"left\">\r\n" + 
						"              <input class=\"input\" type=\"text\" name=\"username\" placeholder=\"Username\" required=\"\" min=\"2\" maxlength=\"30\">\r\n" + 
						"              <br><br>\r\n" + 
						"              <input class=\"input\" type=\"email\" name=\"email\" placeholder=\"Email Address\" required=\"\" min=\"2\" maxlength=\"30\">\r\n" + 
						"              <br><br>\r\n" + 
						"              <input class=\"input\" type=\"password\" name=\"password\" placeholder=\"Password\" required=\"\" min=\"2\" maxlength=\"30\">\r\n" + 
						"              <br><br>\r\n" + 
						"              <input class=\"input\" type=\"password\" name=\"confirmPassword\" placeholder=\"Confirm Password\" required=\"\" min=\"2\" maxlength=\"30\">\r\n" + 
						
						"              <br><br>\r\n" + 
						"              <input class=\"button\" type=\"submit\" value=\"Login\">\r\n" + 
						"            </form>\r\n" + 
						"            <br><br>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
						"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n" + 
						"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\r\n" + 
						"  </div>\r\n" + 
						"<footer class=\"section section-primary\" >\r\n" + 
						"    <div class=\"container\">\r\n" + 
						"      <div class=\"row\">\r\n" + 
						"        <div class=\"col-sm-6\">\r\n" + 
						"          <h1>Coping with Cancer</h1>\r\n" + 
						"          <p>We are a site that's meant to help and give our all to cancer patients. <br>If you have any topics you want to talk or ask any questions feel free to make a forum post or email us privately.</p>\r\n" + 
						"        </div>\r\n" + 
						"        <div class=\"col-sm-6\">\r\n" + 
						"          <p class=\"text-info text-right\">\r\n" + 
						"            <br>\r\n" + 
						"            <br>\r\n" + 
						"          </p>\r\n" + 
						"          <div class=\"row\">\r\n" + 
						"            <div class=\"col-md-12 hidden-lg hidden-md hidden-sm text-left\" style=\"\">\r\n" + 
						"              <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
						"              <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
						"              <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
						"              <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
						"            </div>\r\n" + 
						"          </div>\r\n" + 
						"          <div class=\"row\">\r\n" + 
						"            <div class=\"col-md-12 hidden-xs text-right\">\r\n" + 
						"              <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
						"              <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
						"              <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
						"              <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
						"            </div>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"  </footer>" +
						"</body>\r\n" + 
						"\r\n" + 
						"</html>";
				toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
				return true;
			
			}else if (toProcess.path.equalsIgnoreCase("accountinfo")) {
				
				
				
				String stringToSendToWebBrowser = 
						"<html>\r\n" + 
						"  \r\n" + 
						"  <head>\r\n" + 
						
						"  <!-- Required meta tags -->\r\n" + 
						
"    <meta charset=\"utf-8\">\r\n" + 
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
"    <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n" + 
"    <script type=\"text/javascript\" src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n" + 
"    <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n" + 
"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
"    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\"\r\n" + 
"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
						
	"  <!-- Bootstrap CSS -->\r\n" + 
	"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
	"  <!-- My CSS -->\r\n" + 
	"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
	"  <!-- Hover CSS -->\r\n" + 
	"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">\r\n" + 
	"  <title>Nav Bar</title>"+
	
		
						"  </head>\r\n" + 
						"  \r\n" + 
						"  <body>\r\n" + 
						"<nav class=\"topnav navbar-expand-sm navbar navbar-dark bg-primary fixed-top justify-content-center\">\r\n" + 
						"    <a class=\"navbar-brand hvr-grow-shadow\" href=\"/home\">Coping With Cancer</a>\r\n" + 
						"    <!-- Toggler/collapsibe Button -->\r\n" + 
						"    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n" + 
						"      <span class=\"navbar-toggler-icon\"></span>\r\n" + 
						"    </button>\r\n" + 
						"    <!-- Navbar links -->\r\n" + 
						"    <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n" + 
						"      <ul class=\"navbar-nav\">\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/home\">Home</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/forum\">Forum</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/symptomchecker\">Symptom Checker</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/help\">Help & Appointments</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/donate\">Donate</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/about\">About Us</a>\r\n" + 
						"        </li>\r\n" + 
						"      </ul>\r\n" + 
						"\r\n" + 
						"      <ul class=\"navbar-nav ml-auto\">\r\n" + 
						"        <li class=\"nav-item hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/signup\">Sign Up</a>\r\n" + 
						"        </li>\r\n" + 
						"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
						"          <a class=\"nav-link\" href=\"/account\">My Account</a>\r\n" + 
						"        </li>\r\n" + 
						"      </ul>\r\n" + 
						"    </div>\r\n" + 
						"\r\n" + 
						"</nav>"+
						//
						"    <div class=\"py-5\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12\">\r\n" + 
						"<br>" +
						"<br>" +
						"<br>" +
						"<br>" +
						
						"          <h1 class=\"display-1 text-center\">Welcome " + " " + username +".</h1>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"  </div>\r\n" + 
						"  <div class=\"py-5\">\r\n" + 
						"    <div class=\"container\">\r\n" + 
						"      <table style=\"width: 35%\" class=\"auto-style2\" border=\"1\" align=\"right\">\r\n" + 
						"        <tbody>\r\n" + 
						"          <tr>\r\n" + 
						"          </tr>\r\n" + 
						"        </tbody>\r\n" + 
						"      </table>\r\n" + 
						"    </div>\r\n" + 
						"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\" style=\"\"></script>\r\n" + 
						"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\" style=\"\"></script>\r\n" + 
						"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\" style=\"\"></script>\r\n" + 
						"  </div>\r\n" + 
						"  <div class=\"py-5\">\r\n" + 
						"    <div class=\"container\">\r\n" + 
						"      <div class=\"row\">\r\n" + 
						"        <div class=\"col-md-5 mx-4 mr-3\" style=\"\">\r\n" + 
						"          <td>\r\n" + 
						"            <p class=\"auto-style4\" style=\"\"><br></p>\r\n" + 
						"            <h1 style=\"text-align:center;\"> <u>Your Details</u> </h1>\r\n" + 
						"            <h3 style=\"text-align:center;\"> <b>Username:</b> " + " " + username +"</h3>\r\n" + 
						"            <h3 style=\"text-align:center;\"> <b>Email Address:</b> " + " " + email +"</h3>\r\n" + 
						"            <br>\r\n" + 
						"            <br>\r\n" + 
						"          </td>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"  </div>\r\n" + 
						
						
"    <footer class=\"section section-primary\">\r\n" + 
"      <div class=\"container\">\r\n" + 
"        <div class=\"row\">\r\n" + 
"          <div class=\"col-sm-6\">\r\n" + 
"            <h1>Coping with Cancer</h1>\r\n" + 
"            <p>We are a site that's meant to help and give our all to cancer patients.\r\n" + 
"              <br>If you have any topics you want to talk or ask any questions feel free\r\n" + 
"              to make a forum post or email us privately.</p>\r\n" + 
"          </div>\r\n" + 
"          <div class=\"col-sm-6\">\r\n" + 
"            <p class=\"text-info text-right\">\r\n" + 
"              <br>\r\n" + 
"              <br>\r\n" + 
"            </p>\r\n" + 
"            <div class=\"row\">\r\n" + 
"              <div class=\"col-md-12 hidden-lg hidden-md hidden-sm text-left\">\r\n" + 
"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
"              </div>\r\n" + 
"            </div>\r\n" + 
"            <div class=\"row\">\r\n" + 
"              <div class=\"col-md-12 hidden-xs text-right\">\r\n" + 
"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
"              </div>\r\n" + 
"            </div>\r\n" + 
"          </div>\r\n" + 
"        </div>\r\n" + 
"      </div>\r\n" + 
"    </footer>\r\n" + 
"  </body>\r\n" + 
"\r\n" + 
"</html>";
				toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser);
				
				return true;
			}
				return false;
	}
}
	