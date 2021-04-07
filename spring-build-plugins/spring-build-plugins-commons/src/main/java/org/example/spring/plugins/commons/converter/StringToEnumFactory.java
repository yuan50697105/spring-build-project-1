package org.example.spring.plugins.commons.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StringToEnumFactory implements ConverterFactory<String, IBaseEnum> {
    @Override
    public <T extends IBaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return null;
    }

    public static class StringToEnum<T extends IBaseEnum> implements Converter<String, T> {
        private final Map<String, T> map;

        public StringToEnum(Class<T> type) {
            T[] arrays = type.getEnumConstants();
            this.map = new HashMap<>(arrays.length);
            for (T array : arrays) {
                for (String s : array.getValueArrays()) {
                    this.map.put(s, array);
                }
            }
        }


        @Override
        public T convert(String source) {
            return this.map.getOrDefault(source, null);
        }
    }

}