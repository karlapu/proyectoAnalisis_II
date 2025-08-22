package proyecto.backend.model.service;

import java.util.List;
import proyecto.backend.model.entity.Genero;

public interface GeneroService {

    List<Genero> findAll();

    Genero findById(Integer id);

    Genero create(Genero g);

    Genero update(Integer id, Genero g);

    void delete(Integer id);
}