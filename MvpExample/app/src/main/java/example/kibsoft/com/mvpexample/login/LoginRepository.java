package example.kibsoft.com.mvpexample.login;

public interface LoginRepository
{

    User getUser();

    void saveUser(User user);
}