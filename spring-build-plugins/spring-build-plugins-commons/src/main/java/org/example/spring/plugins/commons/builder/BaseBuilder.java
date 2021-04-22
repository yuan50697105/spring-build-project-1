package org.example.spring.plugins.commons.builder;

import org.mapstruct.*;
import org.mapstruct.control.DeepClone;

@MapperConfig(
        implementationPackage = "<PACKAGE_NAME>.impl"
        , componentModel = "spring"
        , nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL
        , nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
        , nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION
        , unmappedSourcePolicy = ReportingPolicy.IGNORE
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , mappingControl = DeepClone.class
        , collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED
        , injectionStrategy = InjectionStrategy.FIELD
)
public interface BaseBuilder {

}
