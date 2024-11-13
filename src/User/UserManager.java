package User;

public class UserManager implements UserServices {
    User[] users = new User[100];
    int count = 0;


    @Override
    public void add(User user) {
        if (count < users.length) {
            users[count] = user;
            System.out.println("User joined !!!");
            count++;
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == id) {
                users[count - 1] = null;
                count--;
                System.out.println("User deleted !!!");
                return;
            }
        }
        System.out.println("User not found !!!");
    }

    @Override
    public void update(int id, User user) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                users[i].setId(id);
                users[i].setPassword(user.getPassword());
                users[i].setUsername(user.getUsername());
                System.out.println("Updated successfully !!!");
            }
        }
    }

    @Override
    public void get(int id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                System.out.println("ID: " + users[i].getId() + "," + "Username: " + users[i].getUsername() + "," + "Password: " + users[i].getPassword());
                return;
            }

        }

    }

    @Override
    public User[] getAll() {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }
        User[] users1 = new User[count];
        int index = 0;
        for (int i = 0; i < users1.length; i++) {
            if (users[i] != null) {
                users1[index++] = users[i];
            }
        }
        return users1;
    }

}
