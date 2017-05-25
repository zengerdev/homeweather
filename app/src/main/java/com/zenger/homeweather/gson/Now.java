package com.zenger.homeweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Apple ios on 2017/5/25.
 */

public class Now {
    @SerializedName("tmp")
    public String tempetature;

    @SerializedName("cond")
    public  More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
