package com.liuchuanzheng.lcz_mvp_demo.model;

import android.os.Handler;

import com.liuchuanzheng.lcz_mvp_demo.contract.LoginContract;
import com.liuchuanzheng.lcz_mvp_demo.model.listener.LoginListener;

/**
 * Created by 刘传政 on 2017/12/15 0015.
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */

public class LoginModel implements LoginContract.Medel {
    @Override
    public void doWork() {

    }
    public void login(final String username, final LoginListener listener){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if ("123".equals(username)){
                    //正确
                    listener.onSuccess(username +"登录成功");
                }else {
                    //错误
                    listener.onFail(username +"登录失败");
                }

            }
        }, 3000);

    };
}
