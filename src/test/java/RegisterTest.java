import entities.BaseTest;
import org.testng.annotations.Test;
import pages.PageRegister;

import java.util.ArrayList;
import java.util.Arrays;

public class RegisterTest extends BaseTest {
    @Test
    public void shouldRegisterPerson() {
        PageRegister page = new PageRegister(getDriver());

        page.fillFirstName("Monica")
                .fillLastName("Marques")
                .selectGender(1)
                .selectGrade("Superior")
                .selectSports(Arrays.asList("Natacao", "Corrida", "Karate"));
    }
}
