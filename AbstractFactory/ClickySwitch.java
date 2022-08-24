public class ClickySwitch extends Switch{
    SwitchComponentFactory componentFactory;

    public ClickySwitch(SwitchComponentFactory componentFactory){
        this.componentFactory = componentFactory;
    }
    @Override
    void gatherParts() {
        keyCap = componentFactory.createKeyCap();
        stem = componentFactory.createStem();
        coilSpring = componentFactory.createCoilSpring(PressureCN.Heavy);
    }
}
