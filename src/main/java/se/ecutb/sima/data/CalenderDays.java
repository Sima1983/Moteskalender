package se.ecutb.sima.data;

import se.ecutb.sima.model.Meeting;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class CalenderDays {
    static Meeting metting = new Meeting();

    public static Meeting getCalenderDays() {
        return calenderDays;
    }

    public static Meeting calenderDays = metting ;

    Arrays CalenderDays = (Arrays) Arrays.asList(metting,LocalDate.of(2020,01,01));
    Arrays CalenderDayss = (Arrays) Arrays.asList(metting,LocalDate.of(2019,01,01));

}
