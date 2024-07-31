package jar;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import jar.business.Person;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person("paul");
        String personString = convertToJson(person);
        System.out.println("Json :" + personString);
        System.out.println(capitalizeString("hello hello"));
    }

    public static String convertToJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String capitalizeString(String str) {
        return StringUtils.capitalize(str);
    }
}
