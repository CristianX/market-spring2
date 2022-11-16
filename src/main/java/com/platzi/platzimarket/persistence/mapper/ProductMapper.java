package com.platzi.platzimarket.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.platzimarket.domain.Product;
import com.platzi.platzimarket.persistence.entity.Producto;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class}) // Cuando se requiera mapear una propiedad de tipo Category, se usará el CategoryMapper
public interface ProductMapper {

    @Mappings({
        @Mapping(source = "idProducto", target = "productId"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "idCategoria", target = "categoryId"),
        @Mapping(source = "codigoBarras", target = "barcode"),
        @Mapping(source = "precioVenta", target = "price"),
        @Mapping(source = "cantidadStock", target = "stock"),
        @Mapping(source = "estado", target = "active"),
        @Mapping(source = "categoria", target = "category")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration // Invierte la configuración de la función anterior
    @Mapping(target = "codigoBarras", ignore = true) // Ignora la propiedad codigoBarras
    Producto toProducto(Product product);
    
}
