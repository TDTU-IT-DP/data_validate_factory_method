
import java.util.Scanner;

public abstract class ValidateFactory {
    Scanner scanner;
    public abstract Validator getValidator();
    public abstract Notifier getNotifier();

    public ValidateFactory(){
        scanner = new Scanner(System.in);
    }

    public String readFromTerminal(){
        System.out.printf("Input data : ");
        String inputValue = scanner.next();
        return inputValue;
    }

    public void close(){
        scanner.close();
    }

    public void process(){
        Validator validator = getValidator();
        Notifier notifier = getNotifier();
        
        boolean isCorrect = false;
        while (!isCorrect){
            String inputValue = readFromTerminal();
            isCorrect = validator.validate(inputValue);
            if (isCorrect){
                notifier.onSuccess();
            }
            else{
                notifier.onFail();
                notifier.example();
            }
        }
    }
}
