package com.ivlai.templates.ssm.test;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class ObjectMapperTest {

    public static void main(String[] args) throws JsonProcessingException {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(integers);
        System.out.println(s);

    }

}
