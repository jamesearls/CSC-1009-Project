package views;

import java.util.List;

import org.h2.mvstore.MVMap;

import model.Account;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class AccountListView extends DynamicWebPage {

	public AccountListView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
	}
	
	//first page
	public boolean process(WebRequest toProcess)
	{
        if(toProcess.path.equalsIgnoreCase("accountlist"))
        {
        	
        	MVMap<String, Account>accounts = db.s.openMap("accounts");
        	List<String> accountKeys = accounts.keyList();
        	
        	String stringToSendToWebBrowser = "<html>\r\n" + 
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
        			"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">" +
        			"  </head>\r\n" + 
        			"  \r\n" + 
        			"  <body>\r\n" + 
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
					"</nav>"+ 
					"<br>"+
					"<br>"+
					"<br>"+
					"<div class=\"Container\">" +
        			"    <h1>Account List</h1>\r\n" + 
        			"    <h4>Accounts from Database:</h4>\r\n";
        			
        			 
        	
        	if(accountKeys.size()==0) {
        		Account account = new Account();
        		account.uniqueId="account_"+System.currentTimeMillis();
        		account.emailAddress = "brian.rogran@gmail.com";
        		account.username="Brian";
        		account.password="Rogan";
        		account.confirmedPassword="Rogan";
        		accounts.put(account.uniqueId, account);
        		db.commit();
        		accountKeys = accounts.keyList();
        	}
 
        	for(int index=0;index<accountKeys.size();index++)
        	{
        		String accountUniqueID = accountKeys.get(index);
        		Account account = accounts.get(accountUniqueID);
        		stringToSendToWebBrowser += "<p> Email:	"+ account.emailAddress+"</p><br><p> Forename: "+account.username+"</p><br><p>";
        	}
    
        	stringToSendToWebBrowser += 
        			"</div>"+	
        			"<!-- JavaScript -->\r\n" + 
        			"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
        			"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
        			"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
        			"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>"+
        			"</body>"+
        			"</html>";
        		
    		//To clear database
//    		accounts.clear();
        	
        	toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );

        	return true;
        }
        return false;
	}


}
