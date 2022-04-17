public class NumberValidateFactory extends ValidateFactory {
    @Override
    public Validator getValidator(){
        return new NumberValidator();
    }

    @Override
    public Notifier getNotifier(){
        return new NumberNotifier();
    }
}
