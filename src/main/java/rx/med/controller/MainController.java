package rx.med.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	String message = "You have selected this medicine!";
	@RequestMapping("/pharmacy")
	public ModelAndView showMessage(
			@RequestParam(value = "medicine", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
