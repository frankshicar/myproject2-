package com.sale;

public class BronzeMember{
    int cost;
    String id;
    float discount = 0.1f;
    public BronzeMember(String id, int cost){
        this.id = id;
        this.cost = cost;
    }
    public int returnmoney(){
        return (int)((cost/1000)*discount*1000);
    }
    public void print() {
        int money = cost - returnmoney();
        System.out.println(id + "\t" + (money));
    }
}
