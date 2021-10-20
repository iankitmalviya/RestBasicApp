package com.metlife;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Employee {
	@Id
private int empid;
private String empname;
private String empcity;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpcity() {
	return empcity;
}
public void setEmpcity(String empcity) {
	this.empcity = empcity;
}


}
