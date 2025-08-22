package proyecto.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.backend.model.entity.StatusUsuario;

public interface StatusUsuarioRepository extends JpaRepository<StatusUsuario, Integer> {
}