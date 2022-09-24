/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.HelperClasses;

import java.util.Objects;

/**
 *
 * @author root
 */
public class AdminDto {
    private String adminid;
    private String Ladminname;
    private String Adminpassword;
    private String studentid;

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    
    private String Radminname;

    public String getLadminname() {
        return Ladminname;
    }

    public void setLadminname(String Ladminname) {
        this.Ladminname = Ladminname;
    }

    public String getRadminname() {
        return Radminname;
    }

    public void setRadminname(String Radminname) {
        this.Radminname = Radminname;
    }
    private String Adminfpassword;
    private String Fadminname;
    //private String Admincpassword;

    public String getFadminname() {
        return Fadminname;
    }

    public void setfAdminname(String Adminfname) {
        this.Fadminname = Adminfname;
    }
    

    public String getAdminfpassword() {
        return Adminfpassword;
    }

    public void setAdminfpassword(String Adminfpassword) {
        this.Adminfpassword = Adminfpassword;
    }
    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }
    public String getAdminpassword() {
        return Adminpassword;
    }

    public void setAdminpassword(String Adminpassword) {
        this.Adminpassword = Adminpassword;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

   
    
    
    
}
