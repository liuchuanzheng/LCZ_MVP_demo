package com.liuchuanzheng.lcz_mvp_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.liuchuanzheng.lcz_mvp_demo.contract.LoginContract;
import com.liuchuanzheng.lcz_mvp_demo.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements LoginContract.View {
    private Button btn_login;
    private EditText et_username;
    private TextView tv_loginstatus;
    private LoginContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
    }

    private void init() {
        new LoginPresenter(this);
    }

    private void initView() {
       btn_login = findViewById(R.id.btn_login);
       et_username = findViewById(R.id.et_username);
       tv_loginstatus = findViewById(R.id.tv_loginstatus);
       btn_login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                    String username = et_username.getText().toString();
                    presenter.login(username);
           }
       });
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"加载中",Toast.LENGTH_LONG).show();
    }

    @Override
    public void dismissLoading() {
        Toast.makeText(this,"加载完成",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showResult(String result) {
        tv_loginstatus.setText(result);
    }
}
