package login_app.models;

public class User {
 
private String Username ;
private int Password ;

public User(String Username, int Password) {
    this.Username = Username;
    this.Password = Password;
}

public String getUsername() {
    return Username;
}
public void setUsername(String username) {
    Username = username;
}
public int getPassword() {
    return Password;
}
public void setPassword(int password) {
    Password = password;
}

}
