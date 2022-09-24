/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.HelperClasses;

import com.mycompany.UserModel.DBConnection;
import com.mycompany.UserModel.Queries;
import com.mycompany.constants.QueryConstanst;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;

/**
 *
 * @author root
 */
public class Queriesimpl implements Queries {

    Connection conn = null;

    @Override
    //this method is used to insert admin into DB using admin registration form
    public int insertAdmin(AdminDto dto) {

        int count = 0;
        int pscount = 1;
        try {
            conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected "+conn);
                String query = "insert into admins (admin_name,admin_password) values(?,?)";
                System.out.println("insert admin query id is ::" + query);
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(pscount, dto.getRadminname());
                pst.setString(pscount++, dto.getAdminpassword());
                count = pst.executeUpdate();

            } else {
                System.out.println("Connection failed");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            DBConnection.closeConnection(conn);
            try {
                System.out.println("insert admin connection is closed " + conn.isClosed());
            } catch (SQLException ex) {
                Logger.getLogger(Queriesimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return count;

    }

    @Override
    public String validateLadminName(AdminDto dto) {

        String name = null;
        try {
            conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected");
                Statement st = conn.createStatement();
                String query1 = "select admin_name from admins where admin_name=" + "\'" + dto.getLadminname() + "\'";
                System.out.println("Admin name query is" + query1);
                ResultSet rs = st.executeQuery(query1);
                while (rs.next()) {
                    name = rs.getString("admin_name");
                }
            } else {
                System.out.println("Connection failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
            try {
                System.out.println("Validateusername conenction is " + conn.isClosed());
            } catch (SQLException ex) {
                Logger.getLogger(Queriesimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return name;
    }

    @Override
    public String validateFadminName(AdminDto dto) {

        String name = null;
        try {
            conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected");
                Statement st = conn.createStatement();
                String query1 = "select admin_name from admins where admin_name=" + "\'" + dto.getFadminname() + "\'";
                System.out.println("Admin name query is" + query1);
                ResultSet rs = st.executeQuery(query1);
                while (rs.next()) {
                    name = rs.getString("admin_name");
                }
            } else {
                System.out.println("Connection failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
            try {
                System.out.println("Validateusername conenction is " + conn.isClosed());
            } catch (SQLException ex) {
                Logger.getLogger(Queriesimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return name;

    }

    @Override
    public String validatePassword(AdminDto dto) {

        String Adminpassword = null;
        try {
            conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected");
                String query = "select admin_password from admins where admin_name=" + "\'" + dto.getLadminname() + "\'";
                System.out.println("query is ::" + query);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    Adminpassword = rs.getString("admin_password");
                }
            } else {
                System.out.println("Connection failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
            try {
                System.out.println("validate password connection is " + conn.isClosed());
            } catch (SQLException ex) {
                Logger.getLogger(Queriesimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Adminpassword;

    }

    @Override
    public int updatePassword(AdminDto dto) {

        int count = 0;
        try {

            conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected");
                Statement st = conn.createStatement();
                String query = "update admins set admin_password=" + "\'" + dto.getAdminfpassword() + "\'" + "where  admin_name=" + "\'" + dto.getFadminname() + "\'";
                count = st.executeUpdate(query);
            } else {
                System.out.println("Connection failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
        }

        return count;
    }

    @Override
    public ArrayList<UpdateNewsDTo> upadtenews(UpdateNewsDTo dto) {

        ArrayList<UpdateNewsDTo> news = new ArrayList();
        try {
            conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected");
                Statement st = conn.createStatement();
                String query1 = "select *from update_news";
                System.out.println("update news  query is" + query1);
                ResultSet rs = st.executeQuery(query1);

                while (rs.next()) {

                    UpdateNewsDTo object = new UpdateNewsDTo();
                    object.setDate(rs.getString(1));
                    object.setDay(rs.getString(2));
                    object.setExamname(rs.getString(3));
                    object.setClass1(rs.getString(4));
                    object.setExamtime(rs.getString(5));
                    news.add(object);
                }
                System.out.println("the array list is " + news);
            } else {
                System.out.println("Connection failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
            try {
                System.out.println("update news connection is " + conn.isClosed());
            } catch (SQLException ex) {
                Logger.getLogger(Queriesimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return news;
    }

    @Override
    public List<FirstClassDto> getStudentDetails() {
        List<FirstClassDto> arr = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected");
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select *from student_educationdetails");
                while (rs.next()) {
                    String class_id = String.valueOf(rs.getInt(1));
                    String previousschoolclass = rs.getString(2);
                    String previousschoolname = rs.getString(3);
                    String presentschoolclass = rs.getString(4);
                    String firstlang = rs.getString(5);
                    String secondlang = rs.getString(6);
                    String thirdlang = rs.getString(7);
                    String stu_id = String.valueOf(rs.getInt(8));
                    FirstClassDto f = new FirstClassDto(class_id, previousschoolclass, previousschoolname, presentschoolclass, firstlang, secondlang, thirdlang, stu_id);
                    f.setClassid(class_id);
                    f.setFirstlang(firstlang);
                    f.setPresentschlclass(presentschoolclass);
                    f.setPreviousschlclass(previousschoolclass);
                    f.setSecondlang(secondlang);
                    f.setThirdlang(thirdlang);
                    f.setPreviousschlname(previousschoolname);
                    f.setStudentid(stu_id);
                    arr.add(f);
                }
                System.out.println("student details List is " + arr);
            } else {
                System.out.println("connection failed ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
            try {
                System.out.println("getStudentDetails  connection is " + conn.isClosed());
            } catch (SQLException ex) {
                Logger.getLogger(Queriesimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }

    @Override
    public int deleteStudent(AdminDto dto) {
        int count = 0;
        try {
            conn = DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Successfully Connected");
                Statement st = conn.createStatement();
                String query = "delete from student_educationdetails where stu_id =  " + dto.getStudentid();
                System.out.println("delete Student query is " + query);

                count = st.executeUpdate(query);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
            try {
                System.out.println("delete user connection is " + conn.isClosed());
            } catch (SQLException ex) {
                Logger.getLogger(Queriesimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return count;
    }
}
