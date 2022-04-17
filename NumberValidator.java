public class NumberValidator implements Validator {
    @Override
    public boolean validate(String inputString) {
        // TODO Auto-generated method stub
        try {
            Integer.parseInt(inputString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
