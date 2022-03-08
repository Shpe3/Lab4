package Elements;

public class PibodysRecords extends Thing {

    public PibodysRecords(String name) {
        super(name);
        spawn();
    }

    public void action(Person user, Thing[] things) {
        System.out.printf("%s изучил запись%n", user.getName());

        for (Thing thing: things) {
            user.see(thing);
        }
    }
}
