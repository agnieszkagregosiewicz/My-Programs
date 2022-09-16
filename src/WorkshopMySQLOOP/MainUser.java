package WorkshopMySQLOOP;

import org.w3c.dom.UserDataHandler;

import java.sql.SQLException;
import java.util.Arrays;

public class MainUser {
    public static void main(String[] args) throws SQLException {
        MainUser mainUser = new MainUser();
        User user = new User();
//        try {
//            UserDAO.delete(8);
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println(e.getMessage());
//        }
        user.setName("Jaś");
        user.setPassword(UserDAO.hashPassword("haslo"));
        user.setEmail("jas2@gmail.com");
        UserDAO.create(user);
        //user.setId(9);
//        try {
//            UserDAO.update(user);
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println(e.getMessage());
//        }

//        System.out.println(user.getId());
//        User user2 = UserDAO.read(4);
//       System.out.println(user2.toString());
//        UserDAO.delete(4);
//        User[] users = UserDAO.findAll();
//        for (User u : users) {
//            System.out.println(u);
//        }

    }
}
