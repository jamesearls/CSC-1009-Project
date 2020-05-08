package views;

import java.util.List;

import org.h2.mvstore.MVMap;

import model.MainForumPage;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class MainForumPageView extends DynamicWebPage {

	public MainForumPageView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		// TODO Auto-generated constructor stub a b
	}

	public boolean process(WebRequest toProcess) {
		if (toProcess.path.equalsIgnoreCase("forum")) {
			MainForumPage name = new MainForumPage();
			name.title = "Main Forum";
			name.topics.add("First topic");
			
			String pageName = "Main Forum";
			
			MVMap<String, MainForumPage> topicStories = db.s.openMap("MainForumPage");
			List<String> topicStoriesKeys = topicStories.keyList();
			if(topicStoriesKeys.size() == 0) {
				MainForumPage topicstories = new MainForumPage();
				topicstories.topictitle = "Can my GP get me started with cancer treatment?";
				topicstories.topictext = "When battling with cancer it is important to know that your not alone and there are people who are...";
				topicStories.put(topicstories.topictitle, topicstories);
				
				MainForumPage topicstories1 = new MainForumPage();
				topicstories.topictitle = "I was diagnosed with cancer recently, how can I cope?";
				topicstories.topictext = "";
				topicStories.put(topicstories.topictitle, topicstories);
				db.commit();
				topicStoriesKeys = topicStories.keyList();
			}
			String stringToSendToWebBrowser = "<html>\r\n" + 
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

					"            <h1 class=\"display-1 text-center\">Main Forum Page</h1>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </div>\r\n" + 
					"    <div class=\"py-5\">\r\n" + 
					"      <div class=\"container\">\r\n" + 
					"        <div class=\"row\">\r\n" + 
					"          <div class=\"col-md-12\">\r\n" + 
					"            <h2>Search up tags or topics you know of</h2>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </div>\r\n" + 
					"    <div class=\"py-5\">\r\n" + 
					"      <div class=\"container\">\r\n" + 
					"        <div class=\"row\">\r\n" + 
					"          <div class=\"col-md-12\">\r\n" + 
					"            <div class=\"panel-body\">\r\n" + 
					"              <form class=\"form-horizontal\" role=\"form\" method=\"GET\" action=\"/searchresults\">\r\n" + 
					"                <div class=\"form-group\">\r\n" + 
					"                  <div class=\"col-sm-1\">\r\n" + 
					"                    <label for=\"searchbox\" class=\"control-label\">Search</label>\r\n" + 
					"                  </div>\r\n" + 
					"                  <div class=\"col-sm-5\">\r\n" + 
					"                    <input type=\"text\" class=\"form-control\" id=\"searchbox\" name=\"searchstring\"\r\n" + 
					"                    placeholder=\"\">\r\n" + 
					"                  </div>\r\n" + 
					"                </div>\r\n" + 
					"              <button type=\"submit\" class=\"btn btn-default\">Search</button>\r\n" + 
					" </form>\r\n" + 
					"            </div>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </div>\r\n" + 
					"    <div class=\"py-5\"></div>\r\n" + 
					"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n" + 
					"    crossorigin=\"anonymous\"></script>\r\n" + 
					"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\r\n" + 
					"    integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\r\n" + 
					"    crossorigin=\"anonymous\"></script>\r\n" + 
					"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\"\r\n" + 
					"    integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\"\r\n" + 
					"    crossorigin=\"anonymous\"></script>\r\n" + 
					"    <div class=\"py-5\">\r\n" + 
					"      <div class=\"container\">\r\n" + 
					"        <div class=\"row\">\r\n" + 
					"          <div class=\"col-md-12\">\r\n" + 
					"            <h2>List of Our Current Topics</h2>\r\n" + 
					"            <a class=\"btn btn-default\" href=\"forumaddtopic\">Create a Topic</a>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </div>\r\n" + 
					"    <div class=\"section\">\r\n" + 
					"      <div class=\"container\">\r\n" + 
					"        <div class=\"row\">\r\n" + 
					"          <div class=\"col-md-12\">\r\n" + 
					"            <div class=\"col-md-12\">\r\n" + 
					"              <blockquote>\r\n";
			
			for(int index=0; index < topicStoriesKeys.size(); index++) {
				String topicStoriesUniqueID = topicStoriesKeys.get(index);
				MainForumPage topicstories = topicStories.get(topicStoriesUniqueID);
				stringToSendToWebBrowser += 
					"<div class=\"col-md-12\">\r\n" +
					"<blockquote>" +
					"<p>"+topicstories.topictitle+"</p>\r\n" +
					"<footer>"+topicstories.topictext+"</footer>\r\n" +
					"</blockquote>" +
					"</div>";
			}
					stringToSendToWebBrowser += "</blockquote>\r\n" + 
					"            </div>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					//picture here
					"    </div>\r\n" + 
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
		
		else if (toProcess.path.equalsIgnoreCase("searchresults"))
        {
        		String searchstring = toProcess.params.get("searchstring").toLowerCase();
        		
        		//String[] searchKeywords = searchstring.split(" ");
        		
        		int howmanymatches = 0;
	        	String stringToSendToWebBrowser = "\r\n" + 
						"<html><head>\r\n" + 
						"    <meta charset=\"utf-8\">\r\n" + 
						"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
						"    <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n" + 
						"    <script type=\"text/javascript\" src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n" + 
						"    <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
						"    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
						"  <!-- Required meta tags -->\r\n" + 
						"  <meta charset = \"utf-8\">\r\n" + 
						"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
						"  <!-- Bootstrap CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
						"  <!-- My CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
						"  <!-- Hover CSS -->\r\n" + 
						"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">"+
						"  </head><body>\r\n" + 
						"  <nav class=\"topnav navbar-expand-sm navbar navbar-dark bg-primary fixed-top justify-content-center\">\r\n" + 
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
	        			"<br> " + 
	        			"<br> " + 
	        			"<br> " + 
	        			"<br> " + 
	        			"<h1>You searched for: "+searchstring+"</h1><br>";
	        	stringToSendToWebBrowser += "<h1>Here's what we found:</h1>";
			MVMap<String, MainForumPage> topicStories = db.s.openMap("MainForumPage");
			int howmanymatchesEvent = 0;
			List<String> topicStoriesKeys = topicStories.keyList();
			for(int i = 0; i<topicStoriesKeys.size(); i++)
			{
				
				String uniqueid = topicStoriesKeys.get(i);
				MainForumPage forumTopics = topicStories.get(uniqueid);
				
				if(forumTopics.topictitle.toLowerCase().contains(searchstring))
				{
					stringToSendToWebBrowser += "<h1><a href=\"/forum\">"+forumTopics.topictitle+"</a></h1>\n";
					//stringToSendToWebBrowser += "<h1><a href=\"/forum"+forumTopics.uniqueid+"\">"+forumTopics.topictitle+"</a></h1>\n";
					howmanymatchesEvent++;
					
					if(howmanymatchesEvent>=3)
					{
						break;
					}
				}
			}

		
        	toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );

        	return true;
        }
		return false;
	}

}
