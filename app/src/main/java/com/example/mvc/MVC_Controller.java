package com.example.mvc;

public class MVC_Controller {

    MVC_Model mvcModel;

    public MVC_Controller() {
        mvcModel = new MVC_Model();
    }

    public void login(String account, String pwd, MVC_Activity loginActivity) {
        mvcModel.login(account, pwd, loginActivity);
    }
}

