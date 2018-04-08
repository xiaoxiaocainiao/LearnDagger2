package com.example.wangyan.learndagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /*
    目的:
    1:可以随时更换Presenter
    2:也可以同时绑定两个Present
     */

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DaggerMainComponent.create().inject(this);

        /*
        如果不调用inject方法,
        直接调用DaggerMainComponent.create().
        mainPresenter == null
         */
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(mainPresenter == null) {

            Log.d(Constant.AppDebugFilter, "mainPresenter等于null!");
        } else {

            mainPresenter.loadData();
        }

    }

}
