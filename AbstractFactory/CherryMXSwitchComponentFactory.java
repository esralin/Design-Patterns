public class CherryMXSwitchComponentFactory implements SwitchComponentFactory {


    @Override
    public KeyCap createKeyCap() {
        return new CherryMXKeyCap();
    }


    @Override
    public Stem createStem() {
            return new CherryMXStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        if (pressureCN == PressureCN.Light) {
            return new CherryMXCoilSpring(45);
        }
        else if (pressureCN == PressureCN.Medium) {
            return new CherryMXCoilSpring(55);
        }
        else if (pressureCN == PressureCN.Heavy) {
            return new CherryMXCoilSpring(60);
        }
        else if(pressureCN == PressureCN.SuperHeavy){
            return new CherryMXCoilSpring(80);
        }
        else
        return new CherryMXCoilSpring(0);
    }


}
