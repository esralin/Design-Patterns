public class GateronSwitchComponentFactory implements SwitchComponentFactory {
    @Override
    public KeyCap createKeyCap() {
        return new GateronKeyCap();
    }

    @Override
    public Stem createStem() {
        return new GateronStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return new GateronCoilSpring(55);
    }
}
