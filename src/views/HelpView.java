package views;

import java.util.List;
import java.util.StringTokenizer;

import org.h2.mvstore.MVMap;

import model.Appointment;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class HelpView extends DynamicWebPage {

	public HelpView(DatabaseInterface db, FileStoreInterface fs) {
		super(db, fs);
		
	}
	
	public int totalAppointments1;	
	public boolean process(WebRequest toProcess) {
		if(toProcess.path.equalsIgnoreCase("help")) {
					
			String exampleUserName = "jamesearls98";
			String stringToSendToWebBrowser=
					"<html>\r\n" + 
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
				"  <title>Help & Appointments</title>"+
				"<style>\r\n" + 
				"       /* Set the size of the div element that contains the map */\r\n" + 
				"      #map {\r\n" + 
				"        height: 50%;  /* The height is 400 pixels */\r\n" + 
				"        width: 100%;  /* The width is the width of the web page */\r\n" + 
				"       }\r\n" + 
				"    </style>"+
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
					"<br>"+
					"<br>"+
					"<br>"+
					"<br>"+
					"<div class=\"container\">" +
						"<h1>Help and Appointments</h1>\r\n" + 
						"<h4>Get Help today:</h4>\r\n" +
						"<p>We're delighted you've decided to choose us for help. Here you can use our google maps tool to discover clincs and hospitals that provide help near you,"
						+ " or make an appointment with us today.</p>" +
					"</div>"+
					
					"<div class=\"container col-sm-4\">" +
					"	 <div id=\"map\"></div>\r\n" + 
					"    <script>\r\n" + 
					"\r\n" + 
					"      function initMap() {\r\n" + 
					"\r\n" + 
					"        var map = new google.maps.Map(document.getElementById('map'), {\r\n" + 
					"          zoom: 13,\r\n" + 
					"          center: {lat: 54.596028, lng: -5.931667}\r\n" + 

					"        });\r\n" + 
					"\r\n" + 
					"        // Create an array of alphabetical characters used to label the markers.\r\n" + 
					"        var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';\r\n" + 
					"\r\n" + 
					"        // Add some markers to the map.\r\n" + 
					"        // Note: The code uses the JavaScript Array.prototype.map() method to\r\n" + 
					"        // create an array of markers based on a given \"locations\" array.\r\n" + 
					"        // The map() method here has nothing to do with the Google Maps API.\r\n" + 
					"        var markers = locations.map(function(location, i) {\r\n" + 
					"          return new google.maps.Marker({\r\n" + 
					"            position: location,\r\n" + 
					"            label: labels[i % labels.length]\r\n" + 
					"          });\r\n" + 
					"        });\r\n" + 
					"\r\n" + 
					"        // Add a marker clusterer to manage the markers.\r\n" + 
					"        var markerCluster = new MarkerClusterer(map, markers,\r\n" + 
					"            {imagePath: 'https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/m'});\r\n" + 
					"      }\r\n" + 
					"      var locations = [\r\n" + 
					"        {lat: 54.585464, lng: -5.940880},\r\n" + 
					"        {lat: 54.595678, lng: -5.954505},\r\n" +  
					"        {lat: 54.609380, lng: -5.926487},\r\n" + 
					"        {lat: 54.588449, lng: -5.942204},\r\n" + 
					"      ]\r\n" + 
					"    </script>\r\n" + 
					"    <script src=\"https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/markerclusterer.js\">\r\n" + 
					"    </script>\r\n" + 
					"    <script async defer\r\n" + 
					"    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCc4H73nJlu1Wx1bkxOK-h_CIXM3-S7Pw8&callback=initMap\">\r\n" + 
					"    </script>"+
					"</div>"+
					"</div>"+
					
					"<div class=\"container\">" +
					"	<h4>Make an Appointment:</h4>\r\n" +
					"    <div class=\"appointment-section\">\r\n" + 
					"      <div class=\"appointment-form-container\">\r\n" + 
					"        <div class=\"row\">\r\n" + 
					"          <div class=\"col-md-12\">\r\n" + 
					"            <form action =\"/addAppointmentProcess\" method=\"GET\">\r\n" + 
					"              <div class=\"email:\">\r\n" + 
					"                <label class=\"control-label\" for=\"exampleInputEmail1\">Email:</label>\r\n" + 
					"                <input id=\"exampleInputEmail1\" placeholder=\"Enter Email\"\r\n" + 
					"                type=\"email\" class=\"form-control\" name=\"email\">\r\n" + 
					"				<small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>"+
					"              </div>\r\n" + 
					"              <div class=\"forename\">\r\n" + 
					"                <label class=\"control-label\" for=\"exampleInputEmail1\">Forename:</label>\r\n" + 
					"                <input class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Enter Forename\"\r\n" + 
					"                type=\"text\" name=\"forename\">\r\n" + 
					"              </div>\r\n" + 
					"              <div class=\"surname\">\r\n" + 
					"                <label class=\"control-label\" for=\"exampleInputEmail1\">Surname:</label>\r\n" + 
					"                <input class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Enter Surname\"\r\n" + 
					"                type=\"text\" name=\"surname\">\r\n" + 
					"              </div>\r\n" + 
					"              <div class=\"location\">\r\n" + 
					"                <label class=\"control-label\" for=\"location\">Location:</label>\r\n" + 
					"                <br>\r\n" + 
					"                <select class=\"btn btn-secondary dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" name=\"location\">\r\n" + 
					"                  <option value=\"belfast\">Belfast</option>\r\n" + 
					"                  <option value=\"armagh City\">Armagh City</option>\r\n" + 
					"                  <option value=\"larne\">Larne</option>\r\n" + 
					"                  <option value=\"carnlough\">Carnlough</option>\r\n" + 
					"                </select>\r\n" + 
					"              </div>\r\n" + 
					"              <br>\r\n" + 
					"              <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n" + 
					"            </form>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </div>\r\n" + 	
					"</div>\r\n" +
					"<div class=\"Container float-right\">" +
					"	<div class=\"card float-right border-primary mb-3\" style=\"max-width: 18rem;\">\r\n" + 
					"  		<div class=\"card-header\">Developer/Admin use only</div>\r\n" + 
					"  		<div class=\"card-body text-primary\">\r\n" + 
					"   	 <h5 class=\"card-title\">Appointment List</h5>\r\n" + 
					"    	<p class=\"card-text\">Click here to view an appointment list to show when you are .</p>\r\n"+
					" 		<a href=\"appointmentList\" class=\"btn btn-secondary\" role=\"button\">Appointments</a>" +  
					"  	</div>"+
					"</div>"+
					" <!-- JavaScript -->\r\n" + 
					"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
					"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
					"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
					"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>"+
					"  </body>\r\n" + 
					"\r\n" + 
					"</html>";
	

			
			toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser);
			return true;
		}
		else if(toProcess.path.equalsIgnoreCase("addAppointmentProcess")) {
				Appointment appointment = new Appointment();
				appointment.uniqueId="appointment_"+System.currentTimeMillis();
				appointment.patientEmail=toProcess.params.get("email");
				appointment.patientForename=toProcess.params.get("forename");
				appointment.patientSurname=toProcess.params.get("surname");
				appointment.location=toProcess.params.get("location");
				appointment.totalAppointments++;
				MVMap<String, Appointment>appointments = db.s.openMap("appointments");
				appointments.put(appointment.uniqueId, appointment);
				
				String stringToSendToWebBrowser = 
						"<html>"
						+"<head>"
						+"  <!-- Required meta tags -->\r\n" + 
						"  <meta charset = \"utf-8\">\r\n" + 
						"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
						"  <!-- Bootstrap CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
						"  <!-- My CSS -->\r\n" + 
						"  <link rel=\"stylesheet\" href=\"NavBar.css\">\r\n" + 
						"  <!-- Hover CSS -->\r\n" + 
						"  <link href=\"css/hover-min.css\" rel=\"stylesheet\" media=\"all\">"	
						+"<title>Submission Confirmed</title>"
								
						+"</head>"		
							+ "<body>"
						+"<nav class=\"topnav navbar-expand-sm navbar navbar-dark bg-primary fixed-top justify-content-center\">\r\n" + 
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
						"</nav>"
						+"<br>"
						+"<br>"
						+"<br>"
								+ "<p>Appointment added</p>"
								+ "<a href=\"/home\">Return Home</a>"
								
								+" <!-- JavaScript -->\r\n" + 
								"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
								"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
								"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
								"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>"+
							 "</body>"
						+ "</html>"; 
						
					
				
				
				toProcess.r = new WebResponse(WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser);
					
			
			return true;
		}
		return false;

	}
	

	
}
