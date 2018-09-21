package com.ltf.zs.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/backend/sysuser")
public class SysuserController {

    @RequestMapping("/login")
    public String login(String loginName, String password, HttpSession session, Model model){

        return "main";
    }

}
