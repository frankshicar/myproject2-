package com;

public class BronzeMember{
    int cost;
    String id;
    float discount = 0.1f;
    public BronzeMember(String id, int cost){
        this.id = id;
        this.cost = cost;
    }
    public float returnmoney(){
        return (cost/1000)*discount*1000;
    }
    public void print() {
        float money = cost - returnmoney();
        System.out.println(id + " \t" + money);
    }
}
