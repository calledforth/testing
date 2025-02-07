public interface UnnecessaryInterface {
    void doSomething();
}

class OnlyImplementation implements UnnecessaryInterface {
    @Override
    public void doSomething() {
        System.out.println("Only implementation");
    }
}
public class UnnecessaryInterface {
    
}
