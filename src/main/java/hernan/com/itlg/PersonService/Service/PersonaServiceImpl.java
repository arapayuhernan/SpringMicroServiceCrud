package hernan.com.itlg.PersonService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hernan.com.itlg.PersonService.Model.IPersonaDao;
import hernan.com.itlg.PersonService.Model.Entity.Persona;
import hernan.com.itlg.PersonService.Service.ServiceImpl.IpersonService;

@Service
public class PersonaServiceImpl implements IpersonService  {

	@Autowired
	public IPersonaDao dao;
	
	@Override
	public List<Persona> ListarPersonas(Persona persona) {
		
		List<Persona> personas = dao.findAll();
		
		
		
		return personas;
	}

	@Override
	public Persona CrearPersona(Persona persona) {
		
		
		
			return dao.save(persona);
	}
	
	
	

	@Override
	public void EliminarPersonaPorId(Long id) {
		dao.deleteById(id);
		
	}

	@Override
	public Persona EncontrarPersonaPorId(Long id) {
		
		return dao.findById(id).orElse(null);
	}

	@Override
	public Persona ActualizarPersona(Persona persona) {
		
		return dao.save(persona);
	}

	
	
	
	
	
}
