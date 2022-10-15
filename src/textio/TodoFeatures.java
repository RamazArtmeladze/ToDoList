package textio;
import java.util.Scanner;
public class TodoFeatures {
    private String userName;
    private String todoList;
    private boolean continueInApp;
    Scanner input = new Scanner (System.in);
    public void setUserName(String userName){
        userName = input.next();
        this.userName  = userName;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setTodoList(String todoList){
        input.useDelimiter("\\t");
        while(true){
            todoList = input.next();
            break;
        }
    }
    public void setContinueInApp(boolean yesOrNo){
        this.continueInApp = yesOrNo;
    }
    public boolean isContinueInApp(){
        return this.continueInApp;
    }
    public void createTxtFileForTodos(){
        TextIo.writeFile("Todos.txt");
        TextIo.putln(this.todoList);
    }

}
