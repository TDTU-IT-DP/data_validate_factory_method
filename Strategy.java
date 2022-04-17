public class Strategy {

    public static void main(String[] args) {
        ValidateFactory[] validators = {
            new NumberValidateFactory()
        };

        for (ValidateFactory validator: validators){
            System.out.println(validator.getClass().getSimpleName());
            validator.process();
        }
    }
}
