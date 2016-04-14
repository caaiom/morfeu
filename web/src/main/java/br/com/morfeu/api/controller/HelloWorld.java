package br.com.morfeu.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cmaia on 14/04/16
 */
@Controller
public class HelloWorld {

    @RequestMapping(name = "/hello", method = RequestMethod.GET)
    public ResponseEntity hello() {
        return new ResponseEntity<>("Hello!", HttpStatus.OK);
    }
}
