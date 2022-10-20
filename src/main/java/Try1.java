import com.fasterxml.jackson.core.JsonProcessingException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Try1 {
    public static void main(String args[]){
        String date = "9012022";
        boolean b = validDate(date);
        System.out.println("boolean "+ b);


    }




    public static boolean validDate(String date){
        DateFormat sdf_dd = new SimpleDateFormat("ddMMyyyy");
        DateFormat sdf_d = new SimpleDateFormat("dMMyyyy");
        sdf_dd.setLenient(false);
        sdf_d.setLenient(false);
        try {
            sdf_dd.parse(date);
        } catch (ParseException e) {
            try{
                sdf_d.parse(date);
            } catch (Exception exception) {
                return false;
            }
        }
        return true;
    }




}