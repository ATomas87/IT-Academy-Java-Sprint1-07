package n2exercici1;

import org.json.JSONObject;

import java.lang.annotation.Annotation;

public class SerializeToJSON {
    public static void main(String[] args) {
        Person person = new Person("Antonio", "Tomás", "123124123V");
        JSONObject jsonObject = new JSONObject(person);

        ObjectToJsonFile annotation = person.getClass().getAnnotation(ObjectToJsonFile.class);

        System.out.println(jsonObject);
        System.out.println("Directorio: " + annotation.directory());
    }
}
