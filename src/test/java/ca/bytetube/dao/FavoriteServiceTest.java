package ca.bytetube.dao;

import ca.bytetube.domain.User;
import ca.bytetube.service.FavoriteService;
import ca.bytetube.service.impl.FavoriteServiceImpl;
import org.junit.Test;

public class FavoriteServiceTest {

    @Test
    public void testAdd(){
        User user = new User();
        user.setUsername("dalluo06");
        user.setPassword("bytetube");
        user.setStatus("Y");
        user.setUid(6);
        FavoriteService service = new FavoriteServiceImpl();
        service.add("7",user.getUid());

    }

    @Test
    public void testIsF(){
        FavoriteService service = new FavoriteServiceImpl();
        boolean flag = service.isFavorite("7", 6);
        System.out.println(flag);
    }
}
