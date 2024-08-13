public class User {

    private String User_id;
    protected String User_password;

    User(String id, String pass){
        User_id = id;
        User_password = pass;
    }

    public boolean verifyLogin(String id, String pass){
        return User_id.equals(id) && User_password.equals(pass);
    }

    public void updatePassword(String newPassword){
        User_password = newPassword;
    }
}

