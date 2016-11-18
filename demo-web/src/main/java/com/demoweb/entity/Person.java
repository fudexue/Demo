package com.demoweb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by fudexue on 16/10/25.
 */
@Data
public class Person implements Serializable{
    private int id;
    private String name;
    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

}
