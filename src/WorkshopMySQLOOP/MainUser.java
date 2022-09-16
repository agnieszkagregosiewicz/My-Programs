package WorkshopMySQLOOP;
import org.w3c.dom.UserDataHandler;
import java.sql.SQLException;
import java.util.Arrays;

public class MainUser {
    public static void main(String[] args) throws SQLException {
        MainUser mainUser = new MainUser();
        User user = new User();
        /*
        // Sprawdzanie działania metody create
        user.setName("Jasio");
        user.setPassword(UserDAO.hashPassword("haslotrzaslo"));
        user.setEmail("agagag@gmail.com");
        UserDAO.create(user);
        */

        /*
        // Sprawdzanie działania metody update
        user.setName("Jasio");
        user.setPassword(UserDAO.hashPassword("haslotrzaslo"));
        user.setEmail("agagag@gmail.com");
        user.setId(9);
        try {
            UserDAO.update(user);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        */

        /*
        //Sprawdzanie działania metody read
        User user2 = UserDAO.read(4);
       System.out.println(user2.toString());
         */

        /*
        //Sprawdzanie działania metody findAll

        User[] users = UserDAO.findAll();
        for (User u : users) {
            System.out.println(u);
        */

         /*
        // Sprawdzanie działania metody delete

        try {
           UserDAO.delete(8);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
       }
         */


    }
}
