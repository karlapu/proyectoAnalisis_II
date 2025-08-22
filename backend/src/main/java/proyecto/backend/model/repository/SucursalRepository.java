package proyecto.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.backend.model.entity.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {

}