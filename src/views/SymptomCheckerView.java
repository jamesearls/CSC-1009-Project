package views;



import java.util.ArrayList;
import java.util.List;

import org.h2.mvstore.MVMap;

import model.SymptomCheckerAnswers;
import model.SymptomCheckerQuestions;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.*;

public class SymptomCheckerView extends DynamicWebPage{

	public SymptomCheckerView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean process(WebRequest toProcess) {
		if(toProcess.path.equalsIgnoreCase("symptomchecker"))
		{							
		String stringToSendToWebBrowser = "<html>\r\n" + 
				"  \r\n" + 
				"  <head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				 "<link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n" + 
				"    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\"\r\n" + 
				"    rel=\"stylesheet\" type=\"text/css\">\r\n" +
				"    <script type=\"text/javascript\" src=\"/js/validateSymptomCheckerUserQuestionForm.js\"></script>\r\n" +
				"    <script type=\"text/javascript\" src=\"/js/validateSymptomCheckerRadioButtons.js\"></script>\r\n" +
			    "  <!-- Required meta tags -->\r\n" + 
				"  <meta charset = \"utf-8\">\r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"  <!-- Bootstrap CSS -->\r\n" + 
				"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
				"  <!-- My CSS -->\r\n" + 
				"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
				"  <!-- Hover CSS -->\r\n" + 
				"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">    " +
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
				"<br>" + 
				"<br>" + 
				"<br>" + 
				"    <div class=\"section\" draggable=\"true\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h1 class=\"text-center\">Symptom Checker</h1>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h3 class=\"text-center\">Check the symptom checker to see whether you are at risk and may have\r\n" + 
				"              cancer.\r\n" + 
				"              <br>*PLEASE NOTE* This is NOT a substitute for a doctor</h3>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <!--This is the break between HTML page and data model-->\r\n" + 
				"    <!----this-->\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h4>Have you had a persistent cough that has lasted at least 1 month</h4>\r\n" + 
				"            <form action=\"symptomanalysis\" onsubmit=\"return validateRadioButtons()\" method=\"GET\">\r\n" + 
				"               Yes\r\n" + 
				"              <input type=\"radio\" name=\"q1\" value=\"yes\">\r\n" + 
				"              <br>No\r\n" + 
				"              <input type=\"radio\" name=\"q1\" value=\"no\">\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"section\">\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"          <div class=\"row\">\r\n" + 
				"            <div class=\"col-md-12\">\r\n" + 
				"              <h4>Have you noticed a change in your bowel habits (ie. Diarrhea)</h4>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"col-md-12\">\r\n" +  
				"                Yes\r\n<input type=\"radio\" name=\"q2\" value=\"yes\">\r\n" + 
				"                <br>No\r\n" + 
				"                <input type=\"radio\" name=\"q2\" value=\"no\">\r\n" +  
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"section\">\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"          <div class=\"row\">\r\n" + 
				"            <div class=\"col-md-12\">\r\n" + 
				"              <h4>Have you noticed any lumps on your body (ie. on your breasts or your testicles)</h4>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"col-md-12\">\r\n" + 
				"				Yes\r\n" + 
				"                <input type=\"radio\" name=\"q3\" value=\"yes\">\r\n" + 
				"                <br>No\r\n" + 
				"                <input type=\"radio\" name=\"q3\" value=\"no\">\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"section\">\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"          <div class=\"row\">\r\n" + 
				"            <div class=\"col-md-12\">\r\n" + 
				"              <h4>Have you noticed an increase in the appearence of warts on your body?</h4>\r\n" + 
				"              Yes\r\n" + 
				"                <input type=\"radio\" name=\"q4\" value=\"yes\">\r\n" + 
				"                <br>No\r\n" + 
				"                <input type=\"radio\" name=\"q4\" value=\"no\">\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"section\">\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"          <div class=\"row\">\r\n" + 
				"            <div class=\"col-md-12\">\r\n" + 
				"              <h4>Have you been suffering from indigestion or have difficulty swallowing?</h4>\r\n" + 
				"              Yes\r\n" + 
				"                <input type=\"radio\" name=\"q5\" value=\"yes\">\r\n" + 
				"                <br>No\r\n" + 
				"                <input type=\"radio\" name=\"q5\" value=\"no\">\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"section\">\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"          <div class=\"row\">\r\n" + 
				"            <div class=\"col-md-12\">\r\n" + 
				"              <h4>Have you been feeling like you've been having night sweats, increased\r\n" + 
				"                weight loss or a fever?</h4>\r\n" + 
				"              Yes\r\n" + 
				"                <input type=\"radio\" name=\"q6\" value=\"yes\">\r\n" + 
				"                <br>No\r\n" + 
				"                <input type=\"radio\" name=\"q6\" value=\"no\">\r\n" +  
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"section\">\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"          <div class=\"row\">\r\n" + 
				"            <div class=\"col-md-12\">\r\n" + 
				"              <h4>Have you been experiencing any joint or back pain?</h4>\r\n" + 
				"              Yes\r\n" + 
				"                <input type=\"radio\" name=\"q7\" value=\"yes\">\r\n" + 
				"                <br>No\r\n" + 
				"                <input type=\"radio\" name=\"q7\" value=\"no\">\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"section\">\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"          <div class=\"row\">\r\n" + 
				"            <div class=\"col-md-12\">\r\n" + 
				"                <input type=\"submit\" onclick=\"return validateRadioButtons()\" value=\"Check Your Symptoms\">\r\n" + 
				"              </form>\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <h2 class=\"text-center\">If there is a question that should be included, please add them below.\r\n" + 
				"            (Please keep questions limited to yes and no answers)\r\n" + 
				"            </h2>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <div class=\"row\">\r\n" + 
				"          <div class=\"col-md-12\">\r\n" + 
				"            <form name=\"addQuestion\" action=\"/addquestionprocess\" onsubmit=\"return validateForm()\" method=\"/GET\">\r\n" + 
				"              Question:<br>\r\n" + 
				"              <input type=\"text\" name=\"question\"><br>\r\n" + 
				"              <input type=\"submit\" value=\"Submit\">\r\n" +
				 "    <footer class=\"section section-primary\">\r\n" + "      <div class=\"container\">\r\n"
				+ "        <div class=\"row\">\r\n" + "          <div class=\"col-sm-6\">\r\n"
				+ "            <h1>Coping With Cancer</h1>\r\n" + "            <p></p>\r\n" + "          </div>\r\n"
				+ "          <div class=\"col-sm-6\">\r\n" + "            <p class=\"text-info text-right\">\r\n"
				+ "              <br>\r\n" + "              <br>\r\n" + "            </p>\r\n"
				+ "            <div class=\"row\">\r\n"
				+ "              <div class=\"col-md-12 hidden-lg hidden-md hidden-sm text-left\">\r\n"
				+ "                <a href=\"http://instagram.com\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n"
				+ "                <a href=\"http://twitter.com\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n"
				+ "                <a href=\"http://facebook.com\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n"
			    + "                <a href=\"http://github.com\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n"
				 +"              </div>\r\n" + "            </div>\r\n" + "            <div class=\"row\">\r\n"
				 +"              <div class=\"col-md-12 hidden-xs text-right\">\r\n"
				 +"                <a href=\"http://instagram.com\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n"
				 +"                <a href=\"http://twitter.com\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n"
				 +"                <a href=\"http://facebook.com\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n"
				+"                <a href=\"http://github.com\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a><br>\r\n"
				 +"              </div>\r\n" + "            </div>\r\n" + "          </div>\r\n"
				 +"        </div>\r\n" + "      </div>\r\n" + "    </footer>\r\n"
				 +"    <div class=\"section\">\r\n" + "      <div class=\"container\">\r\n"
				 +"        <div class=\"row\">\r\n" + "          <div class=\"col-md-12\"></div>\r\n"
				 +"        </div>\r\n" + "      </div>\r\n" + "    </div>\r\n"
				+"            </form>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"</body>"
			+ "</html>"; 
		toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
		return true;
		}
		else if(toProcess.path.equalsIgnoreCase("addquestionprocess")) {
			SymptomCheckerQuestions userQuestion = new SymptomCheckerQuestions();
			userQuestion.uniqueID = "question_"+System.currentTimeMillis();
			userQuestion.question = toProcess.params.get("question");
			
			//Adding the question to the database
			MVMap<String, SymptomCheckerQuestions> userQuestions = db.s.openMap("UserQuestions");
			userQuestions.put(userQuestion.uniqueID, userQuestion);
			
			String stringToSendToWebBrowser = "<html><head>\r\n" + 
					"				    <meta charset=\"utf-8\">\r\n" + 
					"				    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
					"				   <script type=\"text/javascript\" src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n" + 
					"				   <script type=\"text/javascript\" src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n" + 
					"				    <link href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n" + 
					"				    rel=\"stylesheet\" type=\"text/css\">\r\n" + 
					"				    <link href=\"http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css\"\r\n" + 
					"				    rel=\"stylesheet\" type=\"text/css\">\r\n" +
					"<!-- Required meta tags -->\r\n" + 
					"  <meta charset = \"utf-8\">\r\n" + 
					"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
					"  <!-- Bootstrap CSS -->\r\n" + 
					"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
					"  <!-- My CSS -->\r\n" + 
					"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
					"  <!-- Hover CSS -->\r\n" + 
					"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">    " +
					"				  </head>\r\n" 
					+ "<body>\r\n" +
					"    <nav class=\"topnav navbar-expand-sm navbar navbar-dark bg-primary fixed-top justify-content-center\">\r\n" + 
					"     <a class=\"navbar-brand hvr-grow-shadow\" href=\"/home\">Coping With Cancer</a>\r\n" + 
					"		<!-- Toggler/collapsibe Button -->\r\n" +
					"		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n" + 
					"		<span class=\"navbar-toggler-icon\"></span>\r\n" + 
					"			 </button>\r\n" + 
					"				<!-- Navbar links -->\r\n" + 
					"				<div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n" + 
					"				<ul class=\"navbar-nav\">\r\n" +
					"				<li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
					"				<a class=\"nav-link\" href=\"/home\">Home</a>\r\n" +
					"				</li>\r\n" +
					"				<li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
					"				<a class=\"nav-link\" href=\"/forum\">Forum</a>\r\n" + 
					"				</li>\r\n" +
					"				<li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
					"				<a class=\"nav-link\" href=\"/symptomchecker\">Symptom Checker</a>\r\n" + 
					"				</li>\r\n" + 
					"				<li class=\"nav-item hvr-grow-shadow\">\r\n" + 
					"				<a class=\"nav-link\" href=\"/help\">Help & Appointments</a>\r\n" +
					"				</li>\r\n" +
					"				<li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
					"				<a class=\"nav-link\" href=\"/donate\">Donate</a>\r\n" + 
					"				</li>\r\n" + 
					"				<li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
					"				<a class=\"nav-link\" href=\"/about\">About Us</a>\r\n" + 
					"				</li>\r\n" +
					"				</ul>\r\n" +
					"				\r\n" +
					"				<ul class=\"navbar-nav ml-auto\">\r\n" + 
					"				<li class=\"nav-item hvr-grow-shadow\">\r\n" + 
					"				<a class=\"nav-link\" href=\"/signup\">Sign Up</a>\r\n" +
					"				</li>\r\n" + 
					"				<li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
					"				<a class=\"nav-link\" href=\"/account\">My Account</a>\r\n" +
					"				</li>\r\n" +  
					"				</ul>\r\n" + 
					"				</div>\r\n"+
					"				\r\n"+
					"				</nav>\"+\r\n" + 
					"				<br>\r\n" + 
					"				<br>\"\r\n" + 
					"				<br>\"" + 
					"<br><h1 class=\"text-left\">Your Question was added - " + userQuestion.question + 
					"<div class=\"container\">\r\n" +
					"  <div class =\"row\">\r\n" +
					"   <div class=\"col\">\r\n" +
					"    </div>\r\n" +
					"   <div class=\"col\">\r\n" +
					"</h1><a href=\"home\" style=\"font-size:20px;\">Back To Home</a>\r\n"+
					"</div>\r\n" +
					"<div class=\"col\">\r\n" +
					"</div>\r\n" +
					"</div>\r\n" +
					"</div>\r\n" +					
					"<h2 class=\"text-left\">Here is a list of previously submitted questions</h2>";
		    
			List<String> userQuestionsKeys = userQuestions.keyList();
		    if(userQuestionsKeys.size() == 0) {
		    	SymptomCheckerQuestions exampleQuestion = new SymptomCheckerQuestions();
		    	exampleQuestion.question = "Do you feel a constant hoarseness in your voice?";
		    	userQuestions.put(exampleQuestion.question, exampleQuestion);
		    	db.commit();
		    	userQuestionsKeys = userQuestions.keyList();
		    }
		    
		    for(int i = 0; i < userQuestionsKeys.size(); i++) {
		    	String userQuestionUniqueID = userQuestionsKeys.get(i);
		    	SymptomCheckerQuestions submittedQuestion = userQuestions.get(userQuestionUniqueID);
		    	stringToSendToWebBrowser += "<h3 class=\"text-left\">"+submittedQuestion.question+"</h3><br>";
		    }
		    
		    stringToSendToWebBrowser += "    <footer class=\"section section-primary\">\r\n" + "      <div class=\"container\">\r\n"
					+ "        <div class=\"row\">\r\n" + "          <div class=\"col-sm-6\">\r\n"
					+ "            <h1>Coping With Cancer</h1>\r\n" + "            <p></p>\r\n" + "          </div>\r\n"
					+ "          <div class=\"col-sm-6\">\r\n" + "            <p class=\"text-info text-right\">\r\n"
					+ "              <br>\r\n" + "              <br>\r\n" + "            </p>\r\n"
					+ "            <div class=\"row\">\r\n"
					+ "              <div class=\"col-md-12 hidden-lg hidden-md hidden-sm text-left\">\r\n"
					+ "                <a href=\"http://instagram.com\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n"
					+ "                <a href=\"http://twitter.com\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n"
					+ "                <a href=\"http://facebook.com\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n"
				    + "                <a href=\"http://github.com\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a>\r\n"
					 +"              </div>\r\n" + "            </div>\r\n" + "            <div class=\"row\">\r\n"
					 +"              <div class=\"col-md-12 hidden-xs text-right\">\r\n"
					 +"                <a href=\"http://instagram.com\"><i class=\"fa fa-3x fa-fw fa-instagram text-inverse\"></i></a>\r\n"
					 +"                <a href=\"http://twitter.com\"><i class=\"fa fa-3x fa-fw fa-twitter text-inverse\"></i></a>\r\n"
					 +"                <a href=\"http://facebook.com\"><i class=\"fa fa-3x fa-fw fa-facebook text-inverse\"></i></a>\r\n"
					+"                <a href=\"http://github.com\"><i class=\"fa fa-3x fa-fw fa-github text-inverse\"></i></a><br>\r\n"
					 +"              </div>\r\n" + "            </div>\r\n" + "          </div>\r\n"
					 +"        </div>\r\n" + "      </div>\r\n" + "    </footer>\r\n" +
					 "</body></html>";
			
		    toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );					
			return true;
		}
		
