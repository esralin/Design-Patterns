public class TactileSwitch extends Switch{
    SwitchComponentFactory componentFactory;

    public TactileSwitch(SwitchComponentFactory componentFactory){
        this.componentFactory = componentFactory;
    }
    @Override
    void gatherParts() {
        keyCap = componentFactory.createKeyCap();
        stem = componentFactory.createStem();
        coilSpring = componentFactory.createCoilSpring(PressureCN.Medium);
    }
}
