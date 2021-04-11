package org.example.spring.infrastructures.commons;

import org.mapstruct.*;

@MapperConfig(
        implementationPackage = "<PACKAGE_NAME>.impl"
        , componentModel = "spring"
        , nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL
        , nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
        , nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
        , unmappedSourcePolicy = ReportingPolicy.IGNORE
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface BaseBuilder {
}
