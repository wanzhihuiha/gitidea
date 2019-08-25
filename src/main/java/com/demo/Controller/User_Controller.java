package com.demo.Controller;

import com.demo.Model.User_Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class User_Controller {
    public static final  String msg="123";


    @RequestMapping(value = "/pic")
    public String getPicture1(HttpServletRequest request) {
        User_Model user=new User_Model();
        String A="";
        return A;

    }

}
