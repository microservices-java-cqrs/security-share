package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> String convertoToJson(T object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }

    public static <T> T convertToObject(String json, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(json, clazz);
    }
}
