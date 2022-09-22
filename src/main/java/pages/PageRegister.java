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
    private WebElement selectSportsElement;

    @FindBy(id="elementosForm:sugestoes")
    private WebElement textAreaSuggestion;

    @FindBy(partialLinkText="Google")
    private WebElement linkGoogle;

    @FindBy(linkText="Site do G1")
    private WebElement linkGlobo;

    @FindBy(id="elementosForm:cadastrar")
    private WebElement buttonRegister;

    @FindBy(id="resultado")
    private WebElement result;

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

    public PageRegister selectFood(String food) {
        switch (food) {
            case "meat":
                checkboxFoodMeat.click();
                break;
            case "chicken":
                checkboxFoodChicken.click();
                break;
            case "pizza":
                checkboxFoodPizza.click();
                break;
            case "vegetarian":
                checkboxFoodVegetarian.click();
                break;
        }

        return this;
    }

    public PageRegister selectGender(String gender)
    {
        switch (gender){
            case "M":
                radioGenderMale.click();
                break;
            case "F":
                radioGenderFemale.click();
        }

        return this;
    }

    public PageRegister selectGrade(String schoolGrade){
        Select dropdown = new Select(selectSchoolGrade);
        dropdown.selectByVisibleText(schoolGrade);

        return this;
    }

    public PageRegister selectSports(ArrayList<String> sports){
        Select dropdown = new Select(selectSportsElement);

        for ( String sport : sports) {
            dropdown.selectByVisibleText(sport);
        }

        return  this;
    }

    public PageRegister fillSuggestion(String suggestion) {
        textAreaSuggestion.sendKeys(suggestion);

        return this;
    }

    public String clickGoogleLink(){
        linkGoogle.click();

        String url = driver.getCurrentUrl();

        driver.navigate().back();

        return url;
    }

    public String clickGloboLink(){
        linkGlobo.click();

        String title = driver.getTitle();

        driver.navigate().back();

        return title;
    }

    public PageRegister register() {
        buttonRegister.click();

        return this;
    }

    public String getResultText() {
        return result.getText();
    }
}
