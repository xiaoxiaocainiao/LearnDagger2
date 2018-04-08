package Present;

import android.util.Log;

import com.example.wangyan.learndagger2.Constants.Constant;
import com.example.wangyan.learndagger2.UI.MainView;

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
