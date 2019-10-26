package dip;

public class LocalUserRespository implements UserRepository {

    public User getUser(int id){
        //Logica para traer usuario de la base datos
        User user = new User(1, "Alberto", "a@a.com");
        return user;
    }
}
