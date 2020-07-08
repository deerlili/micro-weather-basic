package com.deerlili.spring.cloud.weather.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author deerlili
 * @Classname Weather
 * @Description 天气数据
 * @Date 2020-07-08 09:33
 * @Version V1.0
 */

@Data
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    private Yesterday yesterday;
    private String city;
    private List<Forecast> forecast;
    private String ganmao; //感冒
    private String wendu; //温度

}
