package com.example.spiderjob.pojo;

import java.io.Serializable;

public class Code implements Serializable {
    private String code;
    private String name;
    private String color;

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
