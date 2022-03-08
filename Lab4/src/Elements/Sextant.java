package Elements;

public class Sextant extends Thing {

    public Sextant(String name) {
        super(name);
        spawn();
    }

    public void action(Person user, Thing[] things) {
        System.out.printf("%s использовали секстант%n", user.getName());
        System.out.println("Место для пререлета найдено");

        for (Thing thing: things) {
            user.see(thing);
        }
    }
}
