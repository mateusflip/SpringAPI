package br.com.alura.forum.controller.view;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UsuarioControllerView {

	@RequestMapping("/usuario")
	public String usuario() {
		
		return "usuario";
	}
}
