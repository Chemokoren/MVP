package example.kibsoft.com.mvpexample.root;

import javax.inject.Singleton;

import dagger.Component;
import example.kibsoft.com.mvpexample.login.LoginActivity;
import example.kibsoft.com.mvpexample.login.LoginModule;

@Singleton
@Component(modules ={ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent{
    void inject(LoginActivity target);
}
