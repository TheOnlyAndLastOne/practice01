package proxy.demo2;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 10:51
 * @Description:
 */
public class Client {
    public static void main(String[] args){
        IPlayer iPlayer = new Player("李四");
        PlayerProxy playerProxy = new PlayerProxy(iPlayer);
        playerProxy.doRequest();
    }
}
