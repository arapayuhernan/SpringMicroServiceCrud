package hernan.com.itlg.PersonService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hernan.com.itlg.PersonService.Model.Entity.Persona;
import hernan.com.itlg.PersonService.Service.PersonaServiceImpl;

@RequestMapping("/Persona")
@RestController
public class PersonaController {
	
	
	
	@Autowired
	public PersonaServiceImpl service;

	
	
	@GetMapping("/lista")
	public List<Persona> crear(Persona persona){
		
		return service.ListarPersonas(persona);
	}
	
	
	
	
	
	
}
