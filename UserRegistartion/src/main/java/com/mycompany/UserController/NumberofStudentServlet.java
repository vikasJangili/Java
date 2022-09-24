/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserController;

import com.mycompany.HelperClasses.FirstClassDto;
import com.mycompany.HelperClasses.Queriesimpl;
import com.mycompany.UserModel.Queries;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
@WebServlet(name = "NumberofStudentServlet", urlPatterns = {"/NumberofStudentServlet"})
public class NumberofStudentServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        try {
      Queries impl = new Queriesimpl();
      List<FirstClassDto> arr=impl.getStudentDetails();
        if (arr.isEmpty()) {
            out.println("Size of arr is null");
        } else {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int count5 = 0;
            for (FirstClassDto i : arr) {
                if (i.getPresentschlclass().equals("Class-1")) {
                    count1++;
                }
                if (i.getPresentschlclass().equals("2")) {
                    count2++;
                }
                if (i.getPresentschlclass().equals("3")) {
                    count3++;
                }
                if (i.getPresentschlclass().equals("4")) {
                    count4++;
                }
                if (i.getPresentschlclass().equals("5")) {
                    count5++;
                }
            }
            String first = request.getParameter("1");
            String second = request.getParameter("2");
            String third = request.getParameter("3");
            String fourth = request.getParameter("4");
            String five = request.getParameter("5");
            if (first != null) {
                out.println(count1);
            }
            if (second != null) {
                out.println(count2);
            }
            if (third != null) {
                out.println(count3);
            }
            if (fourth != null) {
                out.println(count4);
            }
            if (five != null) {
                out.println(count5);
            }
        }
    }
         catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
          
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
