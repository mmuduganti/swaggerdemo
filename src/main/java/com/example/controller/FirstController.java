package com.example.controller;

import com.example.domain.FirstRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @RequestMapping(path="/first", method = RequestMethod.POST)
    public ResponseEntity<FirstRequest> first(@RequestBody FirstRequest firstRequest) {
        return ResponseEntity.ok(firstRequest);
    }

    @RequestMapping(path="/second", method = RequestMethod.POST)
    public FirstRequest second(@RequestBody FirstRequest firstRequest) {
        return firstRequest;
    }
}
