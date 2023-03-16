/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserController;

import com.mycompany.HelperClasses.AdminDto;
import com.mycompany.HelperClasses.Queriesimpl;
import com.mycompany.UserModel.Queries;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vikas
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //getting parameters from the  Admin registration html page
        String Adminname = request.getParameter("Adminname");      
        String password = request.getParameter("password");
//        String cpassword = request.getParameter("cpassword");
        
        //printing the parameters in server log to verify them 
        System.out.println("Adminname is ::" + Adminname);
        System.out.println("password is " + password);
//        System.out.println("confrim password is " + cpassword);
        
        //setting the parametrs to dto using AdminDto object
        AdminDto dto = new AdminDto();       
        dto.setRadminname(Adminname);
        dto.setAdminpassword(password); 
        PrintWriter out = response.getWriter();
        //
        Queries impl= new Queriesimpl();
        //if(password.equals(cpassword)){}
        int count=impl.insertAdmin(dto);
        if(count>0){
            out.print("Admin registerd Successfully");
            RequestDispatcher rd=request.getRequestDispatcher("View/AdminFolder/AdminLogin.html");
            rd.forward(request, response);
        }else{
            out.println("enter  valid details");
        }
        
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
