public class BadExceptionHandling {
    public void process() {
        try {
            riskyOperation();
        } catch (Exception e) {
            // Bad practice: catching general exception first
        } catch (IllegalArgumentException e) {
            // This will never be reached
        }
    }

    private void riskyOperation() {
        throw new IllegalArgumentException("Something went wrong");
    }
}
