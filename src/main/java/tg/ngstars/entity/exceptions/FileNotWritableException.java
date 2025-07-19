package tg.ngstars.entity.exceptions;

public class FileNotWritableException extends FileStorageException {
  public FileNotWritableException() {
    super("Storage Directory Not Writable!");
  }
}
