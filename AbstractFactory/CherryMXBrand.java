public class CherryMXBrand extends SwitchMaker{

    @Override
    Switch createSwitch(String type) {
        Switch concreteSwitch = null;
        SwitchComponentFactory componentFactory = new CherryMXSwitchComponentFactory();

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
        concreteSwitch.setName("CherryMX");
        concreteSwitch.placeCoilSpring();
        concreteSwitch.placeStem();
        concreteSwitch.placeKeyCap();
        concreteSwitch.gatherParts();
        return concreteSwitch;
    }
}
