package ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        if (start == Station.TAIPEI_STATION) {
            if (destination == Station.TAICHUNG_STATION) {
                price = 600;
            } else {
                price = 1500;
            }
        } else if (start == Station.TAICHUNG_STATION) {
            if (destination == Station.TAIPEI_STATION) {
                price = 600;
            } else {
                price = 900;
            }
        } else if (start == Station.KAOHSIUNG_STATION) {
            if (destination == Station.TAICHUNG_STATION) {
                price = 900;
            } else {
                price = 1500;
            }
        }
    }

    public void print() {
//        if((start.id == 100 && destination.id == 300) || (start.id == 300 && destination.id == 100) ){
//            price = 1500;
//        }
//        else if((start.id == 100 && destination.id == 200) || (start.id == 300 && destination.id == 200) ){
//            price = 600;
//        }
//        else if((start.id == 300 && destination.id == 500) || (start.id == 500 && destination.id == 300) ){
//            price = 900;
//        }
//        System.out.println(price);
        System.out.println(start.name + "\t" + destination.name + "\t" + price );
    }
}
