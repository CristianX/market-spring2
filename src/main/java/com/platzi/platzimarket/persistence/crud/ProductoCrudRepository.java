package com.platzi.platzimarket.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.platzi.platzimarket.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery
    // = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    // LessThanAnd para implementar la operación de menor que y verificar si el
    // Estado es true
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
