package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PageRegister extends BasePage {
    @FindBy(id="elementosForm:nome")
    private WebElement textFirstName;

    @FindBy(id="elementosForm:sobrenome")
    private WebElement textLastName;

    @FindBy(id="elementosForm:sexo:0")
    private WebElement radioGenderMale;

    @FindBy(id="elementosForm:sexo:1")
    private WebElement radioGenderFemale;

//    @FindAll(name="elementosForm:comidaFavorita")
//    private ArrayList<WebElement> foods;

    @FindBy(id="elementosForm:comidaFavorita:0")
    private WebElement checkboxFoodMeat;

    @FindBy(id="elementosForm:comidaFavorita:1")
    private WebElement checkboxFoodChicken;

    @FindBy(id="elementosForm:comidaFavorita:2")
    private WebElement checkboxFoodPizza;

    @FindBy(id="elementosForm:comidaFavorita:3")
    private WebElement checkboxFoodVegetarian;

    @FindBy(id="elementosForm:escolaridade")
    private Select selectSchoolGrade;

    @FindBy(id="elementosForm:esportes")
    private Select selectSportsElement;

    @FindBy(id="elementosForm:sugestoes")
    private WebElement textAreaSuggestion;

    @FindBy(id="elementosForm:cadastrar")
    private WebElement buttonRegister;

    public PageRegister(WebDriver driver) {
        super(driver);
    }

    public PageRegister fillFirstName(String firstName) {
        textFirstName.sendKeys(firstName);

        return this;
    }

    public PageRegister fillLastName(String lastName) {
        textLastName.sendKeys(lastName);

        return this;
    }

    public PageRegister selectGender(int gender)
    {
        switch (gender){
            case 0:
                radioGenderMale.click();
                break;
            case 1:
                radioGenderFemale.click();
        }

        return this;
    }

    public PageRegister selectGrade(String schoolGrade){
        selectSchoolGrade.selectByVisibleText(schoolGrade);

        return this;
    }

    public PageRegister selectSports(List<String> sports){
        for ( String sport : sports) {
            selectSportsElement.selectByVisibleText(sport);
        }

        return  this;
    }
}
