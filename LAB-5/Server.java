import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            try {
                LocateRegistry.createRegistry(1099);
            } catch (Exception ignored) {
            }

            CalculatorImplementation calculator = new CalculatorImplementation();
            Naming.rebind("rmi://localhost/Calculator", calculator);
            System.out.println("Calculator service is running on rmi://localhost/Calculator");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}