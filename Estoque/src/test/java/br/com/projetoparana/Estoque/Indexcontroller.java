package br.com.projetoparana.Estoque;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Indexcontroller {
	
	@RequestMapping
	public String Index() {
		return "index";
	}

}
