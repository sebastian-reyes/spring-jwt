package com.jwt.app.interfaceService;

import com.jwt.app.model.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductoService {
    public Page<Producto> listarProductos(Pageable pageable);
    public Producto buscarProducto(int id);
}
