package com.example.cavosh.Services;
import java.util.List;

import com.example.cavosh.Models.Productos;

public interface ProductosServices {
    List<Productos> GetProductos();

    String DeleteProductos(Long id);

    String PostProductos(Productos productos);

    String PutProductos(Productos producto, Long id);


}
