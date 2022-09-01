package pages;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter @Builder
public class PageRegister extends BasePage {
    @FindBy(id="elementosForm:nome")
    private WebElement textFirstName;

    @FindBy(id="elementosForm:sobrenome")
    private WebElement textLastName;

    @FindBy(id="elementosForm:sexo:0")
    private WebElement radioGenderMale;

    @FindBy(id="elementosForm:sexo:1")
    private WebElement radioGenderFemale;

    @FindBy(id="elementosForm:comidaFavorita:0")
    private WebElement checkboxFoodMeat;

    @FindBy(id="elementosForm:comidaFavorita:1")
    private WebElement checkboxFoodChicken;

    @FindBy(id="elementosForm:comidaFavorita:2")
    private WebElement checkboxFoodPizza;

    @FindBy(id="elementosForm:comidaFavorita:3")
    private WebElement checkboxFoodVegetarian;

    @FindBy(id="elementosForm:escolaridade")
    private WebElement selectSchoolGrade;

    @FindBy(id="elementosForm:esportes")
    private WebElement selectSports;

    @FindBy(id="elementosForm:sugestoes")
    private WebElement textAreaSuggestion;

    @FindBy(id="elementosForm:cadastrar")
    private WebElement buttonRegister;




    public PageRegister(WebDriver driver) {
        super(driver);
    }
}
