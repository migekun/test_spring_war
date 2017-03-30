package org.formacio.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	@RequestMapping(path="/")
	@ResponseBody
	public String saluda() {
		return "Adeu i sort amb Spring MVC! Gracias Domingo!!!";
	}
	
}
