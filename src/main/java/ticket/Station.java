package ticket;

public class Station {
    public static Station TAIPEI_STATION =
            new Station(100, "Taipei");
    public static Station TAICHUNG_STATION =
            new Station(200, "Taichung");
    public static Station KAOHSIUNG_STATION =
            new Station(300, "Kaohsiung");
    int id;
    String name;
    public Station(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
