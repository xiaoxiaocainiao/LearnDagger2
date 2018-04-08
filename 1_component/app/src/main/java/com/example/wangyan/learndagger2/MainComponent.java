package com.example.wangyan.learndagger2;

import dagger.Component;

/*
@Component(modules = MainModule.class)
关联component 和 module
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}