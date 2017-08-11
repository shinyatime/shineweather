package cn.intan.android.gson;

/**
 * Created by shinya on 2017/8/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
