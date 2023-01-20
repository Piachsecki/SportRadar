package com.example.app;

import com.example.app.classes.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.management.timer.TimerMBean;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.TimeZone;

@RestController
@RequestMapping(path = "/")
public class TestController {

    @PostMapping("/import")
    public void importData(@RequestBody List<Event> dto , MultipartFile servlet) {


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try(InputStream inputStream = servlet.getInputStream()) {
            String str = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            List<Event> events = objectMapper.readValue(str, objectMapper.getTypeFactory().constructCollectionType(List.class, Event.class));
            System.out.println();
        } catch(IOException ex) {
            ex.getMessage();
        }
    }
}