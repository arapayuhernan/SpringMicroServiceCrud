package hernan.com.itlg.PersonService.Model;

import org.springframework.data.jpa.repository.JpaRepository;

import hernan.com.itlg.PersonService.Model.Entity.Persona;

public interface IPersonaDao extends JpaRepository<Persona,Long> {

}
