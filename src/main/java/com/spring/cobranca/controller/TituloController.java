package com.spring.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.cobranca.model.Titulo;
import com.spring.cobranca.repository.TituloRepository;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@Autowired
	private TituloRepository tituloRepository;
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
		tituloRepository.save(titulo);
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Título salvo com sucesso!");
		return mv;
	}

}
