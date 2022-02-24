package java16.interfacereflexion;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.ClassLoader.getSystemClassLoader;

/**
 * Java 16 introduces Proxy object that has
 * static methods for creating objects that act like instances of interfaces
 * but allow for customized method invocation.
 */
public class InvokeDefaultInterfaceMethods {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object proxy = Proxy.newProxyInstance(getSystemClassLoader(), new Class<?>[] { InterfaceTest.class },
                (o, m, params) -> {
                    if (m.isDefault()) {
                        // if it's a default method, invoke it
                        return InvocationHandler.invokeDefault(o, m, params);
                    }
                    return o;
                });

        Method method = proxy.getClass().getMethod("display");
        method.invoke(proxy);
    }
}
