package proxy.demo2;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 10:43
 * @Description:
 */
public class Player implements IPlayer{
    private String username;

    public Player(){
    }

    public Player(String username){
        this.username = username;
    }

    public void doTask() {
        System.out.println(username+"做任务");
    }

    public void killBoss() {
        System.out.println(username+"杀boss");
    }

    public void makeMoney() {
        System.out.println(username+"赚钱");
    }
}
