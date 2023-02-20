import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {

    @Test
    void test_localization_service_impl() {
        String expected = "Добро пожаловать";

        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        String preferences = localizationService.locale(Country.RUSSIA);

        Assertions.assertEquals(expected, preferences);
    }
}
