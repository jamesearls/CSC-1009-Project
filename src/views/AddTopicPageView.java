package views;

import org.h2.mvstore.MVMap;

import model.MainForumPage;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class AddTopicPageView extends DynamicWebPage {

	public AddTopicPageView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		// TODO Auto-generated constructor stub a
	}

	public boolean process(WebRequest toProcess) {
		if (toProcess.path.equalsIgnoreCase("forumaddtopic")) {
			String stringToSendToWebBrowser = "\r\n" + 
					"<html><head>\r\n" + 
					
					"  <!-- Required meta tags -->\r\n" + 
					"    <meta charset=\"utf-8\">\r\n" + 
					"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
					"    <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n" + 
					"    <script type=\"text/javascript\" src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n" + 
					"    <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
					"    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
					"  <meta charset = \"utf-8\">\r\n" + 
					"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
					"  <!-- Bootstrap CSS -->\r\n" + 
					"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
					"  <!-- My CSS -->\r\n" + 
					"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
					"  <!-- Hover CSS -->\r\n" + 
					"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">\r\n" + 
					"  <title>Sign Upr</title>"+
					"  </head><body>\r\n" + 
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
					"<br> " +
					"<br> " +
					"<br> " +
					"<br> " +
					"    <h1>Add a Topic</h1>\r\n" + 
					"    <form method=\"post\" action=\"/addtopicprocess\">\r\n" + 
					"      <p>\r\n" + 
					"        <strong>Topic Title:</strong>\r\n" + 
					"        <br>\r\n" + 
					"        <input type=\"text\" name=\"title\" size=\"40\" maxlength=\"150\">\r\n" + 
					"      </p>\r\n" + 
					"      <p>\r\n" + 
					"        <strong>Post Text:</strong>\r\n" + 
					"        <br>\r\n" + 
					"        <textarea name=\"description\" rows=\"8\" cols=\"40\" wrap=\"virtual\"></textarea>\r\n" + 
					"      </p>\r\n" + 
					"      <p>\r\n" + 
					"        <input type=\"submit\" name=\"submit\" value=\"Add Topic\">\r\n" + 
					"      </p>\r\n" + 
					"    </form>\r\n" + 
					"  \r\n" + 
					"\r\n" + 
					"</body></html>";
			toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser);
			return true;
		}
		else if(toProcess.path.equalsIgnoreCase("addtopicprocess")) {
			MainForumPage topicstory = new MainForumPage();
			topicstory.uniqueid = "topic_"+System.currentTimeMillis();
			topicstory.topictitle = toProcess.params.get("title");
			topicstory.topictext = toProcess.params.get("description");
			MVMap<String, MainForumPage> topicStories = db.s.openMap("MainForumPage");
			topicStories.put(topicstory.uniqueid, topicstory);
			String stringToSendToWebBrowser = "<html><body><p>Topic Successfully Added.</p><a href=\"forum\">Return to Forum page</a></body></html>";
			toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML,
					stringToSendToWebBrowser);

			return true;
		}
		return false;
	}

}
