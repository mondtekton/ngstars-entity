package tg.ngstars.entity.exceptions;

public class InvalidFileTypeException extends FileStorageException {
  public InvalidFileTypeException() {
    super("File Type Not Determinable!");
  }

  public InvalidFileTypeException(String message) {
    super(message);
  }
}
