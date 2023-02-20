import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {

    @Test
    void test_geo_service() {

        Location expect = new Location("Moscow", Country.RUSSIA, null, 0);
        GeoServiceImpl geoService = new GeoServiceImpl();

        Location preference = geoService.byIp("172.");

        Assertions.assertEquals(expect, preference);
    }
}
