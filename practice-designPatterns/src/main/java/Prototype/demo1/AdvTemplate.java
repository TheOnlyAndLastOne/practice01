package Prototype.demo1;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 12:10
 * @Description:
 */
public class AdvTemplate {
    private String advContext;
    private String advSubject;

    public AdvTemplate(String advContext,String advSubject){
        this.advContext = advContext;
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public String getAdvSubject() {
        return advSubject;
    }
}
