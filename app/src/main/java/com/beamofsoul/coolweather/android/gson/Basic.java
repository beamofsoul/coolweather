package com.beamofsoul.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Justin on 2017-04-12 0012.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
