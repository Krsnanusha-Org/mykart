package com.krsna.mykart.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.krsna.mykart.model.MyKartUser;
import com.krsna.mykart.model.User;

@Controller
public class LoginController {
	
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    
    @RequestMapping(value = "/loginFailed", method = RequestMethod.GET)
    public String loginError(Model model) {
        log.info("Login attempt failed");
        model.addAttribute("error", "true");
        return "login";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus session) {
    	System.out.println("LoginController.logout()");
        SecurityContextHolder.getContext().setAuthentication(null);
        session.setComplete();
        return "redirect:/login";
    }
    
    @RequestMapping(value = "/postLogin", method = RequestMethod.POST)
    public String postLogin(Model model, HttpSession session) {
        log.info("postLogin()");
        // read principal out of security context and set it to session
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        validatePrinciple(authentication.getPrincipal());
        User loggedInUser = ((MyKartUser) authentication.getPrincipal()).getUserDetails();
        model.addAttribute("currentUser", loggedInUser.getUsername());
        session.setAttribute("userId", loggedInUser.getId());
        return "redirect:/dashboard";
    }
   
    
    private void validatePrinciple(Object principal) {
        if (!(principal instanceof MyKartUser)) {
            throw new  IllegalArgumentException("Principal can not be null!");
        }
    }

}
