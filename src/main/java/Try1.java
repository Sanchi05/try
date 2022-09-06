import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.*;
import java.util.stream.Stream;

public class Try1 {

    public static String newF(Hehe hehe){
        hehe.setI(10);
        return "hehe";
    }
    public static void main(String args[]) throws JsonProcessingException {
        Hehe hehe = new Hehe();
        String newStr = newF(hehe);
        System.out.println(newStr);
        System.out.println(hehe.i);
    }




}