package proxy.demo1;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 10:12
 * @Description:
 */
public class PlayerProxy extends Player {
    private Player player;

    public PlayerProxy(Player player){
        this.player = player;
    }

    public void doTask() {
        player.doTask();
    }

    public void killBoss() {
        player.killBoss();
    }

    public void makeMoney() {
        player.makeMoney();
    }
}
