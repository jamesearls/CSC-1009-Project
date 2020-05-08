package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.*;

public class HomeView extends DynamicWebPage{

	public HomeView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		// TODO Auto-generated constructor stub
	}
	
	public boolean process(WebRequest toProcess)
	{
        if(toProcess.path.equalsIgnoreCase("home"))
        {
        	
        	String stringToSendToWebBrowser = "<html>\r\n" + 
        			"  \r\n" + 
        			"  <head>\r\n" + 
        			"    <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n" + 
        			"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
        			"    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\"\r\n" + 
        			"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
        			"  <!-- Required meta tags -->\r\n" + 
        			"  <meta charset = \"utf-8\">\r\n" + 
        			"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
        			"  <!-- Bootstrap CSS -->\r\n" + 
        			"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
        			"  <!-- My CSS -->\r\n" + 
        			"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
        			"  <!-- Hover CSS -->\r\n" + 
        			"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">" +
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
        			"</nav>" +
        			"<br>"+
        			"<br>"+
        			"    <div class=\"section\">\r\n" + 
        			"      <div class=\"container\">\r\n" + 
        			"        <div class=\"row\">\r\n" + 
        			"          <div class=\"col-md-12 text-center\">\r\n" + 
        			"            <h1 style=\"font-size:60px;\">Coping With Cancer</h1>\r\n" + 
        			"            <h2 class=\"site-slogan\">Together we can beat cancer</h2>\r\n" + 
        			"            <br>\r\n" + 
        			"            <br>\r\n" + 
        			"          </div>\r\n" + 
        			"        </div>\r\n" + 
        			"      </div>\r\n" + 
        			"    </div>\r\n" + 
        			"    <div class=\"section\">\r\n" + 
        			"      <div class=\"container\">\r\n" + 
        			"        <div class=\"row\">\r\n" + 
        			"          <div class=\"col-md-7\">\r\n" + 
        			"            <img src=\"PICTURES\\child-cancer-patient-with-nurse.jpg\" class=\"center-block img-responsive\">\r\n" + 
        			"          </div>\r\n" + 
        			"          <div class=\"col-md-5\">\r\n" + 
        			"            <p style=\"font-size: 20px;\" class=\"text-center\">\r\n" + 
        			"              <br>\r\n" + 
        			"              <br>\r\n" + 
        			"              <br>\r\n" + 
        			"              <br>Here at Coping With Cancer, we try to be the one of the most informative websites for cancer information.\r\n" + 
        			"              We are driven by people who are suffering and have suffered through the different\r\n" + 
        			"              stages of cancer. Our website and the members of our website try their best to inform and help people who are struggling and help them\r\n" + 
        			"              get a better quality of life they need</p>\r\n" + 
        			"          </div>\r\n" + 
        			"        </div>\r\n" + 
        			"      </div>\r\n" + 
        			"    </div>\r\n" + 
        			"    <div class=\"section\">\r\n" + 
        			"      <div class=\"container\">\r\n" + 
        			"        <div class=\"row\">\r\n" + 
        			"          <div class=\"col-md-6\">\r\n" + 
        			"            <a href=\"symptomchecker\" style=\"font-size:30px;\">Click this link or the image to try the symptom checker to see whether it would be worth your while to go visit a doctor</a>\r\n" + 
        			"          </div>\r\n" + 
        			"          <div class=\"col-md-5\">\r\n" + 
        			"            <a href=\"symptomchecker\"><img src=\"PICTURES\\Symptom_Checker_Image_for_home.jpg\" class=\"img-responsive\"></a>\r\n" + 
        			"          </div>\r\n" + 
        			"        </div>\r\n" + 
        			"      </div>\r\n" + 
        			"    </div>\r\n" + 
        			"    <div class=\"section\">\r\n" + 
        			"      <div class=\"container\">\r\n" + 
        			"        <div class=\"row\">\r\n" + 
        			"          <div class=\"col-md-8\">\r\n" + 
        			"            <a href=\"forum\"><img src=\"PICTURES\\community-forum-2.jpg\" class=\"img-responsive\"></a>\r\n" + 
        			"          </div>\r\n" + 
        			"          <div class=\"col-md-4\">\r\n" + 
        			"            <a href=\"forum\" style=\"font-size:30px;\">Click here or the image to view the forum to see what other cancer patients and survivors have said about different ways of coping, kinds of pain relievers amd genersl tips to living with cancer</a>\r\n" + 
        			"          </div>\r\n" + 
        			"          <a href=\"&lt;/div\">\r\n" + 
        			"      </a>\r\n" + 
        			"        </div>\r\n" + 
        			"        <a href=\"&lt;/div\">\r\n" + 
        			"    </a>\r\n" + 
        			"      </div>\r\n" + 
        			"      <a href=\"&lt;/div\">\r\n" + 
        			"    </a>\r\n" + 
        			"      <a href=\"#\"></a>\r\n" + 
        			"    </div>\r\n" + 
        			"    <div class=\"section\">\r\n" + 
        			"      <div class=\"container\">\r\n" + 
        			"        <div class=\"row\">\r\n" + 
        			"          <div class=\"col-md-5\">\r\n" + 
        			"            <a href=\"donate\" style=\"font-size:30px;\">Click here or the image to make a donation to cancer charities, or this website to help us keep it up and running</a>\r\n" + 
        			"          </div>\r\n" + 
        			"          <div class=\"col-md-7\">\r\n" + 
        			"            <a href=\"donate\"><img src=\"PICTURES\\5_Donate-now-button.png\" class=\"img-responsive\"></a>\r\n" + 
        			"          </div>\r\n" + 
        			"        </div>\r\n" + 
        			"      </div>\r\n" + 
        			"    </div>\r\n" + 
        			"    <div class=\"section\">\r\n" + 
        			"      <div class=\"container\">\r\n" + 
        			"        <div class=\"row\">\r\n" + 
        			"          <div class=\"col-md-8\">\r\n" + 
        			"            <a href=\"help\"><img src=\"PICTURES\\help-2018-02.png\" class=\"img-responsive\"></a>\r\n" + 
        			"          </div>\r\n" + 
        			"          <div class=\"col-md-4\">\r\n" + 
        			"            <a href=\"help\" style=\"font-size:30px;\"><br><br><br>To seek help, be it a doctor, hospital or a hospice, then click here to fins out about all the services near you</a>\r\n" + 
        			"          </div>\r\n" + 
        			"        </div>\r\n" + 
        			"      </div>\r\n" + 
        			"    </div>\r\n" + 
        			"    <div class=\"section\">\r\n" + 
        			"      <div class=\"container\">\r\n" + 
        			"        <div class=\"row\">\r\n" + 
        			"          <div class=\"col-md-4\">\r\n" + 
        			"            <a href=\"about\" style=\"font-size:30px;\"><br><br>To find out more from the team behind this website, click here</a>\r\n" + 
        			"          </div>\r\n" + 
        			"          <div class=\"col-md-8\">\r\n" + 
        			"            <a href=\"about\"><img src=\"PICTURES\\aboutUsHomePic.jpg\" class=\"img-responsive\"></a>\r\n" + 
        			"          </div>\r\n" + 
        			"        </div>\r\n" + 
        			"      </div>\r\n" + 
        			"    </div>\r\n" + 
        			"    <footer class=\"section section-primary\">\r\n" + 
        			"      <div class=\"container\">\r\n" + 
        			"        <div class=\"row\">\r\n" + 
        			"          <div class=\"col-sm-6\">\r\n" + 
        			"            <h1>Coping With Cancer</h1>\r\n" + 
        			"          </div>\r\n" + 
        			"          <div class=\"col-sm-6\">\r\n" + 
        			"            <p class=\"text-info text-right\">\r\n" + 
        			"              <br>\r\n" + 
        			"              <br>\r\n" + 
        			"            </p>\r\n" + 
        			"            <div class=\"row\">\r\n" + 
        			"              <div class=\"col-md-12 hidden-lg hidden-md hidden-sm text-left\">\r\n" + 
        			"                <a href=\"http://instagram.com\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
        			"                <a href=\"http://twitter.com\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
        			"                <a href=\"http://facebook.com\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
        			"                <a href=\"http://github.com\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
        			"              </div>\r\n" + 
        			"            </div>\r\n" + 
        			"            <div class=\"row\">\r\n" + 
        			"              <div class=\"col-md-12 hidden-xs text-right\">\r\n" + 
        			"                <a href=\"http://instagram.com\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
        			"                <a href=\"http://twitter.com\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
        			"                <a href=\"http://facebook.com\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
        			"                <a href=\"http://github.com\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
        			"              </div>\r\n" + 
        			"            </div>\r\n" + 
        			"          </div>\r\n" + 
        			"        </div>\r\n" + 
        			"      </div>\r\n" + 
        			"    </footer>\r\n" + 
        			" <!-- JavaScript -->\r\n" + 
        			"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
        			"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
        			"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
        			"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>"+
        			"  </body>\r\n" + 
        			"\r\n" + 
        			"</html>";
        	
        	
        	toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );

        	return true;
        }
        return false;
	}


}
