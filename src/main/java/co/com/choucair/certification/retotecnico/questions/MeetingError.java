package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.model.CreateMeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.retotecnico.userinterface.TestScheduleMeeting.TOAST_ERROR_MESSAGE;

public class MeetingError implements Question<Boolean> {

    private CreateMeetingData createMeetingData;

    public MeetingError(CreateMeetingData createMeetingData) {
        this.createMeetingData = createMeetingData;
    }

    public static MeetingError isShow(CreateMeetingData createMeetingData) {
        return new MeetingError(createMeetingData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String name = Text.of(TOAST_ERROR_MESSAGE).viewedBy(actor).asString();
        return Text.of(TOAST_ERROR_MESSAGE).viewedBy(actor).asString().equals(createMeetingData.getStrErrorMessage());
    }
}
