package com.jason.meng.controller;

import com.jason.meng.entity.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MengDexin
 * @date 2018/01/10 19:17
 **/
@RestController
public class LoginController {

    /**
     * 登录操作
     **/
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password)) {
            User user = new User(userName, password);
            request.getSession().setAttribute("user", user);
            map.put("result", "1");
        } else {
            map.put("result", "0");
        }
        return map;
    }
}
