package exception;

public class DbGenericError extends RuntimeException{
    public DbGenericError(String error) {
        System.out.println(error);
    }
}
