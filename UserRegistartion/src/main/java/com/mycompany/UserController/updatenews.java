/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserController;

import com.mycompany.HelperClasses.Queriesimpl;
import com.mycompany.UserModel.Queries;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 import com.mycompany.HelperClasses.UpdateNewsDTo;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author vikas
 */
@WebServlet(name = "updatenews", urlPatterns = {"/updatenews"})
public class updatenews extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            Queries impl=new Queriesimpl();
            UpdateNewsDTo dto=new UpdateNewsDTo();
            ArrayList<UpdateNewsDTo> myarraylist=impl.upadtenews(dto);
            
            request.setAttribute("news", myarraylist);  
            RequestDispatcher rd=request.getRequestDispatcher("View/AdminFolder/UpdateNewsDetails.jsp");
            rd.forward(request, response);
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
