package com.example.wangyan.learndagger2.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.wangyan.learndagger2.Constants.Constant;
import com.example.wangyan.learndagger2.DI.DaggerMainComponent;
import com.example.wangyan.learndagger2.DI.MainModule;
import Present.MainPresenter;
import com.example.wangyan.learndagger2.R;
import Present.SplashPresent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView {

    /*
    目的:
    1:可以随时更换Presenter
    2:也可以同时绑定两个Present
     */


    @Inject
    SplashPresent splashPresenter;

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        1:  DaggerMainComponent是自动生成的，在MainComponent前面加了前缀Dagger

        2： mainModule是自动的, 是把类MainModule的首字母小写了

        3： 第一个builder()函数是为创建一个容器,可以方便注入module

        4： 第二个builder()函数是为了生成component（通过第一个builder()创建的容器生成component）

        5:  得到component后，就可以调用自定义的component中的函数了。
         */

        //DaggerMainComponent.builder().mainModule(new MainModule(this)).build().inject(this);
        DaggerMainComponent.builder().mainModule(new MainModule(this)).build().inject(this);

    }

    @Override
    protected void onStart() {
        super.onStart();

        mainPresenter.loadData();

        splashPresenter.loadData();
    }

    @Override
    public void updateUI() {

        Log.d(Constant.AppDebugFilter,"MainActivity, updateUI");
    }
}
