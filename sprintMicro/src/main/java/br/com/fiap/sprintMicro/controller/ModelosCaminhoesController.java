package br.com.fiap.sprintMicro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.sprintMicro.model.ModelosCaminhoes;
import br.com.fiap.sprintMicro.repository.ModelosCaminhoesRepository;

@Controller
@RequestMapping("modelos")
public class ModelosCaminhoesController {
	
private ModelosCaminhoesRepository modelosCaminhoes;

	@GetMapping
	public String returnView(Model model) {
		model.addAttribute("modelo", new ModelosCaminhoes());
		return "menuModelos";
	}
	
	@PostMapping("/register")
	public void createUser(@RequestBody ModelosCaminhoes modelosCaminhoes) {
		this.modelosCaminhoes.save(modelosCaminhoes);
	}

	@GetMapping("/{id}/delete")
	public void deleteUser(Long id) {
		modelosCaminhoes.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public ModelosCaminhoes findModeloById(Long id) {
		return modelosCaminhoes.getById(id);
	}
	
	@PutMapping("/{id}")
	public ModelosCaminhoes UpdateModelos(@RequestBody ModelosCaminhoes modelosCaminhoes) {
		return this.modelosCaminhoes.save(modelosCaminhoes);
	}
}
