package parsing;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import domain.Person;

public class StringToJson {

    ObjectMapper objectMapper = new ObjectMapper();


    public void convertToObject(){

        String jsonString = "{\"id\" : \"1\", \"fName\" : \"kumar\", \"lName\" : \"vemulapally\", \"city\" : \"ballwin\"}";
        try {
            Person person = objectMapper.readValue(jsonString, Person.class);
            person.getCity();
            person.getfName();
        } catch (Exception e){
            System.out.println("exception occured : "+e.getCause());
        }
    }


}
