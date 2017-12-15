package com.liuchuanzheng.lcz_mvp_demo.view;

/**
 * Created by 刘传政 on 2017/12/15 0015.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */

public interface IBaseView<T> {
    /**
     * @param presenter
     * 给view设置presenter,便于调用
     */
    void setPresenter(T presenter);
}
