package views;

import org.h2.mvstore.MVMap;

import model.DonateDataModel;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class DonatepingendoView extends DynamicWebPage{

	//constructor for web page object
	//inheriting from the dynamic web page view class and adding the database and the file store to this view
	public DonatepingendoView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
	}
	
	// loop to add all donations in database together to produce a total so far
	public boolean process(WebRequest toProcess)
	{
	//if donate page is open
	if(toProcess.path.equalsIgnoreCase("donate"))
	{
		//open donate database
		MVMap<String, DonateDataModel> donate_Model = db.s.openMap("Donate");
		
		//initialise total variable to 0 so it can be added
		double total = 0;
		
		//initialise total variable to 0 so it can be added
		for(DonateDataModel eachDonation : donate_Model.values()) {
			System.out.println(eachDonation);
			
			// add each donation to total
			total += eachDonation.amount;
		}
		
		String userName= "Bronach";
		String stringToSendToWebBrowser = "<html>\r\n" + 
				"  \r\n" + 
				"  <head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"    <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n" + 
				"    <script type=\"text/javascript\" src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n" +
				"    <script type=\"text/javascript\" src=\"/js/donate.js\"></script>\r\n" +
				"    <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n" + 
				"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\"\r\n" + 
				"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				" <!-- Required meta tags -->\r\n" + 
				"  <meta charset = \"utf-8\">\r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"  <!-- Bootstrap CSS -->\r\n" + 
				"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
				"  <!-- My CSS -->\r\n" + 
				"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
				"  <!-- Hover CSS -->\r\n" + 
				"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">"+
				"  </head>\r\n" + 
				"  \r\n" + 
				"  <body>\r\n" + 
				
				// nav bar
				" <nav class=\"topnav navbar-expand-sm navbar navbar-dark bg-primary fixed-top justify-content-center\">\r\n" + 
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
				"</nav>    "+
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
				// pictures saved in httpdocs folder 
				"            <img src=\"./PICTURES/research.jpg\" class=\"img-circle img-responsive\">\r\n" + 
				"          </div>\r\n" + 
				"          <div class=\"col-md-6\">\r\n" + 
				"            <img src=\"./PICTURES/science.jpg\" class=\"img-circle img-responsive\">\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section text-left\">\r\n" + 
				
				// text in a container
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h1 class=\"text-center\">Donate</h1>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				//	DONATE MONEY FORM
				//"		<form>" +
				"  <div class=\"py-5\">\r\n" + 
				"    <div class=\"container\">\r\n" + 
				"      <div class=\"row\">\r\n" + 
				"        <div class=\"col-md-4\"></div>\r\n" + 
				
				// donate money button using code from donate.js 
				//input type is number so text cannot be entered
				
			
				"        <div class=\"col-md-4\"><div style=\"display: block;margin: auto;\"><input type= \"number\" name=\"amount\" id=\"donateFormID\">  " +
				"		<button type=\"button\" onclick=\"donatePress()\">Donate</button></div></div>\r\n" + 
				"        <div class=\"col-md-4\"></div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"  </div>" +
				//"		</form> " +		
				"        <div class=\"row\">\r\n" + 
				//"          <div class=\"col-md-offset-3 col-md-6\">\r\n" + 
				// Was originally going to use a form to donate money, but decided to use a button and javascript
				//"            <form role=\"form action= \"/donate_money\" method = \"/GET\"\">\r\n" + 
				//"              <div class=\"form-group\">\r\n" + 
				//"                <div class=\"input-group\">\r\n" + 
				//"                  <input type=\"number\" class=\"form-control\" name=\"Amount\">\r\n" + 
				//"                  <span class=\"input-group-btn\">\r\n" + 
				//"                    <a class=\"btn btn-success\" type=\"submit\">Donate</a>\r\n" + 
				"                </div>\r\n" +
				"                </div>\r\n" + 
				"                  </span>\r\n" + 
				"	<p1 class=\"text-center\" style=\"display: block;\">Thank you very much for your donation. It is hugely appreciated and will \r\n" + 
				"                  </span>\r\n" + 
				"              fund vital resources.</p1>\r\n" + 
				"            <h2 class=\"text-center\">Our total so far :</h2> \r\n" + 
				"        <div class=\"row\">\r\n" + 
				"<div class=\"container\">\r\n" + 
				
				/* prints the total from the for loop, which added the donations together
				 &pound; prints '£' in html 
				formatting the total, which is a double, to 2 decimal places for currency */
				
				"<h1 class=\"text-center\"> &pound;"  + String.format("%.2f", total) + "</h1> \r\n" + 
				"</div>"+
				"      </div>\r\n" +
				"              </div>\r\n" + 
				"            </form>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"    </div>\r\n" + 
				//"    <div class=\"section\">\r\n" + 
				//"      <div class=\"container\">\r\n" + 
				//"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12 text-center\">\r\n" + 
				"          </div>\r\n" + 
				//"        </div>\r\n" + 
				//"      </div>\r\n" + 
				//"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h1 class=\"text-center\">Subscribe</h1>\r\n" + 
				"          </div>\r\n" + 
				"	<p1 class=\"text-center\"> " +
				"		<p1>Enter your email address below to be kept up to date with how your donation is being used,\r\n" +
			    "		 as well as updates on our work.</p1>\r\n " +
				"        </div>\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-offset-3 col-md-6\">\r\n" + 
				// Was originally going to use a form to subscribe email, but decided to use a button and javascript
				//"            <form role=\"form\">\r\n" + 
				//"              <div class=\"form-group\">\r\n" + 
				//"                <div class=\"input-group\">\r\n" + 
				//"                  <input type=\"email\" class=\"form-control\" placeholder=\"Enter your email\">\r\n" + 
				//"                  <span class=\"input-group-btn\">\r\n" + 
				//"                    <a class=\"btn btn-success\" type=\"submit\">Go</a>\r\n" + 	
				//		SUBSCRIBE EMAIL FORM
				//"		<form action = \"subscribe_email\" method = GET>" +
				"       <input type= \"text\" name=\"email\" id=\"emailFormID\">" +
				" 		<button type=\"button\" onclick=\"subscribePress()\">Subscribe</button>" + 
				//"		</form> " +		
				"        <div class=\"row\">\r\n" + 
				"                  </span>\r\n" + 
				"                </div>\r\n" + 
				"              </div>\r\n" + 
				//"            </form>\r\n" + 
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
				// links to various social media websites
				"              <div class=\"col-md-12 hidden-lg hidden-md hidden-sm text-left\">\r\n" + 
				"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n" + 
				"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n" + 
				"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n" + 
				"                <a href=\"#\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n" + 
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
				"  </body>\r\n" + 
				"\r\n" + 
				"</html>";
	toProcess.r = new WebResponse( WebResponse.HTTP_OK,
WebResponse.MIME_HTML, stringToSendToWebBrowser );
		return true;
	}
	else if (toProcess.path.startsWith("donate_amount-")) { 
		
		String amountSubstring = toProcess.path.substring(14, toProcess.path.length());
		
		DonateDataModel donateModel = new DonateDataModel();
		
			donateModel.amount= Integer.parseInt(amountSubstring);
		
			donateModel.email= toProcess.params.get("email");
	
		MVMap<Long, DonateDataModel> donate_Model = db.s.openMap("Donate");
		donate_Model.put(System.currentTimeMillis(), donateModel);
		
		String stringToSendToWebBrowser = "" + donate_Model.size();
		toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML,
				stringToSendToWebBrowser);
		db.s.commit();
		return true;
	}
	return false;
	}
}
