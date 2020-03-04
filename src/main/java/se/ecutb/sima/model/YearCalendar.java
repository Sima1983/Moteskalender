package se.ecutb.sima.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class YearCalendar implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID yearcalenderId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String year;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private a calender;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private CalendarDay calenderday;

    public YearCalendar(UUID yearcalenderId, String year, String calenders, CalendarDay calenderday) {
        this.yearcalenderId = yearcalenderId;
        this.year = year;
        this.calender = calender;
        this.calenderday = calenderday;
    }

    public UUID getYearcalenderId() {
        return yearcalenderId;
    }

    public void setYearcalenderId(UUID yearcalenderId) {
        this.yearcalenderId = yearcalenderId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public a getCalenders() {
        return calender;
    }

    public void setCalenders(String calenders) {
        calender = calender;
    }

    public CalendarDay getCalenderday() {
        return calenderday;
    }

    public void setCalenderday(CalendarDay calenderday) {
        this.calenderday = calenderday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YearCalendar)) return false;
        YearCalendar that = (YearCalendar) o;
        return getYearcalenderId().equals(that.getYearcalenderId()) &&
                getYear().equals(that.getYear()) &&
                getCalenders().equals(that.getCalenders()) &&
                getCalenderday().equals(that.getCalenderday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYearcalenderId(), getYear(), getCalenders(), getCalenderday());
    }
    YearCalendar(){}

    @Override
    public String toString() {
        return "YearCalendar{" +
                "yearcalenderId=" + yearcalenderId +
                ", year='" + year + '\'' +
                ", Calenders='" + calender + '\'' +
                ", calenderday=" + calenderday +
                '}';
    }
}
