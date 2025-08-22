package proyecto.backend.model.service;

import java.util.List;
import proyecto.backend.model.entity.StatusUsuario;

public interface StatusUsuarioService {

    List<StatusUsuario> findAll();

    StatusUsuario findById(Integer id);

    StatusUsuario create(StatusUsuario t);

    StatusUsuario update(Integer id, StatusUsuario t);

    void delete(Integer id);

}
