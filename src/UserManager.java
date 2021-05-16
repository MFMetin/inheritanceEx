public class UserManager {

    public void add(User user){
        System.out.println(user.getName() + " added.");
    }
    public void delete(User user){
        System.out.println(user.getName() + " removed.");
    }
    public void update(User user){
        System.out.println(user.getName() + " updated.");
    }
}
