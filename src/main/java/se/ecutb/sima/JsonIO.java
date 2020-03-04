package se.ecutb.sima;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import se.ecutb.sima.data.CalenderDays;
import se.ecutb.sima.data.Meetings;
import se.ecutb.sima.data.UserCalenders;
import se.ecutb.sima.data.YearCalenders;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonIO {
    private ObjectMapper objectMapper;
    public JsonIO(){
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        objectMapper.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS,false);
        objectMapper.configure(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS,false);
        objectMapper.configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,false);
        objectMapper.registerModule(new JavaTimeModule());

    }
    public void serilaizeDayToJson(List<CalenderDays> source, File file){
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            objectMapper.writeValue(file, source);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void serilaizeMeetToJson(List<Meetings> source, File file){
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            objectMapper.writeValue(file, source);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void serilaizeUserCalenderToJson(List<UserCalenders>source, File file){
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            objectMapper.writeValue(file, source);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void serilaizeYearCalenderToJson(List<YearCalenders> source, File file){
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            objectMapper.writeValue(file, source);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public List<CalenderDays> deserializeCalDay(File file){
        List<CalenderDays> calenderDays = new ArrayList<>();
        try{
            calenderDays = objectMapper.readValue(file, new TypeReference<List<CalenderDays>>() {});
        } catch (IOException e){
            e.printStackTrace();
        }
        return calenderDays;
    }
    public List<Meetings> deserializeMeeting(File file){
        List<Meetings> meetings = new ArrayList<>();
        try{
            meetings = objectMapper.readValue(file, new TypeReference<List<Meetings>>() {});
        } catch (IOException e){
            e.printStackTrace();
        }
        return meetings;
    }
    public List<YearCalenders> deserializeYearCal(File file){
        List<YearCalenders> yearcalender = new ArrayList<>();
        try{
            yearcalender = objectMapper.readValue(file, new TypeReference<List<YearCalenders>>() {});
        } catch (IOException e){
            e.printStackTrace();
        }
        return yearcalender;
    }
    public List<CalenderDays> deserialize(File file){
        List<UserCalenders> usercalender = new ArrayList<>();
        try{
            usercalender = objectMapper.readValue(file, new TypeReference<List<UserCalenders>>() {});
        } catch (IOException e){
            e.printStackTrace();
        }
        return usercalender;
    }
}
