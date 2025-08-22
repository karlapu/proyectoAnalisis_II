package proyecto.backend.model.service;

import java.util.List;
import proyecto.backend.model.entity.Usuario;

public interface UsuarioService {

    List<Usuario> findAll();

    Usuario findById(String idUsuario);

    Usuario create(Usuario u);

    Usuario update(String idUsuario, Usuario u);

    void delete(String idUsuario);

}
