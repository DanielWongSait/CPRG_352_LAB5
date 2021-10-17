package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountServices;

public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(); 
        if (request.getParameter("exit") != null) {
            session.invalidate(); 
            request.setAttribute("getOut", true);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        if (session.getAttribute("displayUser") != null) {
            response.sendRedirect("home"); 
            return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(); 
        AccountServices accountUser = new AccountServices();;
        String username = request.getParameter("username");
        String password = request.getParameter("password"); 
        
        if (username != null && password != null) {
            User user = accountUser.login(username, password); 
            if(user != null) {
                session.setAttribute("displayUser", user.getUsername());
                response.sendRedirect("home"); 
            } else {
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                session.setAttribute("wrongCreds", true);
                response.sendRedirect("login"); 
            }
        } 
    }
}
