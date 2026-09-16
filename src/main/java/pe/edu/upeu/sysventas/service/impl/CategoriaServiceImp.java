package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.repository.CategoriaRepository;
import pe.edu.upeu.sysventas.repository.IDCrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICategoriaService;

public class CategoriaServiceImp extends CrudGenericoServiceImp<Categoria, Long> {
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImp(CategoriaRepository categoriaRepository){
        this.categoriaRepository=categoriaRepository;
    }


    @Override
    protected IDCrudGenericoRepository<Categoria, Long> getRepo() {
        return null;
    }
}

