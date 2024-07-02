//Aqui vamos a poner las direcciones que queremos que el cliente consuma
package com.denis.apirest.apirest.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denis.apirest.apirest.Repositories.ProductoRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.denis.apirest.apirest.Entities.Producto;



//Ya con estas lineas de codigo ya el cliente puede acceder a la insformacion mediante la url /Producto
@RestController
@RequestMapping("/Producto") 


public class ProductoController {
    @Autowired //REALIZAMOS UNA INYECCION DE UNA INSTANCIA DE NUESTRO REPOSITORIO   
    private ProductoRepositorio ProductoRepositorio;

    @GetMapping //GetMapping trae todos los productos no solo uno
    public List<Producto> getAllProductos(){
        return ProductoRepositorio.findAll(); //Retornamos todos los productos en la lista
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto){ //@RequestBody enviamos una peticion al cliente que va a tener un producto de tipo Producto
        return ProductoRepositorio.save(producto); //Se graba el producto y lo retornamos 
    }
}


