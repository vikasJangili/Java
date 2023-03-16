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
import javax.servlet.http.HttpSession;

/**
 *
 * @author vikas
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String Adminname = request.getParameter("Ladminname");
        String password = request.getParameter("Lpassword");
        
//        Cookie Name=new Cookie("adminname", Adminname);
//         Name.setMaxAge(10);
//        Cookie cpassword=new Cookie("password", password);
        
//        response.addCookie(Name);
//        response.addCookie(cpassword);

        out.println("admin name is::" + Adminname);
        out.println("password is ::" + password);
        
        AdminDto dto = new AdminDto();
        dto.setLadminname(Adminname);
        dto.setAdminpassword(password);

        Queries impl = new Queriesimpl();
        String DBname = impl.validateLadminName(dto);
        String DBpassword = impl.validatePassword(dto);
        
        System.out.println("DBname is" + DBname);
        System.out.println("DBpassword is " + DBpassword);
        
        if ((Adminname.equals(DBname)) && (password.equals(DBpassword))) {
            out.println("Admin login successfull");
            HttpSession session = request.getSession();

            RequestDispatcher rd = request.getRequestDispatcher("View/AdminFolder/AdminLoginjsp.jsp");
            rd.forward(request, response);
        } else {
            out.println("please enter valid details");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        String action=request.getParameter("action");
        out.println("action is "+action);
        System.out.println("action =="+action);
        if(action!="0"&&action!=""){       
        String name = request.getParameter("fAdminname");
        String fpassword = request.getParameter("fpassword");

        out.print("name" + name);
        out.print("password" + fpassword);
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
                RequestDispatcher rd = request.getRequestDispatcher("View/AdminFolder/AdminLogin.html");
                rd.forward(request, response);
            } else {
                out.println("password update failed ");
            }
        } else {
            out.println("please enter a valid admin name");
        }
    }   
    else{
            System.out.println("action not found");
    out.println("action not found");
}
    }


@Override
    public String getServletInfo() {
        return "Short description";
    }
}
