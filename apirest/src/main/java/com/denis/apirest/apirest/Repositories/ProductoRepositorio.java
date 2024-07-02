package com.denis.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denis.apirest.apirest.Entities.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long>{ //<NombreDeLaIdentidadProducto, tipoDeDatoDelIdentificadorID>

}
