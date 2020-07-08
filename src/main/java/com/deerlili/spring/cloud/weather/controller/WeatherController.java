package com.deerlili.spring.cloud.weather.controller;

import com.deerlili.spring.cloud.weather.entity.WeatherResponse;
import com.deerlili.spring.cloud.weather.service.WeatherDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
@Api(value = "天气接口",description = "天气接口")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityid/{cityid}")
    @ApiOperation(value = "根据城市id获取", notes = "根据城市id获取")
    public WeatherResponse getWeatherByCityId(@PathVariable("cityid") String cityid) {
        return weatherDataService.getDataByCityId(cityid);
    }

    @GetMapping("/cityName/{cityName}")
    @ApiOperation(value = "根据城市名称获取", notes = "根据城市名称获取")
    public WeatherResponse getWeatherByCityName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }
}
