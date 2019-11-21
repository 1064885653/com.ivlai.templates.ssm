package com.ivlai.templates.ssm.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * 字符串工具
 */
public class JsonUtil {

    /**
     * json转换object
     */
    public Object jsonToObject(String json, Class c) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, c);
    }

    /**
     * object转json
     */
    public String objectToJson(Object o) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(o);
    }

}
