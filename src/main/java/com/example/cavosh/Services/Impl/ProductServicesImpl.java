package com.example.cavosh.Services.Impl;

import com.example.cavosh.Models.Productos;
import com.example.cavosh.Repository.ProductosRepository;
import com.example.cavosh.Services.ProductosServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductServicesImpl implements ProductosServices {

    @Autowired
    private ProductosRepository productosRepository;

    @Override
    public List<Productos> GetProductos() {
        return productosRepository.findAll();
    }

    @Override
    public String PostProductos(Productos producto) {
        productosRepository.save(producto);
        return "Producto Guardado";
    }

    @Override
    public String PutProductos(Productos producto, Long id) {
        Productos producto1 = productosRepository.findById(id).get();

        if (producto1 != null) {
            producto1.setNombre(producto.getNombre());
            producto1.setPrecio(producto.getPrecio());
            productosRepository.save(producto1);
            return "Producto Actualizado";
        } else {
            return "Hubo un error";
        }
    }

    @Override
    public String DeleteProductos(Long id) {
        productosRepository.deleteById(id);
        return "Producto Eliminado";
    }
}
