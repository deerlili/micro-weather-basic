package com.deerlili.spring.cloud.weather.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author deerlili
 * @Classname Yesterday
 * @Description 昨日天气
 * @Date 2020-07-08 09:32
 * @Version V1.0
 */
@Data
public class Yesterday implements Serializable {
    private static final long serialVersionUID = 1L;

    private String date; //日期
    private String high; //最高温
    private String fx; //风向
    private String low; //最低温
    private String fl; //风力
    private String type; //天气类型

}
