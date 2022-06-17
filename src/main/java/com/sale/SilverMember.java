package com.sale;

public class SilverMember extends BronzeMember{
    public SilverMember(String id,  int cost){
        super(id,cost);
    }
    public int getoffmoney(){
//        return (cost/1000)*discount*1000;
        return (int)(cost*0.1f);
    }
    @Override
    public void print() {
        int money = cost - getoffmoney();
        System.out.println(id + "\t" + money);
    }
}
