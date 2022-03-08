package Elements;

public class Binoculars extends Thing {

    public Binoculars(String name) {
        super(name);
        spawn();
    }


    public void ActionWithThink(Person user, Thing[] things) {
            System.out.printf("%s использовал бинокль%n", user.getName());

            for (Thing thing: things) {
                user.see(thing);
            }
    }

    public void ActionWithoutThink(Person user, Thing[] things) {
        System.out.printf("%s использовал бинокль%n", user.getName());

        for (Thing thing: things) {
            user.SeeThings(thing);
        }
    }

}
