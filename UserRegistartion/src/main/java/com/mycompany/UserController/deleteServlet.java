/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserController;

import com.mycompany.HelperClasses.AdminDto;
import com.mycompany.HelperClasses.FirstClassDto;
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
@WebServlet(name = "deleteServlet", urlPatterns = {"/deleteServlet"})
public class deleteServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String Id = request.getParameter("StudentId");
        AdminDto dto = new AdminDto();
        dto.setStudentid(Id);
        Queries impl = new Queriesimpl();
        int count = impl.deleteStudent(dto);
        if (count > 0) {
            out.print("Student Deleted Successfully");
           // RequestDispatcher rd = request.getRequestDispatcher("View/AdminFolder/FristClass.jsp");
            //rd.forward(request, response);
        } else {
            out.print("please enter a valid Student id ");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
