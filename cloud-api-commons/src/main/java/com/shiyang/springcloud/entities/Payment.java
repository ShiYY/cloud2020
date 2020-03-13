package com.shiyang.springcloud.entities;

import java.io.Serializable;

/**
 * @author shiyang date: 2020/3/13
 */
public class Payment implements Serializable {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
