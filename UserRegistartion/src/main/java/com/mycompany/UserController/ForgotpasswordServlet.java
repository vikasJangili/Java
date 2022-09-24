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
@WebServlet(name = "ForgotpasswordServlet", urlPatterns = {"/ForgotpasswordServlet"})
public class ForgotpasswordServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        //getting parameters from the AdminForgotpassword html page
        String name = request.getParameter("fAdminname");      
        String fpassword = request.getParameter("fpassword");
        
        out.print("name"+name);
        out.print("password"+fpassword);
        //setting name and password parametrs to dto using AdminDto object
        AdminDto dto = new AdminDto();
        dto.setfAdminname(name);
        dto.setAdminfpassword(fpassword);
        
        
        Queries impl = new Queriesimpl();
        String Adminname = impl.validateFadminName(dto);
        if (Adminname.equals(name)) {
            int count = impl.updatePassword(dto);
            if (count > 0) {
                out.println("password updated successfully");
                RequestDispatcher rd=request.getRequestDispatcher("View/AdminFolder/AdminLogin.html");
                rd.forward(request, response);
            } else {
                out.println("password update failed ");
            }
        } else {
            out.println("please enter a valid admin name");
        }

    }



@Override
        public String getServletInfo() {
        return "Short description";
    }

}
