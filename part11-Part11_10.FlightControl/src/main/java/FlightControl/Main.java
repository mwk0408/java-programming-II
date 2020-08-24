package FlightControl;

import FlightControl.ui.TextUI;
import java.util.Scanner;
import FlightControl.logic.FlightControl;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FlightControl flightControl=new FlightControl();
        TextUI ui=new TextUI(flightControl, scanner);
        ui.start();
    }
}
