package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class AboutUsView extends DynamicWebPage {
	
	//constructor for web page object
	//inheriting from the dynamic web page view class and adding the database and the file store to this view
	public AboutUsView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
	}

	public boolean process(WebRequest toProcess) {
		//if about page is open
		if (toProcess.path.equalsIgnoreCase("about")) {
			String picture = "picture";
			String heading = "Heading";
			String content = "content";
			String userName = "Bronach";
			String stringToSendToWebBrowser = "<html>\r\n" + "  \r\n" + "  <head>\r\n"
					+ "    <meta charset=\"utf-8\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
					+ "    <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n"
					+ "    <script type=\"text/javascript\" src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n"
					+ "    <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n"
					+ "    rel=\"stylesheet\" type=\"text/css\">\r\n"
					+ "    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\"\r\n"
					+ "    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
					"  <!-- Required meta tags -->\r\n" + 
					"  <meta charset = \"utf-8\">\r\n" + 
					"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
					"  <!-- Bootstrap CSS -->\r\n" + 
					"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
					"  <!-- My CSS -->\r\n" + 
					"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
					"  <!-- Hover CSS -->\r\n" + 
					"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">  "
							+ "</head>\r\n" + "  \r\n" + "  <body>\r\n" +
							//nav bar
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
					"<br>"
					+"<br>"
					+"<br>"
					+ "            </li>\r\n" + "          </ul>\r\n" + "        </div>\r\n" + "      </div>\r\n"
					+ "    </div>\r\n" + "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-4 text-center\">\r\n"
					+ "            <h1 class=\"text-center\">About Us </h1>\r\n"
					+ "      </div>\r\n" + "      </div>\r\n" + "    </div>\r\n" + "    <div class=\"section\">\r\n"
					+ "      <div class=\"container\">\r\n" + "        <div class=\"row\">\r\n"
					+ "          <div class=\"col-md-12\">\r\n" + "            <h1>What we do</h1>\r\n"
					+ "          </div>\r\n" + "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
					+ "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-6\">\r\n"
					+ "            <p></p>\r\n" + "          </div>\r\n" + "        </div>\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-12\">\r\n"
					+ "            <p class=\"text-center\">We provide free information on cancers, local medical centres and medical\r\n"
					+ "              professionals to give people the help they need to making their life with\r\n"
					+ "              cancer less daunting and full of comfort and support. Our message board\r\n"
					+ "              forums allow people to share their personal experiences and advice on coping\r\n"
					+ "              with cancer.&nbsp;</p>\r\n" + "			<p>" + " </p> \r\n"
					+ "          </div>\r\n" + "</div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
					+ "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-6\">\r\n"
					//pictures saved in httpdocs
					+ "            <img src=\"./PICTURES/hands.jpg\" class=\"img-circle img-responsive\">\r\n" 
					+ "          </div>\r\n" + " <div class=\"col-md-6\">\r\n"
					+ "            <img src=\"./PICTURES/talk.jpg\" class=\"img-circle img-responsive\">\r\n" 
					+ "          </div>\r\n" + "</div>\r\n" + "</div>\r\n" + "</div>\r\n"
					+ "    <div class=\"section\">\r\n" + "<div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "<div class=\"col-md-12\">\r\n"
					+ "            <hr>\r\n" + "</div>\r\n" + "</div>\r\n" + "</div>\r\n"
					+ "    </div>\r\n" + "<div class=\"section\">\r\n" + "<div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "<div class=\"col-md-12\">\r\n"
					+ "            <p class=\"text-center\">Our aim is to help people feel connected and supported during an extremely\r\n"
					+ "              difficult, potentially isolating time in their lives. We conduct extensive\r\n"
					+ "              reasearch into differnet forms of cancer and this information is verified\r\n"
					+ "              by our qualified and reputable doctors. &nbsp;This information and research\r\n"
					+ "              should be made freely available to all people, we believe, and we aim to\r\n"
					+ "              deliver on this ethos.</p>\r\n" + "			<p> " + "</p>\r\n"
					+ "          </div>\r\n" + "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
					+ "  <div class=\"section\" style=\"\" >\r\n" + 
					"      <div class=\"container\">\r\n" + 
					"        <div class=\"row\">\r\n" + 
					"          <div class=\"col-md-12\">\r\n" + 
					"            <h1 class=\"text-center\">Meet the team</h1>\r\n" + 
					"            <div class=\"row\">\r\n" + 
					"              <div class=\"col-md-3\" style=\"\"> <img src=\"./PICTURES/boy3.jpg\" class=\"img-circle img-responsive\">\r\n" + 
					"                <h3 class=\"text-center\">James Earls</h3>\r\n" + 
					"                <p class=\"text-center\">Developer</p>\r\n" + 
					"              </div>\r\n" + 
					"              <div class=\"col-md-3\"><img src=\"./PICTURES/boy2.jpg\" class=\"img-circle img-responsive\">\r\n" + 
					"                <h3 class=\"text-center\">Pauric Donnelly</h3>\r\n" + 
					"                <p class=\"text-center\">Developer</p>\r\n" + 
					"              </div>\r\n" + 
					"              <div class=\"col-md-3\"><img src=\"./PICTURES/boy1.jpg\" class=\"img-circle img-responsive\">\r\n" + 
					"                <h3 class=\"text-center\">Arnis Dimpers</h3>\r\n" + 
					"                <p class=\"text-center\">Developer</p>\r\n" + 
					"              </div>\r\n" + 
					"              <div class=\"col-md-3\"><img src=\"/PICTURES/girlcropped.jpg\" class=\"img-circle img-responsive\">\r\n" + 
					"                <h3 class=\"text-center\">Bronach Falls</h3>\r\n" + 
					"                <p class=\"text-center\">Developer</p>\r\n" + 
					"              </div>\r\n" + 
					"            </div>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"        <footer class=\"section section-primary\">\r\n" + 
					"          <div class=\"container\">\r\n" + 
					"            <div class=\"row\">\r\n" + 
					"              <div class=\"col-sm-6\">\r\n" + 
					"                <h1>Coping With Cancer</h1>\r\n" + 
					"              </div>\r\n" + 
					"              <div class=\"col-sm-6\">\r\n" + 
					"                <div class=\"row\">\r\n" + 
					// links to social media pages
					"                  <div class=\"col-md-12 hidden-lg hidden-md hidden-sm text-left\">\r\n" + 
					"                    <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
					"                    <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
					"                    <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
					"                    <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
					"                  </div>\r\n" + 
					"                </div>\r\n" + 
					"                <div class=\"row\">\r\n" + 
					"                  <div class=\"col-md-12 hidden-xs text-right\">\r\n" + 
					"                <a href=\"http://instagram.com\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
					"                <a href=\"http://twitter.com\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
					"                <a href=\"http://facebook.com\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
					"                <a href=\"http://github.com\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
					"                  </div>\r\n" + 
					"                </div>\r\n" + 
					"              </div>\r\n" + 
					"            </div>\r\n" + 
					"          </div>\r\n" + 
					"        </footer>\r\n" + 
					"        <div class=\"section\">\r\n" + 
					"          <div class=\"container\">\r\n" + 
					"            <div class=\"row\">\r\n" + 
					"              <div class=\"col-md-12\"></div>\r\n" + 
					"            </div>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </div>\r\n" + 
					"  </div>\r\n" + 
					" <!-- JavaScript -->\r\n" + 
					"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
					"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
					"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
					"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>" +
					"</body>\r\n" + 
					"\r\n" + 
					"</html>";
			
			//sending html to web browser
			toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser);
			return true;
		}
		return false;
	}
}
