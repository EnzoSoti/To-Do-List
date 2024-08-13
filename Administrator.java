public class Administrator extends User {

    private String admin_name;

    Administrator(String name, String id, String pass){
        super(id, pass);
        admin_name = name;
    }

    public void updatedatePassword(String newPassword){
        User_password = newPassword;
    }

    public void updateAdminName(String name){
        admin_name = name;
    }


}
