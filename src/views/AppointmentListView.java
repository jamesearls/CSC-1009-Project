package views;

import java.util.List;

import org.h2.mvstore.MVMap;

import model.Appointment;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class AppointmentListView extends DynamicWebPage {

	public AppointmentListView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
	}

	public boolean process(WebRequest toProcess)
	{
        if(toProcess.path.equalsIgnoreCase("appointmentlist"))
        {
        	
        	MVMap<String, Appointment>appointments = db.s.openMap("appointments");
        	List<String> appointmentKeys = appointments.keyList();
        	
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
					"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">\r\n" + 
					"  <title>Appointment List</title>"+
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
					"<div class= \"container fixed-bottom\">"+
					"<div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n"+
						"	There is currently in a waiting list of <strong>"+ appointmentKeys.size()  +"</strong> appointments.\r\n" + 
						"  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n" + 
						"    <span aria-hidden=\"true\">&times;</span>\r\n" + 
						"  </button>\r\n" + 
						"</div>"+
					"</div>"+
					"<div class=\"container\">" +
        			"    <h1>Appointment List</h1>\r\n" + 
        			"    <h4>Appointments from Database:</h4>\r\n";
        			 

        	
        	for(int index=0;index<appointmentKeys.size();index++)
        	{
        		String appointmentUniqueID = appointmentKeys.get(index);
        		Appointment appointment = appointments.get(appointmentUniqueID);
        		stringToSendToWebBrowser += "<p> Email:	"+ appointment.patientEmail+"</p><br><p> Forename: "+appointment.patientForename+"</p><br><p> Surname: "+appointment.patientSurname+"</p>"
    					+ "<br><p> Location: "+appointment.location+"</p><br><br>";
        	}
        	stringToSendToWebBrowser +=
        			"</div>"+
        			"  </body>\r\n" +
        			"<!-- JavaScript -->\r\n" + 
        			"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
        			"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
        			"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
        			"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>" +
        			"</html>";
        			
    		
    		//To clear database
//    		appointments.clear();
    		
        	toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );

        	return true;
        }
        return false;
	}

}
