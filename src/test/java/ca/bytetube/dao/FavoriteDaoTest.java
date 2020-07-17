package ca.bytetube.dao;

import ca.bytetube.dao.impl.FavoriteDaoImpl;
import ca.bytetube.domain.Route;
import ca.bytetube.service.RouteService;
import ca.bytetube.service.impl.RouteServiceImpl;
import org.junit.Test;

public class FavoriteDaoTest {
    FavoriteDao dao = new FavoriteDaoImpl();
    @Test
    public void testAdd(){

        RouteService service = new RouteServiceImpl();
        Route route = service.findOne("1");
        System.out.println(route);

    }


}
