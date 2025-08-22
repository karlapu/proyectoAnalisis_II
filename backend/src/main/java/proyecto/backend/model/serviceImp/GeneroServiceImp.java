package proyecto.backend.model.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import proyecto.backend.model.entity.Genero;
import proyecto.backend.model.repository.GeneroRepository;
import proyecto.backend.model.service.GeneroService;

@Service
public class GeneroServiceImp implements GeneroService {

    private final GeneroRepository repository;

    public GeneroServiceImp(GeneroRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Genero> findAll() {
        return repository.findAll();
    }

    @Override
    public Genero findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Genero create(Genero g) {
        return repository.save(g);
    }

    @Override
    public Genero update(Integer id, Genero g) {
        Genero generoDb = repository.findById(id).orElse(null);
        if (generoDb != null) {
            generoDb.setNombre(g.getNombre());
            return repository.save(generoDb);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
