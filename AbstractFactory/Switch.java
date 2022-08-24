public abstract class Switch {
    String name;
    KeyCap keyCap;
    Stem stem;
    CoilSpring coilSpring;

    abstract void gatherParts();

    void placeCoilSpring() {
        System.out.println("Coil is placed into base");
    }

    void placeStem() {
        System.out.println("Stem is placed on to coil");
    }

    void placeKeyCap() {
        System.out.println("KeyCap is placed on to the stem");
    }

    @Override
    public String toString() {
        return "Switch{" +
                "name='" + name + '\'' +
                ", keyCap=" + keyCap +
                ", stem=" + stem +
                ", coilSpring=" + coilSpring +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKeyCap(KeyCap keyCap) {
        this.keyCap = keyCap;
    }
}
