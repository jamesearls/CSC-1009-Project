package model;

import java.io.Serializable;
import java.util.ArrayList;

public class MyAccounts implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public String username;
	public String email;
	public String password;
	public ArrayList<String> usersList = new ArrayList<String>();
	public String confirmPassword;

	

}
