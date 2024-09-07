package org.chai.SpringBootWeb1.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.chai.SpringBootWeb1.model.Sum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home called");
        return "index";
    }

//    @RequestMapping("result")
//    public String result(HttpServletRequest req, HttpSession session) {
//        int num1 = Integer.parseInt(req.getParameter("number1"));
//        int num2 = Integer.parseInt(req.getParameter("number2"));
//        int result = num1 + num2;
//        session.setAttribute("result",result);
//        System.out.println("Result called");
//        return "result.jsp";
//    }

//    @RequestMapping("result")
//    public String result(@RequestParam("number1") int num1, @RequestParam("number2") int num2, Model model) {
//        int result = num1 + num2;
//        model.addAttribute("result",result);
//        System.out.println("Result called");
//        return "result"; //suffix prefix configured for view resolver at app.prop
//    }

//    @RequestMapping("result")
//    public ModelAndView result(@RequestParam("number1") int num1, @RequestParam("number2") int num2, ModelAndView mv) {
//        int result = num1 + num2;
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        System.out.println("Result called");
//        return mv; //returning ModelAndView obj
//    }


//    @RequestMapping("result")
//    public ModelAndView result(@RequestParam("number1") int num1, @RequestParam("number2") int num2, ModelAndView mv) {
//        int result = num1 + num2;
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        System.out.println("Result called");
//        return mv; //returning ModelAndView obj
//    }

    @RequestMapping("result")
    public String result(@ModelAttribute("sm") Sum sm) {
        System.out.println("Result called");
        System.out.println(sm.ans()); // This will print the result in the console
        return "result";
    }

}
