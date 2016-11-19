package demo.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xu on 2016/11/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/hello.do")
    public ModelAndView test(){
        return new ModelAndView("home");
    }
    @RequestMapping(value="/hello1.do")
    public void test1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("get into test");
        response.getWriter().write("123");
    }

}
