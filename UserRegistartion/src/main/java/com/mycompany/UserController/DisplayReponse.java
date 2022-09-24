/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.json.JsonObject;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author vikas
 */
@WebServlet(name = "DisplayReponse", urlPatterns = {"/oss-api/*"})
public class DisplayReponse implements Servlet {

    ServletConfig config = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("11111111111111111111111");
            
           String requestData = request.getReader().lines().collect(Collectors.joining());
            System.out.println("com.mycompany.UserController.DisplayReponse.service()"+requestData);
            System.out.println("com.mycompany.UserController.DisplayReponse.service()");
            
            //SONObject json = new JSONObject(string);
            
            System.out.println(request.getContentType());
            PrintWriter out = response.getWriter();
            UUID uuid = UUID.randomUUID();
            JSONObject result_Json = new JSONObject();
            result_Json.put("status", "ok");
            result_Json.put("uuid", uuid.toString());
            response.setContentType("application/json");
            JSONObject response_Json = new JSONObject();
            response_Json.put("result", result_Json);
            response_Json.put("jsonrpc", "2.0");
            response_Json.put("id", 1);
            System.out.println("the generated json is:: " + response_Json);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.println(response_Json);

            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
