package dip;

public class UserManager {

    public void showUser(){
        UserRepository userRepository = UserFactory.create();
        User user = userRepository.getUser(1);

        System.out.println(user.getEmail() + " : " + user.getName());
    }
}
