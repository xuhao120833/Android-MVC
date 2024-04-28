package com.example.mvc;

public class MVC_Model {

    public void login(String account, String pwd, MVC_Activity loginActivity){

        if (account == null || account.length()==0) {
            loginActivity.loginFail();
        }

        if (pwd == null || pwd.length()==0) {
            loginActivity.loginFail();
        }

        if ("user123".equals(account) && "pwd123".equals(pwd)){
            loginActivity.loginSuccess();
        }

    }

}
