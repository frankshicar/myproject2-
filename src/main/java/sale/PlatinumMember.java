package sale;

public class PlatinumMember extends BronzeMember{
    public PlatinumMember(String id , int cost){
        super(id, cost);
    }
    public int paybackmoney(){
        return (int)(cost*0.2f);
    }

    @Override
    public void print() {
        System.out.println(id + "\t" + (int)(cost*0.7f) + "\t" + "paybackmoney " + paybackmoney());
    }
}
