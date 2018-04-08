package com.example.wangyan.learndagger2;

import android.util.Log;

import javax.inject.Inject;

import dagger.Component;
import dagger.Module;
import dagger.Provides;


public class MainPresenter {

    private MainView mView;

    @Inject
    MainPresenter(MainView view) {
        mView = view;
    }

    public void loadData() {
        //调用model层方法，加载数据

        Log.d(Constant.AppDebugFilter,"MainPresenter, loadData");
        //回调方法成功时
        mView.updateUI();
    }

}