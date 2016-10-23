package app.coolweather.com.coolweather.util;

/**
 * Created by hui on 2016/10/23.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
