/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.HelperClasses;

/**
 *
 * @author root
 */
public class FirstClassDto {
      String classid;
      String previousschlclass;
      String previousschlname;
      String presentschlclass;
      String firstlang;
      String secondlang;
      String thirdlang;
      String studentid;

    public FirstClassDto(String classid, String previousschlclass, String previousschlname, String presentschlclass, String firstlang, String secondlang, String thirdlang, String studentid) {
        this.classid = classid;
        this.previousschlclass = previousschlclass;
        this.previousschlname = previousschlname;
        this.presentschlclass = presentschlclass;
        this.firstlang = firstlang;
        this.secondlang = secondlang;
        this.thirdlang = thirdlang;
        this.studentid = studentid;
    }

    public FirstClassDto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
      
      
    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getPreviousschlclass() {
        return previousschlclass;
    }

    public void setPreviousschlclass(String previousschlclass) {
        this.previousschlclass = previousschlclass;
    }

    public String getPreviousschlname() {
        return previousschlname;
    }

    public void setPreviousschlname(String previousschlname) {
        this.previousschlname = previousschlname;
    }

    public String getPresentschlclass() {
        return presentschlclass;
    }

    public void setPresentschlclass(String presentschlclass) {
        this.presentschlclass = presentschlclass;
    }

    public String getFirstlang() {
        return firstlang;
    }

    public void setFirstlang(String firstlang) {
        this.firstlang = firstlang;
    }

    public String getSecondlang() {
        return secondlang;
    }

    public void setSecondlang(String secondlang) {
        this.secondlang = secondlang;
    }

    public String getThirdlang() {
        return thirdlang;
    }

    public void setThirdlang(String thirdlang) {
        this.thirdlang = thirdlang;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
      
    
}