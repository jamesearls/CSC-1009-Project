package model;
import java.io.Serializable;
import java.util.ArrayList;
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
		public String emailAddress;
		public String username;
		public String password;
		public String confirmedPassword;
		public String uniqueId;
		public int accountQuantity;
	}	
