package Elements;

public class Person {

    private final String name;
    private State state;

    public Person(String name) {
        this.name = name;
        this.state = State.NORMAL;
    }

    public void setState(State state) {
        if (this.state == state) {
            return;
        }
        System.out.printf("Состояние %s сменилось на \"%s\"%n", this.name, state);
        this.state = state;
    }

    public String getName() {
        return this.name;
    }

    public void see(Thing thing) {
        if (thing instanceof Ridge) {
            System.out.printf("%s увидел %s%n", this.name, thing.getName());
            this.setState(State.EXCITED);
        }
    }

    public void SeeThings(Thing thing) {
        if (thing instanceof Ridge) {
            System.out.printf("%s увидел %s%n", this.name, thing.getName());
        }
    }

    public void think(Thing thing, String thought) {
        System.out.printf("%s подумал о %s следующее: %s%n", this.name, thing.getName(), thought);
    }

    public void think(Thing thing) {
        System.out.printf("%s подумал о %s%n", this.name, thing.getName());

        if (thing instanceof Ridge) {
            if (((Ridge) thing).getAttribute() == "равномерность" | ((Ridge) thing).getAttribute() == "чередование") {
                this.setState(State.SCARED);
            }
        }
    }

    public void think(String thought) {
        System.out.printf("%s подумал следующее: %s%n", this.name, thought);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Person) {
            return this.name.equals(((Person) obj).getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
