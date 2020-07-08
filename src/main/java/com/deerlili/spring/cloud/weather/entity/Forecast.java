package com.deerlili.spring.cloud.weather.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Forecast implements Serializable{

    private static final long serialVersionUID = 1L;

    private String date; //日期
    private String high; //最高温
    private String fengli; //风力
    private String low; //最低温
    private String fengxiang; //风向
    private String type; //天气类型

}
