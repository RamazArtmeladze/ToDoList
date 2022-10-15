package textio;

public class Main {
    public static void main(String[] args) {
        TodoInterface userInterface = new TodoInterface();
        boolean continueInApp;
        do{
            userInterface.todo();
            System.out.println("Do you want to contiunue in app - Yes or No");
            continueInApp = TextIo.getlnBoolean();
        }while (continueInApp);

    }
}