package com.opscruise.jsonprocess.controller;

import com.opscruise.jsonprocess.Person;
import com.opscruise.jsonprocess.service.JsonProcessService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonProcessController {

    @Autowired
    JsonProcessService jsonProcessService;

    @PostMapping(
            value = "/validateJson", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> validateJson(@RequestBody Person person) {
        return jsonProcessService.validateJson(person);
    }

	
}
