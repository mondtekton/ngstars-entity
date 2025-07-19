package tg.ngstars.entity.exceptions;

public class FileEntityNotFoundException extends FileStorageException {
  public FileEntityNotFoundException() {
    super("File Not Found!");
  }
}
