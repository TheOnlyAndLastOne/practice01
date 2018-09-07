package proxy.demo1;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 10:14
 * @Description:
 */
public class Client {

    public static void main(String[] args){
        Player player = new Player("张三");
        PlayerProxy playerProxy = new PlayerProxy(player);
        playerProxy.doTask();
        playerProxy.killBoss();
        playerProxy.makeMoney();
    }
}
