package cn.cecurio.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 测试init-param context-param的加载与作用域
 * @author: Cecurio
 * @create: 2017-11-19 20:15
 **/
public class TestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        String initParam = getInitParameter("myEnglishName");
        print("init-param in init(): " + initParam);
        String contextParam = getServletContext().getInitParameter("myName");
        print("context-param in init(): " + contextParam);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String initParam = getInitParameter("myEnglishName");
        print("init-param in doGet(): " + initParam);
        String contextParam = getServletContext().getInitParameter("myName");
        print("context-param in doGet(): " + contextParam);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().append("自定义的Servlet");
    }

    private void print(String message) {
        System.out.println("自定义的Servlet: " + message);
    }

}
