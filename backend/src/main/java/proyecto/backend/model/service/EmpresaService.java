package proyecto.backend.model.service;

import java.util.List;
import proyecto.backend.model.entity.Empresa;

public interface EmpresaService {

    List<Empresa> findAll();

    Empresa findById(Integer id);

    Empresa create(Empresa e);

    Empresa update(Integer id, Empresa e);

    void delete(Integer id);
}