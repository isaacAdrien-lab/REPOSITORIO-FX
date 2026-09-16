package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.Producto;
import pe.edu.upeu.sysventas.repository.IDCrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.ProductoRepository;
import pe.edu.upeu.sysventas.service.IProductoService;

public class ProductoRepositoryImp extends CrudGenericoServiceImp<Producto, Long> implements IProductoService {

    private final ProductoRepository productoRepository;


    public ProductoRepositoryImp(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    @Override
    protected IDCrudGenericoRepository<Producto, Long> getRepo() {
        return null;
    }
}
