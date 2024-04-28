package com.example.mvc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MVC_Activity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mvc);
        tvResult = findViewById(R.id.tv_result);
        TextView tvAccount = findViewById(R.id.tv_account);
        TextView tvPwd = findViewById(R.id.tv_pwd);
        Button btnLogin = findViewById(R.id.btn_login);

        MVC_Controller mvcController = new MVC_Controller();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvcController.login(tvAccount.getText().toString(),tvPwd.getText().toString(), MVC_Activity.this);
            }
        });
    }

    public void loginSuccess(){
        tvResult.setText("登录结果：登录成功");
    }

    public void loginFail(){
        tvResult.setText("登录结果：登录失败");
    }

}

