package Elements;

public class Storyteller extends Person implements PilotInterface{
    public Storyteller(String name) {
        super(name);
    }

    @Override
    public void drivePlane(Plane plane) {
        System.out.printf("%s пилотирует самолёт \"%s\". Не очень удачно%n", this.getName(), plane.getName());
    }
}
