package textio;

import textio.TodoFeatures;

import java.util.Scanner;

public class TodoInterface {
    private String userName;
    private String createTodos;

    Scanner input = new Scanner(System.in);
    TodoFeatures features = new TodoFeatures();

    public void todo(){
        System.out.println("Ramaz's Todo List");
        System.out.println("Welcome, Enter your first name");
        features.setUserName(userName);
        System.out.println("Welcome " + features.getUserName()+ ", Click on enter to continue");
        input.nextLine();
        System.out.println("Press tab and enter to save to-dos");
        features.createTxtFileForTodos();
        features.setTodoList(createTodos);

    }
}
