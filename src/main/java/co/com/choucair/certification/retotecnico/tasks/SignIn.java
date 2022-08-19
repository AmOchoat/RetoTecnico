package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.CreateMeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.retotecnico.userinterface.TestLoginPage.*;

public class SignIn implements Task {

    private CreateMeetingData createMeetingData;

    public SignIn(CreateMeetingData createMeetingData) {
        this.createMeetingData = createMeetingData;
    }

    public static SignIn theAccount(CreateMeetingData createMeetingData) {
        return Tasks.instrumented(SignIn.class, createMeetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(createMeetingData.getStrUserAccount()).into(INPUT_USER),
                Enter.theValue(createMeetingData.getStrUserPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_SIGN_IN)
        );
    }
}
