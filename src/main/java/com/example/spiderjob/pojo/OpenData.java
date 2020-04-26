package com.example.spiderjob.pojo;

import java.io.Serializable;

public class OpenData implements Serializable {
    /**
     * 期号
     */
    private String expect;

    /**
     * 开奖时间
     */
    private String open_time;

    /**
     * 开奖号码
     */
    private String opencode;

    /**
     * @return expect
     */
    public String getExpect() {
        return expect;
    }

    /**
     * @param expect expect
     */
    public void setExpect(String expect) {
        this.expect = expect;
    }

    /**
     * @return open_time
     */
    public String getOpen_time() {
        return open_time;
    }

    /**
     * @param open_time open_time
     */
    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

    /**
     * @return opencode
     */
    public String getOpencode() {
        return opencode;
    }

    /**
     * @param opencode opencode
     */
    public void setOpencode(String opencode) {
        this.opencode = opencode;
    }
}
