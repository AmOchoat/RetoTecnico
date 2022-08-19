package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.model.CreateMeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.retotecnico.userinterface.TestScheduleMeeting.*;

public class Meetings implements Question<Boolean> {

    private CreateMeetingData createMeetingData;

    public Meetings(CreateMeetingData createMeetingData) {
        this.createMeetingData = createMeetingData;
    }

    public static Meetings wasScheduled(CreateMeetingData createMeetingData) {
        return new Meetings(createMeetingData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String name = Text.of(LABEL_MEETING_NAME).viewedBy(actor).asString();
        String number = Text.of(LABEL_MEETING_NUMER).viewedBy(actor).asString();
        String type = Text.of(LABEL_MEETING_TYPE).viewedBy(actor).asString();
        String businessUnit = Text.of(LABEL_MEETING_BUSINESS_UNIT).viewedBy(actor).asString();
        return name.equals(createMeetingData.getStrMeetingName()) && number.equals(createMeetingData.getStrMeetingNumber())
                && type.equals(createMeetingData.getStrMeetingType()) && businessUnit.equals(createMeetingData.getStrBusinessUnit());
    }
}
