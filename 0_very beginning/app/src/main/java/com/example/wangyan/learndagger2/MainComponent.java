package com.example.wangyan.learndagger2;

import dagger.Component;

@Component
public interface MainComponent {
    void inject(MainActivity activity);
}
