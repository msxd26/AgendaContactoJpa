package pe.jsaire.agendacontacto.web.app.models.service;

import pe.jsaire.agendacontacto.web.app.models.entity.Usuario;

import java.util.List;


public interface IUsuarioService {
    public List<Usuario> findAll();
    public void save(Usuario usuario);
    public Usuario findOne(Long id);
    public void delete(Long id);

}
