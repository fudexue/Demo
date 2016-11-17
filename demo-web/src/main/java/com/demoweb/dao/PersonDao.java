package com.demoweb.dao;

import com.demoweb.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by fudexue on 16/10/25.
 */
@Mapper
public interface PersonDao {
    @Select("SELECT id, first_name AS firstName, last_name AS lastName, birth_date AS birthDate, sex, phone_no AS phoneNo FROM t_person WHERE id=#{0};")
    public Person getPersonById(int id);
}
