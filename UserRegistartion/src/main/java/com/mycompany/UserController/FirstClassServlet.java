/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserController;

//import com.mycompany.student.helper.FirstClassDb;
import com.mycompany.HelperClasses.FirstClassDto;
import com.mycompany.HelperClasses.Queriesimpl;
import com.mycompany.UserModel.Queries;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author root
 */
@WebServlet(name = "FirstClassServlet", urlPatterns = {"/FirstClassServlet"})
public class FirstClassServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Queries impl = new Queriesimpl();
        List<FirstClassDto> arr = impl.getStudentDetails();
        if (arr.isEmpty()) {
            out.println("Size of arr is null");
        } else {
            request.setAttribute("FirstClassList", arr);

            RequestDispatcher rd = request.getRequestDispatcher("View/AdminFolder/FirstClass.jsp");
            rd.forward(request, response);
        }

    }

}
