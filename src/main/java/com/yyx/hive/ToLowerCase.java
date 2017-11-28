package com.yyx.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

public class ToLowerCase extends UDF {

    public  String evaluate(String fields) {
        return fields.toLowerCase();
    }

}
