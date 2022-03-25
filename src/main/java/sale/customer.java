package sale;

public class customer {
    public static void main(String[] args) {
        BronzeMember bronzemember = new BronzeMember("001",1200);
        SilverMember silvermember = new SilverMember("002", 1200);
        bronzemember.print();
        silvermember.print();
    }
}
