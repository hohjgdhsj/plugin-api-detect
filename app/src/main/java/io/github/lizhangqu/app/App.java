package io.github.lizhangqu.app;

import android.app.Application;

import io.github.sample.detect.Sample;

/**
 * @author lizhangqu
 * @version V1.0
 * @since 2018-11-08 17:08
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Sample();
    }
}
