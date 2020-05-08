package model;

import java.io.Serializable;
import java.util.ArrayList;

public class MainForumPage implements Serializable {
	private static final long serialVersionUID = 1L;

	public String title;
	
	public String uniqueid;
	public String topictitle;
	public String topictext;
	public ArrayList<String> topics = new ArrayList<String>() {};
}
