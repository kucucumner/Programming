import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
public class OK_JavaGoinHome {
    public static void main(String[] args) {

        String id = "JAVA APT 108";

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();
        // Light on
        Lighting hallLamp = new Lighting(id);
        hallLamp.on();

        Lighting floorLamp = new Lighting(id);
        floorLamp.on();

    }
}
