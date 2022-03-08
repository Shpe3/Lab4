package Elements;

public class Denfort extends Person implements PilotInterface {


    public Denfort(String name) {
        super(name);
    }


    @Override
    public void drivePlane(Plane plane) {
            System.out.printf("%s пилотирует самолёт \"%s\". И очень даже хорошо%n", this.getName(), plane.getName());
    }
}
