package com.liuchuanzheng.lcz_mvp_demo.contract;

import com.liuchuanzheng.lcz_mvp_demo.model.BaseModel;
import com.liuchuanzheng.lcz_mvp_demo.presenter.BasePresenter;
import com.liuchuanzheng.lcz_mvp_demo.view.BaseView;

/**
 * Created by 刘传政 on 2017/12/15 0015.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:登录的契约类.一目了然的知道登录相关的mvp方法
 * 注意事项:
 */

public interface LoginContract {
    interface Medel extends BaseModel{}
    interface View extends BaseView<Presenter>{
        void showLoading();
        void dismissLoading();
        void showResult(String result);
    }
    interface Presenter extends BasePresenter{
        void login(String username);
    }
}
