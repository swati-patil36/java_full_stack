package com.swati.SpringBootWebThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller 
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home Method called");
        return "index";
    }
    
    // This uses the servlet concept
    // @RequestMapping("add")
    // public String add(HttpServletRequest req, HttpSession session){
    //     int num1 = Integer.parseInt(req.getParameter("num1"));
    //     int num2 = Integer.parseInt(req.getParameter("num2"));
    //     int result = num1 + num2;
    //     System.out.println("Result is "+result);

    //     session.setAttribute("result", result);
    //     return "result.jsp";
    // }

    // Here we are getting red of HttpServletRequest
    // @RequestMapping("add")
    // public String add(int num1, int num2, HttpSession session){  // But here the variable name should be same as the name in the index.jsp file
    //     // else we can use it as .. 
    //     // public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, HttpSession session){
    //     //      int result = n1+n2+1;
    //     //      ......
    //     //}
    //     int result = num1 + num2 + 5;
    //     System.out.println("Result is "+result);

    //     session.setAttribute("result", result);
    //     return "result.jsp";
    // }

    // //Now getting rid of HttpSession
    // @RequestMapping("add")
    // public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, Model model){ 
    //     int result = n1 + n2 + 5;
    //     System.out.println("Result is "+result);
    //     model.addAttribute("result", result);
    //     return "result";
    // }

    
    // // Now using ModelAndView
    // @RequestMapping("add")
    // public ModelAndView add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, ModelAndView mv){ 
    //     int result = n1 + n2 + 5;
    //     System.out.println("Result is "+result);
    //     mv.addObject("result", result);
    //     mv.setViewName("result");
    //     return mv;
    // }


    // // Need for Model Attribute
    // @RequestMapping("addAlien")
    // public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){ 
        
    //     Alien alien = new Alien();
    //     alien.setAid(aid);
    //     alien.setAname(aname);
    //     mv.addObject("alien", alien);
    //     mv.setViewName("result");
    //     return mv;
    // }

    // Using Model Attribute
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien){ //No need for @ModelAttribute also 
        
        return "result";
    }
}
