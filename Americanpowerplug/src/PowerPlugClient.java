// PowerPlugClient.java
public class PowerPlugClient {
    public static void main(String[] args) {
        // Create an American power plug
        AmericanPowerPlug americanPlug = new AmericanPowerPlug();

        // Create an adapter for the American power plug
        PowerPlugAdapter adapter = new AmericanToEuropeanAdapter(americanPlug);

        // Plug the American power plug into the European power socket using the adapter
        plugIntoEuropeanSocket((EuropeanPowerSocket) adapter);
    }

    public static void plugIntoEuropeanSocket(EuropeanPowerSocket europeanSocket) {
        europeanSocket.plugIntoEuropeanSocket();
    }
}