package controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import models.HelloWorld;
@Controller
public class GreetController {

	@RequestMapping("/helloworld")
	public ModelAndView handler() {

		 ModelAndView mv = new ModelAndView();
	        mv.setViewName("helloworld.jsp");
	        mv.addObject("result",
	                     "GeeksForGeeks Welcomes "
	                         + "you to Spring!");
	        return mv;
	}
}