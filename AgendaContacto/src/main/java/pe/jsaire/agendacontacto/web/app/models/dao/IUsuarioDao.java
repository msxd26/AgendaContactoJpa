package pe.jsaire.agendacontacto.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import pe.jsaire.agendacontacto.web.app.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long > {
}
