package proyecto.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.backend.model.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}