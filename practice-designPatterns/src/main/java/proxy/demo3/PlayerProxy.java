package proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 10:47
 * @Description:
 */
public class PlayerProxy implements InvocationHandler {

    private Class aClass;

    private Object object;

    public PlayerProxy(Object object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke前");
        Object result = method.invoke(this.object,args);
        System.out.println("invoke后");
        return result;
    }
}
