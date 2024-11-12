package User;

public interface UserServices {
    void add(User user);
    void delete(int id);
    void update(int id,User user);
    void get(int id);
    User[] getAll();

}