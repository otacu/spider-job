package com.example.spiderjob;


import com.alibaba.fastjson.JSON;
import com.egoist.parent.common.utils.http.EgoistOkHttp3Util;
import com.example.spiderjob.pojo.ReturnData;


public class Test1 {
    public static void main(String[] args) throws Exception {
        String json = EgoistOkHttp3Util.get("http://16880908.com/index.php?s=/Home/Heat/newopen&id=10");
        ReturnData returnData = JSON.parseObject(json, ReturnData.class);
        System.out.println(JSON.toJSONString(returnData));
    }
}
