package steps;

import lombok.Builder;
import pages.PageRegister;

@Builder
public class StepsRegister {
    private PageRegister page = PageRegister.builder().build();

    public StepsRegister fillFirstName(String firstName) {
        this.page.getTextFirstName().sendKeys(firstName);
        return this;
    }

    public StepsRegister fillLastName() {
        return this;
    }

    public StepsRegister selectGender() {
        return this;
    }

    public StepsRegister selectFood() {
        return this;
    }

    public StepsRegister selectSchoolGrade() {
        return this;
    }

    public StepsRegister selectSports() {
        return this;
    }

    public StepsRegister fillSuggestion() {
        return this;
    }

    public StepsRegister submitRegister() {
        return this;
    }
}
