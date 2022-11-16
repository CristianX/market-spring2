package com.platzi.platzimarket.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.platzimarket.domain.Category;
import com.platzi.platzimarket.persistence.entity.Categoria;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration // Invierte la configuración de la función anterior
    @Mapping(target = "productos", ignore = true) // Ignora la propiedad productos
    Categoria toCategoria(Category category);
}
