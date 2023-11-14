// AmericanToEuropeanAdapter.java
public class AmericanToEuropeanAdapter implements PowerPlugAdapter {
    private AmericanPowerPlug americanPlug;

    public AmericanToEuropeanAdapter(AmericanPowerPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void plugIntoEuropeanSocket() {
        System.out.println("Using adapter to plug into European power socket");
        americanPlug.plugIn();
    }
}