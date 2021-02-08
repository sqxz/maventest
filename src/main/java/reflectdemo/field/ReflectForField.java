package reflectdemo.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectForField {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class cls = Integer.class;
        Class[] is = cls.getInterfaces();
        for (Class i : is) {
            System.out.println(i);
        }
    }
}
