package controlador;

public class Login{
     private String UserID, Password;
    
    public Login(){}

    public String getUserID() {
        return UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
