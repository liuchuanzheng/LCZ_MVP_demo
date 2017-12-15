package com.liuchuanzheng.lcz_mvp_demo.presenter;

import com.liuchuanzheng.lcz_mvp_demo.contract.ILoginContract;
import com.liuchuanzheng.lcz_mvp_demo.model.LoginIModel;
import com.liuchuanzheng.lcz_mvp_demo.model.listener.LoginListener;

/**
 * Created by 刘传政 on 2017/12/15 0015.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */

public class LoginPresenter implements ILoginContract.IPresenter {
    private ILoginContract.IView view;

    public LoginPresenter(ILoginContract.IView view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void login(String username) {
        LoginIModel model = new LoginIModel();
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
