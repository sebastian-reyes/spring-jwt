package com.jwt.app.service;

import com.jwt.app.interfaceService.IProductoService;
import com.jwt.app.model.Producto;
import com.jwt.app.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepository repository;

    @Override
    public Page<Producto> listarProductos(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Producto buscarProducto(int id) {
        return repository.findById(id).orElse(null);
    }
}
