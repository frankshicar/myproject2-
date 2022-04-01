package sale;

import java.util.ArrayList;
import java.util.List;

public class customer {
    public static void main(String[] args) {
//        BronzeMember c1 = new BronzeMember("001",1200);
//        SilverMember c2 = new SilverMember("002", 1200);
//        discountCoustomer c3 = new discountCoustomer("003", 900);
//        PlatinumMember c4 = new PlatinumMember("004", 1000);
//        c1.print();
//        c2.print();
//        c3.print();
//        c4.print();
        List<BronzeMember> customers = new ArrayList<>();
        customers.add(new BronzeMember("001",1200));
        customers.add(new SilverMember("002", 1200));
        customers.add(new discountCoustomer("003", 900));
        customers.add(new PlatinumMember("004", 1000));
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for( BronzeMember c:customers){
            c.print();
        }
    }
}
