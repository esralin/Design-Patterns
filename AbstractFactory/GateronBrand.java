public class GateronBrand extends SwitchMaker{
    @Override
    Switch createSwitch(String type) {
        Switch concreteSwitch = null;
        SwitchComponentFactory componentFactory = new GateronSwitchComponentFactory();

        if(type.equals("Linear")){
            concreteSwitch = new LinearSwitch(componentFactory);
        }
        if(type.equals("Tactile")){
            concreteSwitch = new TactileSwitch(componentFactory);
        }
        if(type.equals("Clicky")){
            concreteSwitch = new ClickySwitch(componentFactory);
        }
        return concreteSwitch;
    }

    @Override
    Switch assembleSwitch(String type) {
        Switch concreteSwitch = createSwitch(type);
        concreteSwitch.setName("Gateron");
        concreteSwitch.placeStem();
        concreteSwitch.placeCoilSpring();
        concreteSwitch.placeKeyCap();
        concreteSwitch.gatherParts();
        return concreteSwitch;
    }
}
