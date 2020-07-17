package ca.bytetube.dao;


import ca.bytetube.dao.impl.UserDaoImpl;
import ca.bytetube.domain.User;
import org.junit.Test;


public class UserDaoTest {
    UserDao dao = new UserDaoImpl();

    @Test
    public void testFindAll(){
         dao = new UserDaoImpl();
        User username = dao.findByUsername("dalluo06");
        System.out.println(username);
    }


}
