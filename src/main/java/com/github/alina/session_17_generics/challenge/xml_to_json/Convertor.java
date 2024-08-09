package com.github.alina.session_17_generics.challenge.xml_to_json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Convertor {
    public static void main(String[] args) throws IOException {
        XmlMapper mapper = new XmlMapper();
        XmlMapper xmlMapper = new XmlMapper();
        File file = new File("/Users/alina/Desktop/JavaCourseStartSteps/ExerciseAlgoritm/itschool1/src/main/java/com/github/alina/session_17_generics/challenge/xml_to_json/library.xml");
        BookStore bookStore = xmlMapper.readValue(file, BookStore.class);
        System.out.println(bookStore);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("/Users/alina/Desktop/JavaCourseStartSteps/ExerciseAlgoritm/itschool1/src/main/java/com/github/alina/session_17_generics/challenge/xml_to_json/library.json"), bookStore);
    }
}
