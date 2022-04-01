package sale;

public class discountCoustomer extends BronzeMember{
    public discountCoustomer(String id, int cost){
        super(id, cost);
    }

    @Override
    public void print() {
        float money = cost - cost*discount;
        System.out.println(id + "\t" + (int)(money));
    }
}
