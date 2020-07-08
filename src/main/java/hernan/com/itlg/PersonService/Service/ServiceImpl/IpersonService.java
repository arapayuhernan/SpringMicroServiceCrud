package hernan.com.itlg.PersonService.Service.ServiceImpl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import hernan.com.itlg.PersonService.Model.Entity.Persona;


public interface IpersonService{

		public List<Persona> ListarPersonas(Persona persona);
		
		public Persona CrearPersona(Persona persona);
		
		public void  EliminarPersonaPorId(Long id);
		
		public Persona EncontrarPersonaPorId(Long id);
		
		public Persona ActualizarPersona(Persona persona);
		
		
}
