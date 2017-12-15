package com.liuchuanzheng.lcz_mvp_demo.presenter;

/**
 * Created by 刘传政 on 2017/12/15 0015.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:presenter的基本接口
 * 注意事项:
 */

public interface BasePresenter {
    /**
     * 每个控制器都会控制去干活,比如加载数据之类的,这里统一叫doWork
     */
    void doWork();
}
