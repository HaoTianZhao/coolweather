package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 赵 on 2017/3/29.
 */

//@SerializedName注解，可以让JSON字段(不适合直接作为Java字段来命名的部分)
// 和Java字段之间建立映射关系
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
