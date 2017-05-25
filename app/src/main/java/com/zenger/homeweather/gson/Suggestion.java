package com.zenger.homeweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Apple ios on 2017/5/25.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carwash;

    public Sport sport;

    public class Sport{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

}
