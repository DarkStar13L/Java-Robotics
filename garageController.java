import java.util.Scanner;

public class garageController {
    private enum State {
        OPENING, STOPPED, CLOSING
    }

    private State currentState;

    public garageController() {
        currentState = State.CLOSING;
    }

    public String getCurrentState() {
        return currentState.name();
    }

    public void nextState() {
        switch (currentState) {
            case OPENING:
                currentState = State.STOPPED;
                break;
            case STOPPED:
                currentState = State.CLOSING;
                break;
            case CLOSING:
                currentState = State.OPENING;
                break;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Current State: " + getCurrentState());
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("next")) {
                nextState();
            } else if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        garageController garage = new garageController();
        garage.run();
    }
}
