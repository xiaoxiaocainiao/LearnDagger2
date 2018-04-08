package com.example.wangyan.learndagger2;

import android.util.Log;

import javax.inject.Inject;

public class SplashPresent {

    private MainView mView;

    @Inject
    SplashPresent (MainView view) {
        mView = view;
    }

    public void loadData() {
        //调用model层方法，加载数据

        Log.d(Constant.AppDebugFilter,"SplashPresent, loadData");
        //回调方法成功时
        mView.updateUI();
    }
}
