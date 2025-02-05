package com.example.exceptions;

import java.io.Closeable;

public class ExceptionHandler {
    public void demonstrateExceptionHandling(String input) throws CustomException {
        try {
            if (input == null) {
                throw new CustomException("Input cannot be null");
            }
            // Process input
        } catch (Exception e) {
            throw new CustomException("Error processing input", e);
        } finally {
            // Cleanup code
        }
    }

    public void demonstrateResourceHandling() {
        try (AutoCloseable resource = new DummyResource()) {
            // Use resource
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class DummyResource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            // Cleanup code
        }
    }
}
