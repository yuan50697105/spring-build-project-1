package org.example.spring.plugins.web;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.converter.StringToEnumFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@AllArgsConstructor
public class WebMvcConfiguration implements WebMvcConfigurer {
    private final StringToEnumFactory stringToEnumFactory;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(stringToEnumFactory);
    }
}