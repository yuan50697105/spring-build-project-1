package org.example.spring.infrastructures.commons;

import org.mapstruct.*;
import org.mapstruct.control.DeepClone;

@MapperConfig(
        implementationPackage = "<PACKAGE_NAME>.impl"
        , componentModel = "spring"
        , nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL
        , nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
        , nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
        , unmappedSourcePolicy = ReportingPolicy.IGNORE
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , mappingControl = DeepClone.class
        , collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED
        , injectionStrategy = InjectionStrategy.FIELD
)
public interface BaseBuilder {
}
