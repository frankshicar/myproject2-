package sale;

public class customer {
    public static void main(String[] args) {
        BronzeMember bronzemember = new BronzeMember("001",1200);
        SilverMember silvermember = new SilverMember("002", 1200);
        discountCoustomer discountCoustomer = new discountCoustomer("003", 900);
        PlatinumMember platinumMember = new PlatinumMember("004", 1000);
        bronzemember.print();
        silvermember.print();
        discountCoustomer.print();
        platinumMember.print();
    }
}
