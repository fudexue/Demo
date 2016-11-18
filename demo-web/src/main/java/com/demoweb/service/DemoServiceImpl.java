package com.demoweb.service;

import com.demoweb.dao.PersonDao;
import com.demoweb.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fudexue on 16/10/25.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private PersonDao personDAO;
    public Person getPersonById(Long id) {
        System.out.println("getPersonById service"+id);
        Person person2 = personDAO.findById(id);
//        Person person2 = new Person();
        return person2;
    }
}
