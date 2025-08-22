package proyecto.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.backend.model.entity.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Integer> {
}