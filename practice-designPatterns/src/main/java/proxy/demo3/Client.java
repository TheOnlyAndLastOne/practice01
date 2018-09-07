package proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 10:51
 * @Description:
 */
public class Client {
    public static void main(String[] args){
        IPlayer iPlayer = new Player("王五");
        ClassLoader aClass = iPlayer.getClass().getClassLoader();
        InvocationHandler invocationHandler = new PlayerProxy(iPlayer);
        IPlayer iPlayer1 = (IPlayer) Proxy.newProxyInstance(aClass,iPlayer.getClass().getInterfaces(),invocationHandler);
        iPlayer1.doTask();
    }
}
