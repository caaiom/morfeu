package br.com.morfeu.api.controller;

import br.com.morfeu.api.model.generate.GenerateApiViewModel;
import br.com.morfeu.api.service.generate.GenerateApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cmaia on 14/04/16
 */
@Controller
public class GenerateController {

    @Autowired
    private GenerateApiService generateApiService;

    @RequestMapping(value = "/generate")
    public ResponseEntity generate(@RequestBody final GenerateApiViewModel request){
        try {
            return generateApiService.generate(request);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
