package se.ecutb.sima.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class CalendarDay implements Serializable {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UserCalender specCalender;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Meeting meeting;

    public CalendarDay(UserCalender specCalender, Meeting meeting) {
        this.specCalender = specCalender;
        this.meeting = meeting;
    }

    public UserCalender getSpecCalender() {
        return specCalender;
    }

    public void setSpecCalender(UserCalender specCalender) {
        this.specCalender = specCalender;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalendarDay)) return false;
        CalendarDay that = (CalendarDay) o;
        return getSpecCalender().equals(that.getSpecCalender()) &&
                getMeeting().equals(that.getMeeting());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpecCalender(), getMeeting());
    }
    CalendarDay(){}

    @Override
    public String toString() {
        return "CalendarDay{" +
                "specCalender=" + specCalender +
                ", meeting=" + meeting +
                '}';
    }
}