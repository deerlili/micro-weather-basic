package com.deerlili.spring.cloud.weather.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author deerlili
 * @Classname WeatherResponse
 * @Description 天气响应数据
 * @Date 2020-07-08 09:35
 * @Version V1.0
 */
@Data
public class WeatherResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Weather data;
    private Integer status;
    private String desc;
}
