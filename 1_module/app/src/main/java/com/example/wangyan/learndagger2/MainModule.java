package com.example.wangyan.learndagger2;

import dagger.Module;
import dagger.Provides;

//module必须添加@Module注解

@Module
public class MainModule {
    private final MainView mView;

    public MainModule(MainView view) {
        mView = view;
    }

    //module必须添加相应的providier，这个providier的函数名字无所谓，返回值必须和@Inject相对应

    @Provides
    MainView provideMainView() {
        return mView;
    }
}