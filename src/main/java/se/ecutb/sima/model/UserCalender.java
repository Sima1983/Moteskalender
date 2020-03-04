package se.ecutb.sima.model;



import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class UserCalender implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID calenderuserId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String yearCalender;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private YearCalendar yearcalender;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate specCalender;

    public UserCalender(UUID calenderuserId, String email, String name, String yearCalender, YearCalendar yearcalender, LocalDate specCalender) {
        this.calenderuserId = calenderuserId;
        this.email = email;
        this.name = name;
        this.yearCalender = yearCalender;
        this.yearcalender = yearcalender;
        this.specCalender = specCalender;
    }

    public UUID getCalenderuserId() {
        return calenderuserId;
    }

    public void setCalenderuserId(UUID calenderuserId) {
        this.calenderuserId = calenderuserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearCalender() {
        return yearCalender;
    }

    public void setYearCalender(String yearCalender) {
        this.yearCalender = yearCalender;
    }

    public YearCalendar getYearcalender() {
        return yearcalender;
    }

    public void setYearcalender(YearCalendar yearcalender) {
        this.yearcalender = yearcalender;
    }

    public LocalDate getSpecCalender() {
        return specCalender;
    }

    public void setSpecCalender(LocalDate specCalender) {
        this.specCalender = specCalender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserCalender)) return false;
        UserCalender that = (UserCalender) o;
        return getCalenderuserId().equals(that.getCalenderuserId()) &&
                getEmail().equals(that.getEmail()) &&
                getName().equals(that.getName()) &&
                getYearCalender().equals(that.getYearCalender()) &&
                getYearcalender().equals(that.getYearcalender()) &&
                getSpecCalender().equals(that.getSpecCalender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCalenderuserId(), getEmail(), getName(), getYearCalender(), getYearcalender(), getSpecCalender());
    }
    UserCalender(){}

    @Override
    public String toString() {
        return "UserCalender{" +
                "calenderuserId=" + calenderuserId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", yearCalender='" + yearCalender + '\'' +
                ", yearcalender=" + yearcalender +
                ", specCalender=" + specCalender +
                '}';
    }
}
