package patterns.reflection;

import patterns.factory.EnemyShipFactory;
import patterns.factory.UFOEnemyShip;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestingReflection {
    @SuppressWarnings("rawtypes")
    static void main() throws Exception {
        Class<UFOEnemyShip> reflectClass = UFOEnemyShip.class;

        String className = reflectClass.getSimpleName();
        System.out.println(className);

        // isAbstract(), isFinal(), isInterface(), isMemberClass(), isPrimitive(), isSynthetic()
        // isPrivate(), isProtected(), isPublic(), isStatic(), isSynthetic(), isAnnotation()

        int classModifiers = reflectClass.getModifiers();
        System.out.println(classModifiers);

        Class<?> superclass = reflectClass.getSuperclass();
        System.out.println(superclass);

        Class<?>[] interfaces = reflectClass.getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println(i);
        }

        Method[] methods = reflectClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
            if(m.getName().startsWith("get")){
                System.out.println("Getter Method " + m.getReturnType().getSimpleName());
            }
            else if(m.getName().startsWith("set")){
                System.out.println("Setter Method " + m.getReturnType().getSimpleName());
            }
            else {
                System.out.println("Other Method " + m.getName());
            }
            System.out.println(m.getReturnType());
            System.out.println(Arrays.toString(m.getParameterTypes()));
            System.out.println(m.getModifiers());
            System.out.println(Arrays.toString(m.getExceptionTypes()));
            System.out.println();
        }
        System.out.println("\n\n\n");
        Constructor<?> constructor = reflectClass.getConstructor();
        UFOEnemyShip constructor2 = reflectClass.getConstructor(int.class, String.class).newInstance(12, "test");
        System.out.println(constructor);
        System.out.println(constructor2);


        Class[] constructorParams = constructor.getParameterTypes();
        for (Class c : constructorParams) {
            System.out.println(c);
        }

        constructor2.setName("XTM Powerful EnemyShip");
        System.out.println(constructor2.getName());
        System.out.println("\n\n\n");

        UFOEnemyShip enemyShipPrivate = new UFOEnemyShip();
        Field privateName = UFOEnemyShip.class.getDeclaredField("idCode");
        System.out.println(privateName);
    }
}
