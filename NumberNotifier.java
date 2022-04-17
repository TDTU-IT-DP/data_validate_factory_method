public class NumberNotifier implements Notifier {
    @Override
    public void onSuccess(){
        System.out.println("NumberNotifier: Success");
    }

    @Override
    public void onFail(){
        System.out.println("NumberNotifier: Fail");
    }

    @Override
    public void example(){
        System.out.println("NumberNotifier: Number must like: 0-9");
    }
}
