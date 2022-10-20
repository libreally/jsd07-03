package cn.tedu.coolshark.filter;

import cn.tedu.coolshark.pojo.vo.UserVO;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "MyFilter",urlPatterns = {"/admin.html","/insertProduct.html"})
public class MyFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    //当请求经过时执行的方法
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //判断是否登录
        HttpServletRequest rt= (HttpServletRequest) request;
        HttpServletResponse re= (HttpServletResponse) response;

        HttpSession session = rt.getSession();

        UserVO user = (UserVO) session.getAttribute("user");
        if (user!=null){
            chain.doFilter(request, response);
        }else {
            re.sendRedirect("/login.html");
        }

    }
}
