/**
 * @Title APIServlet.java 
 * @Package com.hsnet.pz.api 
 * @Description 
 * @author miyb  
 * @date 2015-3-24 下午4:23:53 
 * @version V1.0   
 */
package com.xnjr.sms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xnjr.sms.proxy.DispatcherImpl;
import com.xnjr.sms.proxy.IDispatcher;

/** 
 * @author: miyb 
 * @since: 2015-3-24 下午4:23:53 
 * @history:
 */
public class APIServlet extends HttpServlet {

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */
    private static final long serialVersionUID = 6175432226630152841L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Successful Deployment");
        PrintWriter writer = response.getWriter();
        writer.append("Version:1.0.0.0 \nDescription:First Deployment ");
        writer.flush();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        String json = request.getParameter("json");
        IDispatcher dispatcher = new DispatcherImpl();
        String result = dispatcher.doDispatcher(code, json);
        System.out.println(result);
        PrintWriter writer = response.getWriter();
        writer.append(result);
        writer.flush();
    }
}
