package dip;

public class UserManager {

    public void showUser(){
        UserRespository userRespository = new UserRespository();
        User user = userRespository.getUser(1);

        System.out.println(user.getEmail() + " : " + user.getName());
    }
}
