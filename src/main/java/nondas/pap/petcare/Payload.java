package nondas.pap.petcare;

public class Payload<T> {
    private String message = "Success";
    private T data;

    public Payload(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public Payload( T data) {
        this.data = data;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}