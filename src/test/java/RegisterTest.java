import entities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageRegister;
import java.util.ArrayList;

public class RegisterTest extends BaseTest {
    @Test
    public void shouldRegisterPerson() {
        PageRegister page = new PageRegister(getDriver());

        ArrayList<String> sports = new ArrayList<>();
        sports.add("Karate");
        sports.add("Natacao");

        String result = page.fillFirstName("Monica")
                .fillLastName("Marques")
                .selectGender("F")
                .selectFood("vegetarian")
                .selectGrade("Superior")
                .fillSuggestion("Just a test")
                .selectSports(sports)
                .register()
                .getResultText();

        Assert.assertTrue(result.contains("Cadastrado!"));
        Assert.assertTrue(result.contains("Nome: Monica"));
        Assert.assertTrue(result.contains("Sobrenome: Marques"));
        Assert.assertTrue(result.contains("Sexo: Feminino"));
        Assert.assertTrue(result.contains("Comida: Vegetariano"));
        Assert.assertTrue(result.contains("Escolaridade: superior"));
        Assert.assertTrue(result.contains("Esportes: Natacao Karate"));
        Assert.assertTrue(result.contains("Sugestoes: Just a test"));
    }

    @Test
    public void shouldValidateLinks() {
        PageRegister page = new PageRegister(getDriver());

        Assert.assertEquals(page.clickGoogleLink(), "https://www.google.com/");

        Assert.assertEquals(page.clickGloboLink(), "G1 - O portal de notícias da Globo");
    }
}
