package com.demoweb.service;

import com.demoweb.dao.PersonDao;
import com.demoweb.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fudexue on 16/10/25.
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao personDAO;
    public Person getPersonById(Long id) {
        System.out.println("getPersonById service"+id);
        Person person2 = personDAO.getPersonById(2);
        return person2;
    }
}
