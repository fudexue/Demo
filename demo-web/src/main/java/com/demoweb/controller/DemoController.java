package com.demoweb.controller;

import com.demoweb.entity.Person;
import com.demoweb.service.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    private DemoServiceImpl demoService;

    @RequestMapping("/test")
    String home(HttpServletRequest request, HttpServletResponse response, Map<String, Object> model) {
        System.out.println("test DemoController");
        String idStr = request.getParameter("id");
        Person person = demoService.getPersonById(Long.parseLong(idStr));
        Person person2 = demoService.getPersonById(2L);
        System.out.println(person.getName()+" "+person2.getName());
        return "person";
    }
}
