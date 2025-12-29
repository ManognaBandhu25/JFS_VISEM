package com.skillnext1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Student Servlet is WORKING</h2>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        int sem = Integer.parseInt(req.getParameter("sem"));
        String dept = req.getParameter("dept");
        String course = req.getParameter("course");
        String email = req.getParameter("email");

        Student stu = new Student();
        stu.setName(name);
        stu.setSem(sem);
        stu.setDept(dept);
        stu.setCourse(course);
        stu.setEmail(email);

        StudentDAO.save(stu);

        res.sendRedirect("success.jsp");
    }
}
