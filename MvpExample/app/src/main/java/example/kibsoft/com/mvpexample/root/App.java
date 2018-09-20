package example.kibsoft.com.mvpexample.root;

import android.app.Application;

import example.kibsoft.com.mvpexample.login.LoginModule;

public class App extends Application
{
    private ApplicationComponent component;

    @Override
    public void onCreate(){
        super.onCreate();

        component =DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}