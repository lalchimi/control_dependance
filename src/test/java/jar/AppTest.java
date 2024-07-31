package jar;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jar.business.Person;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        Person person = new Person("Paul");
        String personString = convertToJson(person);
        System.out.println("Json :" + personString);
        System.out.println(capitalizeString("hello world"));
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
