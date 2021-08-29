package com.opscruise.jsonprocess.service;

import com.opscruise.jsonprocess.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class JsonProcessService {

    public ResponseEntity<String> validateJson(Person person) {

        if(person.getPersonId() == 1){
            return new ResponseEntity<>(
                    "Person Id is 1 ",
                    HttpStatus.OK);
        } else {
            return new ResponseEntity<>(
                    "Person Id is not 1",
                    HttpStatus.BAD_REQUEST);
        }
    }
}
