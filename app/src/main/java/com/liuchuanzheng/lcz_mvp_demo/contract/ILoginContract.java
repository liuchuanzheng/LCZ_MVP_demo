package com.liuchuanzheng.lcz_mvp_demo.contract;

import com.liuchuanzheng.lcz_mvp_demo.model.IBaseModel;
import com.liuchuanzheng.lcz_mvp_demo.model.listener.LoginListener;
import com.liuchuanzheng.lcz_mvp_demo.presenter.IBasePresenter;
import com.liuchuanzheng.lcz_mvp_demo.view.IBaseView;

/**
 * Created by 刘传政 on 2017/12/15 0015.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:登录的契约类.一目了然的知道登录相关的mvp方法
 * 注意事项:
 */

public interface ILoginContract {
    interface IModel extends IBaseModel {
        void login(String username,LoginListener listener);
    }
    interface IView extends IBaseView<IPresenter> {
        void showLoading();
        void dismissLoading();
        void showResult(String result);
    }
    interface IPresenter extends IBasePresenter {
        void login(String username);
    }
}
