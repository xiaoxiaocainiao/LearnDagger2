package Present;

import android.util.Log;

import com.example.wangyan.learndagger2.Constants.Constant;
import com.example.wangyan.learndagger2.UI.MainView;

import javax.inject.Inject;


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