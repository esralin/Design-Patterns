public class GateronCoilSpring extends CoilSpring{
    public GateronCoilSpring(int pressureCN) {
        super(pressureCN);
    }

    @Override
    public String toString() {
        return "GateronCoilSpring{" +
                "pressureCN=" + pressureCN +
                '}';
    }
}
