package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.UnidMedida;
import pe.edu.upeu.sysventas.repository.IDCrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.UnidadMedidaRepository;

public class UnidadMedidaServiceImp extends CrudGenericoServiceImp<UnidMedida, Long> {

    private final UnidadMedidaRepository unidadMedidaRepository;

    public UnidadMedidaServiceImp(UnidadMedidaRepository unidadMedidaRepository) {
        this.unidadMedidaRepository = unidadMedidaRepository;
    }


    @Override
    protected IDCrudGenericoRepository<UnidMedida, Long> getRepo() {
        return unidadMedidaRepository;
    }
}

