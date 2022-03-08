package Elements;

public class Ridge extends Thing implements RidgeInterface{

    private final String material;
    private final String attribute;

    public Ridge(String name, String material, String attribute) {
        super(name);
        this.material = material;
        this.attribute = attribute;
        this.spawn();
    }

    public String getAttribute() {
        return this.attribute;
    }

    @Override
    public void lookLike(String thing_name) {
        System.out.printf("%s выглядит как %s%n", this.name, thing_name);
    }

    @Override
    public void spawn() {
        System.out.printf("Скала \"%s\" создана из материала \"%s\"%n", name, material);
    }
}
