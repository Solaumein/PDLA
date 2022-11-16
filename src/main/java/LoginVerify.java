import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/LoginVerify")
public class LoginVerify extends HttpServlet {
    private static final long serialVersionUID =1L;


    public LoginVerify(){
        System.out.println("Verify");

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        /*response.getWriter().append("aaaaa at: ").append(request.getContextPath());
        String user = String.valueOf(request.getPart("uname"));
        System.out.println(user);*/
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //doGet(request, response);
        System.out.println("*****");
        String user = request.getParameter("uname");
        String pass =request.getParameter("password");
        if(user.equals("admin") && pass.equals("admin")){
            response.getWriter().append("GG WP ");
        }else{
            response.getWriter().append("Nope m8 ");
        }
        //System.out.println(user);
    }


}
