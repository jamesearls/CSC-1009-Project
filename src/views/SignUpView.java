package views;

import java.util.List;

import org.h2.mvstore.MVMap;

import model.Account;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class SignUpView extends DynamicWebPage {

	public SignUpView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		
	}
	public int accountQuantity;
	public boolean process(WebRequest toProcess) {
		if(toProcess.path.equalsIgnoreCase("signup")) {
			
        	MVMap<String, Account>accounts = db.s.openMap("accounts");
        	List<String> accountKeys = accounts.keyList();
        	
        	accountQuantity = accountKeys.size();
			
			String stringToSendToWebBrowser= 
					"<html>\r\n" + 
					"  \r\n" + 
					"  <head>\r\n" + 
				"  <!-- Required meta tags -->\r\n" + 
				"  <meta charset = \"utf-8\">\r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"  <!-- Bootstrap CSS -->\r\n" + 
				"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
				"  <!-- My CSS -->\r\n" + 
				"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
				"  <!-- Hover CSS -->\r\n" + 
				"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">\r\n" + 
				"  <script type=\"text/javascript\" src=\"/js/signupvalidation.js\"></script>\r\n" +
				"  <script type=\"text/javascript\" src=\"/js/confirmpassword.js\"></script>\r\n" +
				"  <title>Sign Up</title>"+
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
					"<br>"+
					"<br>"+
					"<br>"+
					"<br>"+
					"<div class=\"container\">"+
					"    <h1>Sign Up</h1>\r\n" + 
					"<a tabindex=\"0\" class=\"btn btn-lg btn-danger float-right\" role=\"button\" data-toggle=\"popover\" data-trigger=\"focus\" title=\"Total Members\" data-content=\"You can join the "+(accountQuantity) + " members that are already using CWC. It's very exciting. Right?\">Total Members</a>"+
					"    <div class=\"section\">\r\n" + 
					"      <div class=\"container\">\r\n" +
					"        <div class=\"row\">\r\n" + 
					"          <div class=\"col-md-12\">\r\n" + 
					"            <form name=\"signup\" role=\"form\" action=\"/addAccountProcess\" onsubmit=\"return validateForm()\" method=\"GET\">\r\n" + 
					"              <div class=\"form-group\">\r\n" + 
					"                <label class=\"control-label\" for=\"exampleInputEmail1\">Email Address</label>\r\n" + 
					"                <input class=\"form-control\" id=\"exampleInputEmail1\"\r\n" + 
					"                placeholder=\"your@email.com\" type=\"email\" name=\"email\" required>\r\n" + 
					"				<small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>"+
					"              </div>\r\n" + 
					"              <div class=\"form-group\">\r\n" + 
					"                <label class=\"control-label\" for=\"exampleInputEmail1\">Username</label>\r\n" + 
					"                <input class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Username\"\r\n" + 
					"                type=\"text\" name=\"username\" required>\r\n" + 
					"              </div>\r\n" + 
					"              <div class=\"form-group\">\r\n" + 
					"                <label class=\"control-label\" for=\"exampleInputPassword1\">Password</label>\r\n" + 
					"                <input class=\"form-control\" id=\"exampleInputPassword1\"\r\n" + 
					"                placeholder=\"Password\" onchange=\"validatePassword()\" type=\"password\" id= \"inputPassword\" name=\"password\" required>\r\n" + 
					"              </div>\r\n" + 
					"              <div class=\"form-group\">\r\n" + 
					"                <label class=\"control-label\" for=\"exampleInputPassword1\">Confirm Password</label>\r\n" + 
					"                 <input type=\"password\" class=\"form-control\" onkeyup=\"validatePassword()\" name=\"confirmedPassword\" id=\"inputPasswordConfirm\" data-match=\"#inputPassword\" data-match-error=\"Whoops, these don't match\" placeholder=\"Confirm\" required>\r\n"+
					"              </div>\r\n" + 
					"              <input type=\"submit\" value=\"Sign Up\" class=\"btn btn-primary\"></input>\r\n" + 
					"            </form>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </div>\r\n" + 
					"</div>\r\n "+
					" <!-- JavaScript -->\r\n" + 
					"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
					"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
					"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
					"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>"+
						"<script>"+
						"	$(function () {\r\n" + 
							"  $('[data-toggle=\"popover\"]').popover()\r\n" + 
							"})" +
							"</script"+
					"  </body>\r\n" + 
					"\r\n" + 
					"</html>";
					
	
			toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser);
			return true;
		}
			else if(toProcess.path.equalsIgnoreCase("addAccountProcess")) {
				Account account = new Account();
				account.uniqueId="account_"+System.currentTimeMillis();
				account.emailAddress=toProcess.params.get("email");
				account.username=toProcess.params.get("username");
				account.password=toProcess.params.get("password");
				account.confirmedPassword=toProcess.params.get("confirmedPassword");
				
				MVMap<String, Account>accounts = db.s.openMap("accounts");
				accounts.put(account.uniqueId, account);
				
				String stringToSendToWebBrowser =
						"<html>"
						+"<head>"
						+"  <!-- Required meta tags -->\r\n" + 
						"  <meta charset = \"utf-8\">\r\n" + 
						"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
						"  <!-- Bootstrap CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
						"  <!-- My CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
						"  <!-- Hover CSS -->\r\n" + 
						"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">"	
						+"<title>Submission Confirmed</title>"
								
						+"</head>"		
							+ "<body>"
						+"<nav class=\"topnav navbar-expand-sm navbar navbar-dark bg-primary fixed-top justify-content-center\">\r\n" + 
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
						"</nav>"
						+"<br>"
						+"<br>"
						+"<br>"
								+ "<p>Account added</p>"
								+ "<a href=\"/home\">Return Home</a>"
								
								+" <!-- JavaScript -->\r\n" + 
								"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
								"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
								"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
								"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>"+
							 "</body>"
						+ "</html>"; 
				toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser);
		}
		return false;
	}

	
}
