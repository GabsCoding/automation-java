import entities.BaseTest;
import org.testng.annotations.Test;
import steps.StepsRegister;

public class RegisterTest extends BaseTest {
    StepsRegister step = StepsRegister.builder().build();

    @Test
    public void shouldRegisterPerson() {
        step.fillFirstName("Gabriel");
    }
}
