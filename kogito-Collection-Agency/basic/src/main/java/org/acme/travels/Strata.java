package org.acme.travels;

import java.io.Serializable;
import java.io.*;
import okhttp3.*;


public class Strata {

	private int customer_id;
	private int age;
	private int zipcode;
	private String timezone;
	private float income;
	private	int	custbank;
	private	String	dirdep;
	private	int	actloan;
	private	int	defloan;
	private	float montpay;
	private	String	web30py;
	private	String	web90py;
	private	String	phone30py;
	private	String	phone90py;
	private	String	app30py;
	private	String	app90py;
	private	String	bran30py;
	private	String	bran90py;
	private	String	mail30py;
	private	String	mail90py;
	private	String	email30py;
	private	String	email90py;
	private	String	chat30py;
	private	String	chat90py;
	private	String	twitter;
	private	String	instagram;
	private	String	facebook;
	private	String	onpurchase;
	private	String	cusconscm;
	private	String	cusconscel;
	private	String	cusconslan;
	private	String	cusconstex;
	private	String	nocalltime;
	private	int	pascolleccommu;
	private	String	commuchan;
	private	String	commutime;
	private	int	score;

	private	String	name;
	private	String	email;
	private	String	phone;
	private String predictions;

	public int getcustomer_id() {return customer_id;}
	public void setcustomer_id(int customer_id) {this.customer_id = customer_id;}

	public int getage() {return age;}
	public void setage(int age) {this.age = age;}

	public int getzipcode() {return zipcode;}
	public void setzipcode(int zipcode) {this.zipcode = zipcode;}

	public String gettimezone() {return timezone;}
	public void settimezone(String timezone) {this.timezone = timezone;}

	public float getincome() {return income;}
	public void setincome(float income) {this.income = income;}

	public int getcustbank() {return custbank;}
	public void setcustbank(int custbank) {this.custbank = custbank;}

	public String getdirdep() {return dirdep;}
	public void setdirdep(String dirdep) {this.dirdep = dirdep;}

	public int getactloan() {return actloan;}
	public void setactloan(int actloan) {this.actloan = actloan;}

	public int getdefloan() {return defloan;}
	public void setdefloan(int defloan) {this.defloan = defloan;}

	public float getmontpay() {return montpay;}
	public void setmontpay(float montpay) {this.montpay = montpay;}

	public String getweb30py() {return web30py;}
	public void setweb30py(String web30py) {this.web30py = web30py;}

	public String getweb90py() {return web90py;}
	public void setweb90py(String web90py) {this.web90py = web90py;}

	public String getphone30py() {return phone30py;}
	public void setphone30py(String phone30py) {this.phone30py = phone30py;}

	public String getphone90py() {return phone90py;}
	public void setphone90py(String phone90py) {this.phone90py = phone90py;}

	public String getapp30py() {return app30py;}
	public void setapp30py(String app30py) {this.app30py = app30py;}

	public String getapp90py() {return app90py;}
	public void setapp90py(String app90py) {this.app90py = app90py;}

	public String getbran30py() {return bran30py;}
	public void setbran30py(String bran30py) {this.bran30py = bran30py;}

	public String getbran90py() {return bran90py;}
	public void setbran90py(String bran90py) {this.bran90py = bran90py;}

	public String getmail30py() {return mail30py;}
	public void setmail30py(String mail30py) {this.mail30py = mail30py;}

	public String getmail90py() {return mail90py;}
	public void setmail90py(String mail90py) {this.mail90py = mail90py;}

	public String getemail30py() {return email30py;}
	public void setemail30py(String email30py) {this.email30py = email30py;}

	public String getemail90py() {return email90py;}
	public void setemail90py(String email90py) {this.email90py = email90py;}

	public String getchat30py() {return chat30py;}
	public void setchat30py(String chat30py) {this.chat30py = chat30py;}

	public String getchat90py() {return chat90py;}
	public void setchat90py(String chat90py) {this.chat90py = chat90py;}

	public String gettwitter() {return twitter;}
	public void settwitter(String twitter) {this.twitter = twitter;}

	public String getinstagram() {return instagram;}
	public void setinstagram(String instagram) {this.instagram = instagram;}

	public String getfacebook() {return facebook;}
	public void setfacebook(String facebook) {this.facebook = facebook;}

	public String getonpurchase() {return onpurchase;}
	public void setonpurchase(String onpurchase) {this.onpurchase = onpurchase;}

