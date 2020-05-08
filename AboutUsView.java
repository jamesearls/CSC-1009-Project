package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class AboutUsView extends DynamicWebPage {

	public AboutUsView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
	}

	public boolean process(WebRequest toProcess) {
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
					+ "    rel=\"stylesheet\" type=\"text/css\">\r\n" + "  </head>\r\n" + "  \r\n" + "  <body>\r\n" +
					"    <div class=\"navbar navbar-default navbar-static-top\">\r\n" + 
					"      <div class=\"container\">\r\n" + 
					"        <div class=\"navbar-header\">\r\n" + 
					"          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-ex-collapse\">\r\n" + 
					"            <span class=\"sr-only\">Toggle navigation</span>\r\n" + 
					"            <span class=\"icon-bar\"></span>\r\n" + 
					"            <span class=\"icon-bar\"></span>\r\n" + 
					"            <span class=\"icon-bar\"></span>\r\n" + 
					"          </button>\r\n" + 
					"          <a class=\"navbar-brand\" href=\"#\"><span>CopingWithCancer</span></a>\r\n" + 
					"        </div>\r\n" + 
					"        <div class=\"collapse navbar-collapse\" id=\"navbar-ex-collapse\">\r\n" + 
					"          <ul class=\"nav navbar-nav navbar-right\">\r\n" + 
					"            <li class=\"active\">\r\n" + 
					"              <a href=\"/home\">Home</a>\r\n" + 
					"            </li>\r\n" + 
					"            <li>\r\n" + 
					"              <a href=\"/forum\">Forum</a>\r\n" + 
					"            </li>\r\n" + 
					"            <li>\r\n" + 
					"              <a href=\"/symptomchecker\">Symptom Checker</a>\r\n" + 
					"            </li>\r\n" + 
					"            <li>\r\n" + 
					"              <a href=\"/help\">Help &amp; appointments</a>\r\n" + 
					"            </li>\r\n" + 
					"            <li>\r\n" + 
					"              <a href=\"/donate\">Donate</a>\r\n" + 
					"            </li>\r\n" + 
					"            <li>\r\n" + 
					"              <a href=\"/about\">About Us</a>\r\n" + 
					"            </li>\r\n" + 
					"            <li>\r\n" + 
					"              <a href=\"/signup\">Sign Up</a>\r\n" + 
					"            </li>\r\n" + 
					"            <li>\r\n" + 
					"              <a href=\"/account\">My Account</a>\r\n" + 
					"            </li>\r\n" + 
					"          </ul>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </div>\r\n" 
					+ "            </li>\r\n" + "          </ul>\r\n" + "        </div>\r\n" + "      </div>\r\n"
					+ "    </div>\r\n" + "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-4 text-center\">\r\n"
					+ "            <h1 class=\"text-center\">About Us </h1>\r\n"
					+ "      </div>\r\n" + "      </div>\r\n" + "    </div>\r\n" + "    <div class=\"section\">\r\n"
					+ "      <div class=\"container\">\r\n" + "        <div class=\"row\">\r\n"
					+ "          <div class=\"col-md-12\">\r\n" + "            <h1>What we do</h1>\r\n"
					//+ "			<img src=\\\"./PICTURES/talk.jpg\\\" class=\\\"img-circle img-responsive\\\">\\r\\n\" +
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
					+ "          </div>\r\n" + "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
					+ "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-6\">\r\n"
					+ "            <img src=\"./PICTURES/hands.jpg\" class=\"img-circle img-responsive\">\r\n" 
					+ "          </div>\r\n" + "          <div class=\"col-md-6\">\r\n"
					//./PICTURES/science.jpg
					+ "            <img src=\"./PICTURES/talk.jpg\" class=\"img-circle img-responsive\">\r\n" 
					+ "          </div>\r\n" + "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
					+ "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-12\">\r\n"
					+ "            <hr>\r\n" + "          </div>\r\n" + "        </div>\r\n" + "      </div>\r\n"
					+ "    </div>\r\n" + "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-12\">\r\n"
					+ "            <p class=\"text-center\">Our aim is to help people feel connected and supported during an extremely\r\n"
					+ "              difficult, potentially isolating time in their lives. We conduct extensive\r\n"
					+ "              reasearch into differnet forms of cancer and this information is verified\r\n"
					+ "              by our qualified and reputable doctors. &nbsp;This information and research\r\n"
					+ "              should be made freely available to all people, we believe, and we aim to\r\n"
					+ "              deliver on this ethos.</p>\r\n" + "			<p> " + "</p>\r\n"
					+ "          </div>\r\n" + "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
					+ "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-12\">\r\n"
					+ "            <h1 class=\"text-center\">Meet the team</h1>\r\n"
					+ "            <p class=\"text-center\"></p>\r\n" + "          </div>\r\n" + "        </div>\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-3\">\r\n"
					+ "            <img src=\"http://pingendo.github.io/pingendo-bootstrap/assets/user_placeholder.png\"\r\n"
					+ "            class=\"center-block img-circle img-responsive\">\r\n"
					+ "            <h3 class=\"text-center\">James Earls</h3>\r\n"
					+ "            <p class=\"text-center\">Developer</p>\r\n" + "          </div>\r\n"
					+ "          <div class=\"col-md-3\">\r\n"
					+ "            <img src=\"http://pingendo.github.io/pingendo-bootstrap/assets/user_placeholder.png\"\r\n"
					+ "            class=\"center-block img-circle img-responsive\">\r\n"
					+ "            <h3 class=\"text-center\">Pauric Donnelly</h3>\r\n"
					+ "            <p class=\"text-center\">Developer</p>\r\n" + "          </div>\r\n"
					+ "          <div class=\"col-md-3\">\r\n"
					+ "            <img src=\"http://pingendo.github.io/pingendo-bootstrap/assets/user_placeholder.png\"\r\n"
					+ "            class=\"center-block img-circle img-responsive\">\r\n"
					+ "            <h3 class=\"text-center\">Arnis Dimpers</h3>\r\n"
					+ "            <p class=\"text-center\">Developer</p>\r\n" + "          </div>\r\n"
					+ "          <div class=\"col-md-3\">\r\n"
					+ "            <img src=\"http://pingendo.github.io/pingendo-bootstrap/assets/user_placeholder.png\"\r\n"
					+ "            class=\"center-block img-circle img-responsive\">\r\n"
					+ "            <h3 class=\"text-center\">Bronach Falls</h3>\r\n"
					+ "            <p class=\"text-center\">Developer</p>\r\n" + "          </div>\r\n"
					+ "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
					+ "    <footer class=\"section section-primary\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-sm-6\">\r\n"
					+ "            <h1>Coping With Cancer</h1>\r\n" + "            <p></p>\r\n" + "          </div>\r\n"
					+ "          <div class=\"col-sm-6\">\r\n" + "            <p class=\"text-info text-right\">\r\n"
					+ "              <br>\r\n" + "              <br>\r\n" + "            </p>\r\n"
					+ "            <div class=\"row\">\r\n"
					+ "              <div class=\"col-md-12 hidden-lg hidden-md hidden-sm text-left\">\r\n"
					+ "                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n"
					+ "                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n"
					+ "                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n"
					+ "                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n"
					+ "              </div>\r\n" + "            </div>\r\n" + "            <div class=\"row\">\r\n"
					+ "              <div class=\"col-md-12 hidden-xs text-right\">\r\n"
					+ "                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n"
					+ "                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n"
					+ "                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n"
					+ "                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n"
					+ "              </div>\r\n" + "            </div>\r\n" + "          </div>\r\n"
					+ "        </div>\r\n" + "      </div>\r\n" + "    </footer>\r\n"
					+ "    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-md-12\"></div>\r\n"
					+ "        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n" + "  </body>\r\n" + "\r\n"
					+ "</html>";
			toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser);
			return true;
		}
		return false;
	}
}
