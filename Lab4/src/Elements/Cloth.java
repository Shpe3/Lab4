package Elements;

public class Cloth extends Thing{

    public Cloth(String name) {
        super(name);
        spawn();
    }

    public void action(Person user, Thing[] things) {
        System.out.printf("%s одет%n", user.getName());

        for (Thing thing: things) {
            user.see(thing);
        }
    }
}