	public String getcusconscm() {return cusconscm;}
	public void setcusconscm(String cusconscm) {this.cusconscm = cusconscm;}

	public String getcusconscel() {return cusconscel;}
	public void setcusconscel(String cusconscel) {this.cusconscel = cusconscel;}

	public String getcusconslan() {return cusconslan;}
	public void setcusconslan(String cusconslan) {this.cusconslan = cusconslan;}

	public String getcusconstex() {return cusconstex;}
	public void setcusconstex(String cusconstex) {this.cusconstex = cusconstex;}

	public String getnocalltime() {return nocalltime;}
	public void setnocalltime(String nocalltime) {this.nocalltime = nocalltime;}

	public int getpascolleccommu() {return pascolleccommu;}
	public void setpascolleccommu(int pascolleccommu) {this.pascolleccommu = pascolleccommu;}

	public String getcommuchan() {return commuchan;}
	public void setcommuchan(String commuchan) {this.commuchan = commuchan;}

	public String getcommutime() {return commutime;}
	public void setcommutime(String commutime) {this.commutime = commutime;}

	public int getscore() {return score;}
	public void setscore(int score) {this.score = score;}

	public String getname() {return name;}
	public void setname(String name) {this.name = name;}

	public String getemail() {return email;}
	public void setemail(String email) {this.email = email;}

	public String getphone() {return phone;}
	public void setphone(String phone) {this.phone = phone;}

	public String postcall (String []args) throws IOException
    {
	    OkHttpClient client = new OkHttpClient().newBuilder()
	      .build();
		MediaType mediaType = MediaType.parse("application/json");

		String bdyText = "{\"data\": [{\"Customer_Id\": " + getcustomer_id() + ",\"Age\": "+ getage() + ",\"ZipCode\": "+ getzipcode() + ",\"TimeZone\": \""+ gettimezone() + "\",\"Income\": "+ getincome() + ",\"CustBank\": "+ getcustbank() + ",\"DirDep\": \""+ getdirdep() + "\",\"ActLoan\": "+ getactloan() + ",\"DefLoan\": "+ getdefloan() + ",\"MontPay\": "+ getmontpay() + ",\"Web30py\": \""+ getweb30py() + "\",\"Web90py\": \""+ getweb90py() + "\",\"Phone30py\": \""+ getphone30py() + "\",\"Phone90py\": \""+ getphone90py() + "\",\"App30py\": \""+ getapp30py() + "\",\"App90py\": \""+ getapp90py() + "\",\"Bran30py\": \""+ getbran30py() + "\",\"Bran90py\": \""+ getbran90py() + "\",\"Mail30py\": \""+ getmail30py() + "\",\"Mail90py\": \""+ getmail90py() + "\",\"Email30py\": \""+ getemail30py() + "\",\"Email90py\": \""+ getemail90py() + "\",\"Chat30py\": \""+ getchat30py() + "\",\"Chat90py\": \""+ getchat90py() + "\",\"Twitter\": \""+ gettwitter() + "\",\"Instagram\": \""+ getinstagram() + "\",\"Facebook\": \""+ getfacebook() + "\",\"OnPurchase\": \""+ getonpurchase() + "\",\"CusConsEm\": \""+ getcusconscm() + "\",\"CusConsCel\": \""+ getcusconscel() + "\",\"CusConsLan\": \""+ getcusconslan() + "\",\"CusConsTex\": \""+ getcusconstex() + "\",\"NoCallTime\": \""+ getnocalltime() + "\",\"PasCollecCommu\": "+ getpascolleccommu() + ",\"CommuChan\": \""+ getcommuchan() + "\",\"CommuTime\": \""+ getcommutime() + "\",\"Score\": "+ getscore() + "}]}";
		//System.out.println(bdyText);
	    RequestBody body = RequestBody.create(mediaType, bdyText);
	    Request request = new Request.Builder()
	      .url("http://172.18.6.20:5000/strata/channel")
	      .method("POST", body)
	      .addHeader("Content-Type", "application/json")
	      .build();
	    Response response = client.newCall(request).execute();
	    return response.body().string();
    }

	public String getpredictions() throws IOException
	{
		//String customer_id = args[0];
		//String age = args[1];

		String[] str = new String[1];
		//String[] str = new String[] {customer_id,age};
	 	predictions = postcall(str);
		return predictions;
	}

}
