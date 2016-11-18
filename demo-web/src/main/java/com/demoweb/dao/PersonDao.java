package com.demoweb.dao;

import com.demoweb.entity.Person;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by fudexue on 16/10/25.
 */
@Repository
public class PersonDao {
    @Autowired
    protected SqlSession sqlSession;

    public final String nameSpace = "Person";


    /**
     *
     * @param id
     * @return
     */
    public Person findById(Long id) {
        return this.sqlSession.selectOne(this.sqlId("findById"), id);
    }

    protected String sqlId(String id) {
        return this.nameSpace + "." + id;
    }
}
