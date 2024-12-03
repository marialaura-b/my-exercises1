package io.codeforall.fanstatics;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        MyPojo myPojo2 = mapper.readValue(new URL("https://ipinfo.io/json"), MyPojo.class);

        String jsonString = mapper.writeValueAsString(myPojo2);

        System.out.println(jsonString);

    }
}