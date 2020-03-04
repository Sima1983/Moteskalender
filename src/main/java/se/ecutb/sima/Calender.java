package se.ecutb.sima;

import se.ecutb.sima.data.CalenderDays;

import java.io.File;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Calender
{
    public static void main( String[] args )

    {
        JsonIO jsonIO = new JsonIO();
        List<CalenderDays> deserializedDays = jsonIO.deserialize(new File("calender.json"));
        deserializedDays.forEach(System.out::println);
        List<CalenderDays> deserializedUser = jsonIO.deserialize(new File("calender.json"));
        deserializedUser.forEach(System.out::println);
        List<CalenderDays> deserializedMeet = jsonIO.deserialize(new File("calender.json"));
        deserializedUser.forEach(System.out::println);
        List<CalenderDays> deserializedYear= jsonIO.deserialize(new File("calender.json"));
        deserializedUser.forEach(System.out::println);
    }
}
