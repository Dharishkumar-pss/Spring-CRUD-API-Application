package com.dharish.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeDetails 
{
	@Id
	@Column
	private int empid;
	@Column
	private String empname;
	@Column
	private long empphnnum;
	public void setEmpphnnum(long empphnnum) {
		this.empphnnum = empphnnum;
	}
	@Column
	private String empaddress;
	
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
	public long getEmpphnnum() {
		return empphnnum;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	@Override
	public String toString() {
		return "EmployeDetails [empid=" + empid + ", empname=" + empname + ", empphnnum=" + empphnnum + ", empaddress="
				+ empaddress + "]";
	}
	
	

}
