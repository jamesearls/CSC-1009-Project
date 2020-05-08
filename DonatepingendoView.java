package views;

import org.h2.mvstore.MVMap;

import model.DataModel;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class DonatepingendoView extends DynamicWebPage{

	public DonatepingendoView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		
	}
public boolean process(WebRequest toProcess)
	{
	if(toProcess.path.equalsIgnoreCase("donate"))
	{
		String userName= "Bronach";
		String stringToSendToWebBrowser = "<html>\r\n" + 
				"  \r\n" + 
				"  <head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"    <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n" + 
				"    <script type=\"text/javascript\" src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n" + 
				"    <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n" + 
				"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\"\r\n" + 
				"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"  </head>\r\n" + 
				"  \r\n" + 
				"  <body>\r\n" + 
				"    <div class=\"navbar navbar-default navbar-static-top\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"navbar-header\">\r\n" + 
				"    <div class=\"navbar navbar-default navbar-static-top\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"navbar-header\">\r\n" + 
				"          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-ex-collapse\">\r\n" + 
				"            <span class=\"sr-only\">Toggle navigation</span>\r\n" + 
				"            <span class=\"icon-bar\"></span>\r\n" + 
				"            <span class=\"icon-bar\"></span>\r\n" + 
				"            <span class=\"icon-bar\"></span>\r\n" + 
				"          </button>\r\n" + 
				"          <a class=\"navbar-brand\"><span>Coping With Cancer</span></a>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"collapse navbar-collapse\" id=\"navbar-ex-collapse\">\r\n" + 
				"          <ul class=\"nav navbar-nav navbar-right\">\r\n" + 
				"            <li class=\"active\">\r\n" + 
				"              <a href=\"/Home\">Home</a>\r\n" + 
				"            </li>\r\n" + 
				"            <li>\r\n" + 
				"              <a href=\"/mainForumPage\">Forum</a>\r\n" + 
				"            </li>\r\n" + 
				"            <li>\r\n" + 
				"              <a href=\"/SymptomChecker\">Symptom Checker</a>\r\n" + 
				"            </li>\r\n" + 
				"            <li>\r\n" + 
				"              <a href=\"/help\">Help &amp; appointments</a>\r\n" + 
				"            </li>\r\n" + 
				"            <li>\r\n" + 
				"              <a href=\"/DonatePage\">Donate</a>\r\n" + 
				"            </li>\r\n" + 
				"            <li>\r\n" + 
				"              <a href=\"/AboutUspage\">About Us</a>\r\n" + 
				"            </li>\r\n" + 
				"            <li>\r\n" + 
				"              <a href=\"/signUp\">Sign Up</a>\r\n" + 
				"            </li>\r\n" + 
				"            <li>\r\n" + 
				"              <a href=\"/yourAccountPage\">My Account</a>\r\n" + 
				"            </li>\r\n" + 
				"          </ul>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h1 class=\"text-center\">Donate </h1>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h1>Make a donation</h1>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <p class=\"text-center\">We warmly welcome any and all donations to assist in the research and\r\n" + 
				"              treatment of cancer. With any donation you make, we can keep you updated\r\n" + 
				"              via email on how your valuable money is being used to help improve the\r\n" + 
				"              lives of thousands.&nbsp;</p>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-6\">\r\n" + 
				"            <img src=\"./PICTURES/research.jpg\" class=\"img-circle img-responsive\">\r\n" + 
				"          </div>\r\n" + 
				"          <div class=\"col-md-6\">\r\n" + 
				"            <img src=\"./PICTURES/science.jpg\" class=\"img-circle img-responsive\">\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section text-left\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h1 class=\"text-center\">Donate</h1>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"		<form action =  \"donate_money\" method = GET>" +
				"		<input type= \"number\" name=\"amount\"> "+
				" 		<input type=\"submit\" value=\"Donate\">" +
				"		</form> " +		
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-offset-3 col-md-6\">\r\n" + 
				//"            <form role=\"form action= \"/donate_money\" method = \"/GET\"\">\r\n" + 
				//"              <div class=\"form-group\">\r\n" + 
				//"                <div class=\"input-group\">\r\n" + 
				//"                  <input type=\"number\" class=\"form-control\" name=\"Amount\">\r\n" + 
				//"                  <span class=\"input-group-btn\">\r\n" + 
				//"                    <a class=\"btn btn-success\" type=\"submit\">Donate</a>\r\n" + 
				"                  </span>\r\n" + 
				"                </div>\r\n" + 
				"              </div>\r\n" + 
				"            </form>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12 text-center\">\r\n" + 
				"            <p>Thank you very much for your donation. It is hugely appreciated and will\r\n" + 
				"              fund vital resources.&nbsp;</p>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h1 class=\"text-center\">Subscribe</h1>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-offset-3 col-md-6\">\r\n" + 
				//"            <form role=\"form\">\r\n" + 
				//"              <div class=\"form-group\">\r\n" + 
				//"                <div class=\"input-group\">\r\n" + 
				//"                  <input type=\"email\" class=\"form-control\" placeholder=\"Enter your email\">\r\n" + 
				//"                  <span class=\"input-group-btn\">\r\n" + 
				//"                    <a class=\"btn btn-success\" type=\"submit\">Go</a>\r\n" + 
				"		<form action = \"donate_money\" method = GET>" +
				"		<input type= \"text\" name=\"email\">" +
				" 		<input type=\"submit\" value=\"Subscribe\"> " +
				"		</form> " +		
				"        <div class=\"row\">\r\n" + 
				"                  </span>\r\n" + 
				"                </div>\r\n" + 
				"              </div>\r\n" + 
				"            </form>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <footer class=\"section section-primary\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-sm-6\">\r\n" + 
				"            <h1>Coping With Cancer</h1>\r\n" + 
				"            <p></p>\r\n" + 
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
	toProcess.r = new WebResponse( WebResponse.HTTP_OK,
WebResponse.MIME_HTML, stringToSendToWebBrowser );
		return true;
	}
	else if (toProcess.path.equalsIgnoreCase("donate_money")) { 
		
		DataModel donateModel = new DataModel();

		donateModel.amount= toProcess.params.get("amount");
		donateModel.email= toProcess.params.get("email");
		
		MVMap<String, DataModel> donate_Model =
				db.s.openMap("Donate");
		donate_Model.put(donateModel.email, donateModel);
		String stringToSendToWebBrowser = "<html><body><p>Object added</p><a href=\"donate.html\">Home</a></body></html>";
		//change index to homepage
		toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML,
						stringToSendToWebBrowser);
		return true;
	}
	return false;
	}
}