		else if(toProcess.path.equalsIgnoreCase("symptomanalysis")) {
			String stringToSendToWebBrowser = "";
			try {
			SymptomCheckerAnswers userAnswers = new SymptomCheckerAnswers();
			userAnswers.uniqueID = "answer_"+System.currentTimeMillis();
			userAnswers.answer1 = toProcess.params.get("q1");
			userAnswers.answer2 = toProcess.params.get("q2");
			userAnswers.answer3 = toProcess.params.get("q3");
			userAnswers.answer4 = toProcess.params.get("q4");
			userAnswers.answer5 = toProcess.params.get("q5");
			userAnswers.answer6 = toProcess.params.get("q6");
			userAnswers.answer7 = toProcess.params.get("q7");
			userAnswers.answerArrayList = new ArrayList<String>();
			userAnswers.answerArrayList.add(userAnswers.uniqueID);
			userAnswers.answerArrayList.add(userAnswers.answer1);
			userAnswers.answerArrayList.add(userAnswers.answer2);
			userAnswers.answerArrayList.add(userAnswers.answer3);
			userAnswers.answerArrayList.add(userAnswers.answer4);
			userAnswers.answerArrayList.add(userAnswers.answer5);
			userAnswers.answerArrayList.add(userAnswers.answer6);
			userAnswers.answerArrayList.add(userAnswers.answer7);
			
			MVMap<String, SymptomCheckerAnswers> userSubmittedAnswers = db.s.openMap("UserAnswers");
			userSubmittedAnswers.put(userAnswers.uniqueID, userAnswers);
			int yesCount = 0;
			int noCount = 0;
			
			for(int i = 0; i < userAnswers.answerArrayList.size(); i++) {
				if(userAnswers.answerArrayList.get(i).equalsIgnoreCase("yes")) {
					yesCount++;
				}
				else if(userAnswers.answerArrayList.get(i).equalsIgnoreCase("no")) {
					noCount++;
				}
			}
			
			
			if((noCount > yesCount) && (noCount + yesCount ==7)) {

				stringToSendToWebBrowser = "<html>\r\n" + 
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
						"<!-- Required meta tags -->\\r\\n\" + \r\n" + 
						"<meta charset = \"utf-8\">\r\n" + 
						"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
						"<!-- Bootstrap CSS -->\r\n" + 
						"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
						"<!-- My CSS -->\r\n\"" + 
						"<link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
						"<!-- Hover CSS -->\r\n\"" + 
						"<link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">\r\n"+
						"  </head>\r\n" + 
						"  <body>\r\n" + 
						     "<nav class=\"topnav navbar-expand-sm navbar navbar-dark bg-primary fixed-top justify-content-center\">\r\n" + 
								" <a class=\"navbar-brand hvr-grow-shadow\" href=\"/home\">Coping With Cancer</a>\r\n" + 
								" <!-- Toggler/collapsibe Button -->\r\n" + 
								" <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n" + 
								"    <span class=\"navbar-toggler-icon\"></span>\r\n" + 
								" </button>\r\n" + 
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
								"      <ul class=\"navbar-nav ml-auto\">\r\n" + 
								"        <li class=\"nav-item hvr-grow-shadow\">\r\n" + 
								"          <a class=\"nav-link\" href=\"/signup\">Sign Up</a>\r\n" + 
								"        </li>\r\n" + 
								"        <li class=\"nav-item  hvr-grow-shadow\">\r\n" + 
								"          <a class=\"nav-link\" href=\"/account\">My Account</a>\r\n" + 
								"        </li>\r\n" + 
								"      </ul>\r\n" + 
								"    </div>\r\n" + 
								"</nav>"+
								"<br>" + 
								"<br>" + 
								"<br>" +  
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12\">\r\n" + 
						"            <div class=\"page-header text-center\">\r\n" + 
						"              <h1>Symptom Checker\r\n" + 
						"                <small>Results</small>\r\n" + 
						"              </h1>\r\n" + 
						"            </div>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12\">\r\n" + 
						"            <h2 class=\"text-center\">You do not seem to show a lot of Symptoms that you may have cancer therefore\r\n" + 
						"              you may not need to see a doctor</h2>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12 text-center\">\r\n" + 
						"            <img src=\"PICTURES\\doctor_good_news.jpg\" class=\"center-block img-responsive\">\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-10\">\r\n" + 
						"            <a href=\"/home\" style=\"font-size: 30px;\" text-anchor=\"middle\">Click here to go back to the home page</a>\r\n" + 
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
						"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>" +
						"  </body>\r\n" + 
						"\r\n" + 
						"</html>";


			}
			else if(yesCount > noCount && (noCount + yesCount ==7)) {
				stringToSendToWebBrowser = "<html>\r\n" + 
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
						"<!-- Required meta tags -->\r\n" + 
						"  <meta charset = \"utf-8\">\r\n" + 
						"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
						"  <!-- Bootstrap CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
						"  <!-- My CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
						"  <!-- Hover CSS -->\r\n" + 
						"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">    " +
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
								"<br>" + 
								"<br>" + 
								"<br>" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12\">\r\n" + 
						"            <div class=\"page-header text-center\">\r\n" + 
						"              <h1>Symptom Checker\r\n" + 
						"                <small>Results</small>\r\n" + 
						"              </h1>\r\n" + 
						"            </div>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12\">\r\n" + 
						"            <h2 class=\"text-center\">You seem to show a lot of Symptoms that you may have cancer therefore\r\n" + 
						"              you may need to see a doctor</h2>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12 text-center\">\r\n" + 
						"            <img src=\"PICTURES\\106383125-serious-doctor-consulting-and-diagnose-desperate-woman-saying-bad-test-results-relapse-healthcare-an.jpg\"\r\n" + 
						"            class=\"img-responsive\">\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-10\">\r\n" + 
						"            <a href=\"/help\" style=\"font-size: 30px;\" text-anchor=\"middle\">Click here to see what help and appointments may be available to you</a>\r\n" + 
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
						"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>" +
						"  </body>\r\n" + 
						"\r\n" + 
						"</html>";
				
			}
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
			}
			catch(Exception ex) {
				stringToSendToWebBrowser = "<html>\r\n" + 
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
						"<!-- Required meta tags -->\r\n" + 
						"  <meta charset = \"utf-8\">\r\n" + 
						"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
						"  <!-- Bootstrap CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
						"  <!-- My CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
						"  <!-- Hover CSS -->\r\n" + 
						"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">    " +
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
								"<br>" + 
								"<br>" + 
								"<br>" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12\">\r\n" + 
						"            <div class=\"page-header text-center\">\r\n" + 
						"              <h1>Symptom Checker\r\n" + 
						"                <small>Results</small>\r\n" + 
						"              </h1>\r\n" + 
						"            </div>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" + 
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-12\">\r\n" + 
						"            <h2 class=\"text-center\">There was an error with the symptom Checker, please try again</h2>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>\r\n" + 
						"    </div>\r\n" +  
						"    <div class=\"section\">\r\n" + 
						"      <div class=\"container\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col-md-10\">\r\n" + 
						"            <a href=\"/symptomchecker\" style=\"font-size: 30px;\" text-anchor=\"middle\">Back to the symptom checker</a>\r\n" + 
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
						"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>" +
						"  </body>\r\n" + 
						"\r\n" + 
						"</html>";
				toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
				return true;
				
			}
			
		}

		return false;
	}

}
