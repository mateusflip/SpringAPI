package br.com.alura.forum.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/usuarios")
	public String index() {
	
		return "usuarios";
	}

}
