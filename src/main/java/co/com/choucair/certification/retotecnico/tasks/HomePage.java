package co.com.choucair.certification.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.retotecnico.userinterface.TestHomePage.*;

public class HomePage implements Task {
    public static HomePage selectOrganization() {
        return Tasks.instrumented(HomePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_ORGANIZATION),
                Click.on(LABEL_BUSINESS_UNITS)
        );
    }
}
