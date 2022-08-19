package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.CreateMeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.retotecnico.userinterface.TestBusinessUnits.*;

public class BusinessUnits implements Task {

    private CreateMeetingData createMeetingData;

    public BusinessUnits(CreateMeetingData createMeetingData) {
        this.createMeetingData = createMeetingData;
    }

    public static BusinessUnits create(CreateMeetingData createMeetingData) {
        return Tasks.instrumented(BusinessUnits.class, createMeetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_NEW_BUSINESS_UNIT),
                Enter.theValue(createMeetingData.getStrBusinessUnit()).into(INPUT_BUSINESS_UNIT_NAME),
                Click.on(BUTTON_SAVE_BUSINESS_UNIT)
        );
    }
}
