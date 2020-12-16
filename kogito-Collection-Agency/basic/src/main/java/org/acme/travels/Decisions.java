package org.acme.travels;

import java.io.Serializable;
import java.io.*;


public class Decisions {

	private int customer_id;
	private float app;
	private float cell;
	private float email;
	private	float	landline;
	private	float	mail;
	private	float	text;
	private	String	most_preferred_channel;
	private	String	second_preferred_channel;
	private	String	third_preferred_channel;
	private	String	timestamp;

	public int getcustomer_id() {return customer_id;}
	public void setcustomer_id(int customer_id) {this.customer_id = customer_id;}

	public float getapp() {return app;}
	public void setapp(float app) {this.app = app;}

	public float getcell() {return cell;}
	public void setcell(float cell) {this.cell = cell;}

	public float getemail() {return email;}
	public void setemail(float email) {this.email = email;}

	public float getlandline() {return landline;}
	public void setlandline(float landline) {this.landline = landline;}

	public float getmail() {return mail;}
	public void setmail(float mail) {this.mail = mail;}

	public float gettext() {return text;}
	public void settext(float text) {this.text = text;}

	public String getmost_preferred_channel() {return most_preferred_channel;}
	public void setmost_preferred_channel(String most_preferred_channel) {this.most_preferred_channel = most_preferred_channel;}

	public String getsecond_preferred_channel() {return second_preferred_channel;}
	public void setsecond_preferred_channel(String second_preferred_channel) {this.second_preferred_channel = second_preferred_channel;}

	public String getthird_preferred_channel() {return third_preferred_channel;}
	public void setthird_preferred_channel(String third_preferred_channel) {this.third_preferred_channel = third_preferred_channel;}

	public String gettimestamp() {return timestamp;}
	public void settimestamp(String timestamp) {this.timestamp = timestamp;}

}
