package com.example.spiderjob.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Value("${my.jdbc.driver}")
    private String JDBC_DRIVER;
    @Value("${my.db.url}")
    private String DB_URL;
    @Value("${my.db.username}")
    private String USER;
    @Value("${my.db.password}")
    private String PASS;
    @Value("${my.website.url}")
    private String WEBSITE_URL;

    /**
     * @return JDBC_DRIVER
     */
    public String getJDBC_DRIVER() {
        return JDBC_DRIVER;
    }

    /**
     * @return USER
     */
    public String getUSER() {
        return USER;
    }

    /**
     * @return PASS
     */
    public String getPASS() {
        return PASS;
    }

    /**
     * @return DB_URL
     */
    public String getDB_URL() {
        return DB_URL;
    }

    /**
     * @return WEBSITE_URL
     */
    public String getWEBSITE_URL() {
        return WEBSITE_URL;
    }
}
