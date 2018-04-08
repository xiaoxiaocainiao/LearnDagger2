package com.example.wangyan.learndagger2;

import android.util.Log;

import javax.inject.Inject;

import dagger.Component;
import dagger.Module;
import dagger.Provides;


public class MainPresenter {

    @Inject
    MainPresenter() {

    }

    public void loadData() {
        //调用model层方法，加载数据

        Log.d(Constant.AppDebugFilter,"MainPresenter, loadData");

    }

}