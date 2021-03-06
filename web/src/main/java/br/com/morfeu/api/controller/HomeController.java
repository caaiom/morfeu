package br.com.morfeu.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by cmaia on 14/04/16
 */
@Controller
public class HomeController {

    private static final String INDEX_VIEW = "home/index";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView(INDEX_VIEW);
    }
}
