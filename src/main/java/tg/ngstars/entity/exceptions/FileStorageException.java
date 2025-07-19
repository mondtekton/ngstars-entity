package tg.ngstars.entity.exceptions;

public class FileStorageException extends RuntimeException {

  public FileStorageException() {
    super("Unexpected File Storage Error!");
  }

  public FileStorageException(String message) {
    super(message);
  }

  public FileStorageException(Throwable cause) {
    super("Unexpected File Storage Error!", cause);
  }

  public FileStorageException(String message, Throwable cause) {
    super(message, cause);
  }
}
