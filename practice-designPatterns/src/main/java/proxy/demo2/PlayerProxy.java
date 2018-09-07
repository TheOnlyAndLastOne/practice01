package proxy.demo2;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 10:47
 * @Description:
 */
public class PlayerProxy implements IPlayer, Count, SignContract{

    private IPlayer iPlayer;

    public PlayerProxy(IPlayer iPlayer){
        this.iPlayer = iPlayer;
    }

    public void doRequest(){
        before();
        doTask();
        killBoss();
        makeMoney();
        after();
    }

    public void doTask() {
        iPlayer.doTask();
    }

    public void killBoss() {
        iPlayer.killBoss();
    }

    public void makeMoney() {
        iPlayer.makeMoney();
    }

    private void before(){
       signContract();
    }

    private void after(){
       giveMoney();
    }

    public void giveMoney() {
        System.out.println("结算工资");
    }

    public void signContract() {
        System.out.println("签订合同");
    }
}
