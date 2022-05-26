package n3exercici1;

import java.lang.reflect.Method;

public class SerializeToJSON {
    public static void main(String[] args) {
        try{
            Class<?> aClass = Class.forName("n3exercici1.Person");
            Method[] methods = aClass.getDeclaredMethods();
            if (aClass.isAnnotationPresent(ObjectToJsonFile.class)){
                ObjectToJsonFile annotation = aClass.getAnnotation(ObjectToJsonFile.class);
                System.out.println("Acceso a la anotación y su contenido mediante Reflection API:");
                System.out.println(annotation.directory());
            }
            System.out.println();
            System.out.println("Acceso a los métodos de la clase mediante Reflection API:");
            for (Method method : methods){
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
