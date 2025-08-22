package proyecto.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.backend.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}