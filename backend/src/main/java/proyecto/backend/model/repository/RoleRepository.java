package proyecto.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.backend.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}