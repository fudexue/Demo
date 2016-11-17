package com.demoweb.controller;

import com.demoweb.entity.Person;
import com.demoweb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.extensions.compactnotation.PackageCompactConstructor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by fudexue on 16/10/25.
 */
@Controller
@RestController
public class DemoController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/test")
    String home(HttpServletRequest request, HttpServletResponse response, Map<String, Object> model) {
        System.out.println("test DemoController");
        String idStr = request.getParameter("id");
        Person person = personService.getPersonById(Long.parseLong(idStr));
        personService.getPersonById(2L);
        return "person";
    }
}
