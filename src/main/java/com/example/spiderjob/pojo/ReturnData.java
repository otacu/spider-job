package com.example.spiderjob.pojo;

import java.io.Serializable;
import java.util.List;

public class ReturnData implements Serializable {
   private String name;
   private OpenData open_data;
   private List<Code> code_str;

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
     * @return open_data
     */
    public OpenData getOpen_data() {
        return open_data;
    }

    /**
     * @param open_data open_data
     */
    public void setOpen_data(OpenData open_data) {
        this.open_data = open_data;
    }

    /**
     * @return code_str
     */
    public List<Code> getCode_str() {
        return code_str;
    }

    /**
     * @param code_str code_str
     */
    public void setCode_str(List<Code> code_str) {
        this.code_str = code_str;
    }
}
