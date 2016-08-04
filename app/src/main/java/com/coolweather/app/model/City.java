package com.coolweather.app.model;

/**
 * Created by Lenovo on 2016/8/4.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public String  getCityCode(){
        return cityCode;
    }
    public void setCityCode(String cityCode){
        this.cityCode  = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
