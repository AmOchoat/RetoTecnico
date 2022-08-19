package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.CreateMeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.retotecnico.userinterface.TestHomePage.*;
import static co.com.choucair.certification.retotecnico.userinterface.TestMeetingPage.*;
import static co.com.choucair.certification.retotecnico.userinterface.TestScheduleMeeting.COLUMN_MEETING_ID;

public class Meeting implements Task {

    private CreateMeetingData createMeetingData;

    public Meeting(CreateMeetingData createMeetingData) {
        this.createMeetingData = createMeetingData;
    }

    public static Meeting schedule(CreateMeetingData createMeetingData) {
        return Tasks.instrumented(Meeting.class, createMeetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_MEETING),
                Click.on(LABEL_MEETINGS_ITEM),
                Click.on(BUTTON_NEW_MEETING),
                Enter.theValue(createMeetingData.getStrMeetingName()).into(INPUT_MEETING_NAME),
                Click.on(CONTAINER_MEETIN_TYPE),
                Enter.theValue(createMeetingData.getStrMeetingType()).into(INPUT_MEETING_TYPE).thenHit( Keys.ENTER),
                Enter.theValue(createMeetingData.getStrMeetingNumber()).into(INPUT_MEETING_NUMER),
                Enter.theValue(createMeetingData.getStrStartDate()).into(INPUT_MEETING_START_DATE),
                Enter.theValue(createMeetingData.getStrEndDate()).into(INPUT_MEETING_END_DATE),
                Click.on(CONTAINER_MEETING_UNIT),
                Enter.theValue(createMeetingData.getStrBusinessUnit()).into(INPUT_MEETING_UNIT).thenHit(Keys.ENTER),
                Click.on(BUTTON_CREATE_MEETING),
                Click.on(COLUMN_MEETING_ID),
                Click.on(COLUMN_MEETING_ID)
        );
    }
}
