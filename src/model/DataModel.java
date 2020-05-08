package model;

import java.io.Serializable;
import java.util.ArrayList;

public class DataModel implements Serializable{
	private static final long serialVersionUID= 1L;

	public String picture;
	public String heading;
	public String content;
	public ArrayList<String> diagnoses =new ArrayList<String>();
	public String amount;
	public String email;
}