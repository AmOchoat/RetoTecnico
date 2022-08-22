package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.CreateMeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.retotecnico.userinterface.TestHomePage.LABEL_MEETING;
import static co.com.choucair.certification.retotecnico.userinterface.TestHomePage.LABEL_MEETINGS_ITEM;
import static co.com.choucair.certification.retotecnico.userinterface.TestMeetingPage.*;

public class BadMeeting implements Task {


   private CreateMeetingData createMeetingData;

    public BadMeeting(CreateMeetingData createMeetingData) {
        this.createMeetingData = createMeetingData;
    }

    public static BadMeeting schedule(CreateMeetingData createMeetingData) {
        return Tasks.instrumented(BadMeeting.class, createMeetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_MEETING),
                Click.on(LABEL_MEETINGS_ITEM),
                Click.on(BUTTON_NEW_MEETING),
                Enter.theValue(createMeetingData.getStrMeetingName()).into(INPUT_MEETING_NAME),
                Click.on(CONTAINER_MEETING_TYPE),
                Enter.theValue(createMeetingData.getStrMeetingType()).into(INPUT_MEETING_TYPE).thenHit( Keys.ENTER),
                Enter.theValue(createMeetingData.getStrMeetingNumber()).into(INPUT_MEETING_NUMBER),
                Enter.theValue(createMeetingData.getStrStartDate()).into(INPUT_MEETING_START_DATE),
                Enter.theValue(createMeetingData.getStrEndDate()).into(INPUT_MEETING_END_DATE),
                Click.on(CONTAINER_MEETING_UNIT),
                Enter.theValue(createMeetingData.getStrBusinessUnit()).into(INPUT_MEETING_UNIT).thenHit(Keys.ENTER),
                Click.on(BUTTON_CREATE_MEETING)
        );
    }
}
