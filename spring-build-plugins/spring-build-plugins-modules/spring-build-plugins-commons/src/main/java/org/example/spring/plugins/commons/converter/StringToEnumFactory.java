package org.example.spring.plugins.commons.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.util.HashMap;
import java.util.Map;

public class StringToEnumFactory implements ConverterFactory<String, IBaseEnum> {

    @Override
    public <T extends IBaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToEnum<>(targetType);
    }

    public static class StringToEnum<T extends IBaseEnum> implements Converter<String, T> {
        private final Map<String, T> map;

        public StringToEnum(Class<T> type) {
            T[] arrays = type.getEnumConstants();
            map = new HashMap<>(arrays.length);
            for (T array : arrays) {
                for (String s : array.getValueArrays()) {
                    map.put(s, array);
                }
            }
        }


        @Override
        public T convert(String source) {
            if (map.containsKey(source)) {
                return map.getOrDefault(source, null);
            } else {
                return null;
            }
        }
    }

}