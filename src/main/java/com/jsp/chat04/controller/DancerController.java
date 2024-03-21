//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.jsp.chap04.controller;

import com.jsp.chap04.service.DeleteService;
import com.jsp.chap04.service.IDancerService;
import com.jsp.chap04.service.ListService;
import com.jsp.chap04.service.RegistService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"*.do"})
public class DancerController extends HttpServlet {
    private IDancerService sv;
    private RequestDispatcher rd;

    public DancerController() {
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);

        try {
            switch (requestURI) {
                case "/register.do":
                    System.out.println("등록 폼으로 이동시켜 달라는 요청이구나!");
                    this.rd = request.getRequestDispatcher("/WEB-INF/chap03/dancer/register.jsp");
                    this.rd.forward(request, response);
                    break;
                case "/regist.do":
                    System.out.println("댄서 등록 요청!");
                    this.sv = new RegistService();
                    this.sv.execute(request, response);
                    this.rd = request.getRequestDispatcher("/WEB-INF/chap03/dancer/list.jsp");
                    this.rd.forward(request, response);
                    break;
                case "/delete.do":
                    System.out.println("삭제 요청이 들어옴!");
                    this.sv = new DeleteService();
                    this.sv.execute(request, response);
                    this.rd = request.getRequestDispatcher("/WEB-INF/chap03/dancer/list.jsp");
                    this.rd.forward(request, response);
                    break;
                case "/list.do":
                    System.out.println("댄서 목록 요청이 들어옴!");
                    this.sv = new ListService();
                    this.sv.execute(request, response);
                    this.rd = request.getRequestDispatcher("/WEB-INF/chap03/dancer/list.jsp");
                    this.rd.forward(request, response);
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }
}