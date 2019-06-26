package br.com.etec.springboot.cadastrosp.springbootcommon.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.etec.springboot.cadastrosp.springbootcommon.Model.Aluno;
import br.com.etec.springboot.cadastrosp.springbootcommon.Repository.AlunoRepository;

@Controller
public class AlunoController {
@Autowired
private AlunoRepository aluno;

@RequestMapping("/")
public ModelAndView listar() {
	List<Aluno> lista = aluno.findAll();
	
	ModelAndView modelAndView = new ModelAndView("aluno");
	modelAndView.addObject("Aluno",lista);
	
	return modelAndView;
}
}
