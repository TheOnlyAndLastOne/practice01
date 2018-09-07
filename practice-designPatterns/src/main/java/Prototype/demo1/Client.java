package Prototype.demo1;

import java.util.Random;

/**
 * @Author: zhaozhi
 * @Date: 2018/9/6 0006 13:52
 * @Description:
 */
public class Client {
    public static void main(String[] args){
        int i = 0;
        Mail mail = new Mail(new AdvTemplate("活动通知：参与者有机会获取百万大奖","XX银行国庆信用卡抽奖活动"));
        mail.setTail("XX银行版权所有");
        while (i<6){
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+"先生（女士）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t...发送成功！");
    }

    public static String getRandString(int maxLength){
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
