package com.beamofsoul.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Justin on 2017-04-12 0012.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
