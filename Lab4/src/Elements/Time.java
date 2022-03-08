package Elements;

public class Time extends Thing{
    public Time() {
        super("время");
    }

    public void harm(Ridge ridge) {
        System.out.printf("Время покрошило и закруглило %s%n", ridge.name);
    }
}
