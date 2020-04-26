
package com.example.spiderjob.task;

import com.alibaba.fastjson.JSON;
import com.egoist.parent.common.utils.http.EgoistOkHttp3Util;
import com.example.spiderjob.config.Config;
import com.example.spiderjob.pojo.FmsData;
import com.example.spiderjob.pojo.ReturnData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.*;

@Slf4j
@Component
public class Task16880908com {

    @Autowired
    private Config CONFIG;

    @Scheduled(cron = "0 */5 * * * ?")
    public void run(){
        try {
            String json = EgoistOkHttp3Util.get(CONFIG.getWEBSITE_URL());
            ReturnData returnData = JSON.parseObject(json, ReturnData.class);
            FmsData fmsData = new FmsData();
            fmsData.setType(returnData.getName());
            fmsData.setTermNo(returnData.getOpen_data().getExpect());
            fmsData.setDrawDate(returnData.getOpen_data().getOpen_time());
            fmsData.setDrawNumber(returnData.getOpen_data().getOpencode());
            fmsData.setSum(returnData.getCode_str().get(0).getName()
                    + ","
                    + returnData.getCode_str().get(1).getName()
                    + ","
                    + returnData.getCode_str().get(2).getName());
            fmsData.setDragonTiger(returnData.getCode_str().get(3).getName()
                    + ","
                    + returnData.getCode_str().get(4).getName()
                    + ","
                    + returnData.getCode_str().get(5).getName()
                    + ","
                    + returnData.getCode_str().get(6).getName()
                    + ","
                    + returnData.getCode_str().get(7).getName());
            save(fmsData);
        } catch (Exception e) {
            log.error("报错", e);
        }
    }

    public void save(FmsData fmsData) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(CONFIG.getJDBC_DRIVER());
            conn = DriverManager.getConnection(CONFIG.getDB_URL(), CONFIG.getUSER(), CONFIG.getPASS());
            stmt = conn.createStatement();

            String sql = String.format("insert into tb_fms_data (type,term_no,draw_date,draw_number,sum,dragon_tiger) values ('%s','%s','%s','%s','%s','%s')"
                    , fmsData.getType(), fmsData.getTermNo(), fmsData.getDrawDate(), fmsData.getDrawNumber(), fmsData.getSum(), fmsData.getDragonTiger());
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                log.info("插入数据"+JSON.toJSONString(fmsData));
            }
        } catch (SQLIntegrityConstraintViolationException e) {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }
    }

}
