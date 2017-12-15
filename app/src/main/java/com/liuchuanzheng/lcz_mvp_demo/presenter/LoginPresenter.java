package com.liuchuanzheng.lcz_mvp_demo.presenter;

import com.liuchuanzheng.lcz_mvp_demo.contract.LoginContract;
import com.liuchuanzheng.lcz_mvp_demo.model.LoginModel;
import com.liuchuanzheng.lcz_mvp_demo.model.listener.LoginListener;

/**
 * Created by 刘传政 on 2017/12/15 0015.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View view;
    @Override
    public void doWork() {

    }

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void login(String username) {
        LoginModel model = new LoginModel();
        view.showLoading();
        model.login(username, new LoginListener() {
            @Override
            public void onSuccess(String result) {
                view.dismissLoading();
                view.showResult(result);
            }

            @Override
            public void onFail(String result) {
                view.dismissLoading();
                view.showResult(result);
            }
        });
    }
}
