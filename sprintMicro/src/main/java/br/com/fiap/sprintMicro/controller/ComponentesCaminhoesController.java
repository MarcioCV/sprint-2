package br.com.fiap.sprintMicro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.sprintMicro.model.ComponentesCaminhoes;
import br.com.fiap.sprintMicro.repository.ComponentesCaminhoesRepository;

@Controller
@RequestMapping("componentes")
public class ComponentesCaminhoesController {
	
private ComponentesCaminhoesRepository componentesCaminhoesRepository;

	@GetMapping
	public String returnView(Model model) {
		model.addAttribute("componentes", new ComponentesCaminhoes());
		return "cadastroComponentes";
	}
	
	@PostMapping("/register")
	public void create(@RequestBody ComponentesCaminhoes componentesCaminhoes) {
		this.componentesCaminhoesRepository.save(componentesCaminhoes);
	}

	@GetMapping("/{id}/delete")
	public void delete(Long id) {
		componentesCaminhoesRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public ComponentesCaminhoes findById(Long id) {
		return componentesCaminhoesRepository.getById(id);
	}
	
	@PutMapping("/{id}")
	public ComponentesCaminhoes Update(@RequestBody ComponentesCaminhoes componentesCaminhoes) {
		return this.componentesCaminhoesRepository.save(componentesCaminhoes);
	}
}
