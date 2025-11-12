package com.example.cavosh.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cavosh.Models.Productos;
import com.example.cavosh.Services.ProductosServices;

@RestController
@RequestMapping("/Productos")
public class ProductosControllers {
    @Autowired
    private ProductosServices productosServices;

    @PostMapping
    public ResponseEntity<?> PostProductos(@RequestBody Productos producto) {
        return ResponseEntity.ok(productosServices.PostProductos(producto));
    }

    @GetMapping
    public ResponseEntity<List<Productos>> GetProductos() {
        return ResponseEntity.ok(productosServices.GetProductos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteProductos(@PathVariable Long id) {
        return ResponseEntity.ok(productosServices.DeleteProductos(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> PutProductos(@RequestBody Productos producto, @PathVariable Long id) {
        return ResponseEntity.ok(productosServices.PutProductos(producto, id));
    }

}
