package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.model.Producto;
public class ProductoRepository extends AbstactJpaRepository<Producto, Long> {
    private long sequence=1;

    @Override
    protected Long getId(Producto entity) {
        return entity.getIdProducto();
    }

    @Override
    protected void setId(Producto entity, Long id) {
        entity.getIdProducto();

    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
