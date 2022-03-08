package Elements;

public class Plane extends Thing {

    private Person[] passengers;
    private Person[] pilots;
    public Aircamera aircamera;

    public static class Aircamera extends Thing {

        public Aircamera() {
            super("камера");
        }

        public void makePhoto(Person user) {
            System.out.printf("%s сделал фото%n", user.getName());
        }
    }

    public Plane(String plane_name) {
        super(plane_name);
        this.aircamera = new Aircamera();
        spawn();
    }

    public void setPilots(Person... pilots) {
        if (pilots.length == 1 | pilots.length == 2) {
            this.pilots = pilots;
        }
    }

    public void setPassengers(Person... passengers) {
        if (passengers.length <= 30) {
            this.passengers = passengers;
        }
    }

    public void changePilots() {
        System.out.println("Пилоты поменялись");
        Person buffer = pilots[0];
        pilots[0] = pilots[1];
        pilots[1] = buffer;
    }

    public void action() {
        System.out.printf("%s летит и управляется пилотами %s и %s", this.getName(), pilots[0].getName(), pilots[1].getName());
    }
}
