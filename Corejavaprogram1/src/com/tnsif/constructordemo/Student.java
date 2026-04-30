package com.tnsif.constructordemo;

public class Student {
private String Studentname;
private String Studentaddress;
private int Studentid;

	public String getStudentname() {
	return Studentname;
}

public void setStudentname(String studentname) {
	Studentname = studentname;
}

public String getStudentaddress() {
	return Studentaddress;
}

public void setStudentaddress(String studentaddress) {
	Studentaddress = studentaddress;
}

public int getStudentid() {
	return Studentid;
}

public void setStudentid(int studentid) {
	Studentid = studentid;
}
@Override
	public String toString() {
	return "Student [Studentname="+Studentname+",Studentaddress="+Studentaddress+",Studentid="+Studentid+"]";

	}

}
