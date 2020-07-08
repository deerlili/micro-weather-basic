package com.deerlili.spring.cloud.weather.service.impl;

import com.deerlili.spring.cloud.weather.entity.WeatherResponse;
import com.deerlili.spring.cloud.weather.service.WeatherDataService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @author deerlili
 * @Classname WeatherDataServiceImpl
 * @Description WeatherDataSerive 实现.
 * @Date 2020-07-08 09:40
 * @Version V1.0
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";

    @Autowired
    private RestTemplate restTemplate;//注入Rest client客户端

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_URI + "citykey=" + cityId;
        return doGetWeather(uri);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_URI + "city=" + cityName;
        return doGetWeather(uri);
    }

    private WeatherResponse doGetWeather(String uri) {
        ResponseEntity<String> forEntity = restTemplate.getForEntity(uri, String.class);

        WeatherResponse weatherResponse = null;
        ObjectMapper objectMapper = new ObjectMapper(); //jackson
        String strBody = null;

        if (forEntity.getStatusCodeValue() == 200) {
            strBody = forEntity.getBody();
        }

        try {
            weatherResponse = objectMapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return weatherResponse;
    }
}
