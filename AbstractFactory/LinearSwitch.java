public class LinearSwitch extends Switch{
    SwitchComponentFactory componentFactory;


    public LinearSwitch(SwitchComponentFactory componentFactory){
        this.componentFactory = componentFactory;
    }
    @Override
    void gatherParts() {
        keyCap = componentFactory.createKeyCap();
        stem = componentFactory.createStem();
        coilSpring = componentFactory.createCoilSpring(PressureCN.Light);
    }


}
