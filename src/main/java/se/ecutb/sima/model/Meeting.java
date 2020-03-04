package se.ecutb.sima.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Meeting implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String title;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate finishTime;

    public Meeting(String title, String description, LocalDate startTime, LocalDate finishTime) {
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDate finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meeting)) return false;
        Meeting meeting = (Meeting) o;
        return getTitle().equals(meeting.getTitle()) &&
                getDescription().equals(meeting.getDescription()) &&
                getStartTime().equals(meeting.getStartTime()) &&
                getFinishTime().equals(meeting.getFinishTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getStartTime(), getFinishTime());
    }

    public Meeting(){}

    @Override
    public String toString() {
        return "Meeting{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startTime=" + startTime +
                ", finishTime=" + finishTime +
                '}';
    }
}
