package br.com.fiap.sprintMicro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.com.fiap.sprintMicro.model.User;
import br.com.fiap.sprintMicro.repository.UserRepository;

@Controller
@RequestMapping("users")
public class UsuarioController {
	
	private UserRepository userRepository;
	
	@GetMapping
	public String returnView(Model model) {
		model.addAttribute("user", new User());
		return "menuUsuario";
	}
	
	@PostMapping("/register")
	public RedirectView createUser(@ModelAttribute("user") User user, RedirectAttributes attrs) {
		userRepository.save(user);
		
		RedirectView redirectView = new RedirectView("/user");
		return redirectView;
	}

	@GetMapping("/{id}/delete")
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public User findUserById(Long id) {
		return userRepository.getById(id);
	}
	
	@PutMapping("/{id}")
	public User UpdateUser(User user) {
		return this.userRepository.save(user);
	}
}
