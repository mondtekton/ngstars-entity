package tg.ngstars.entity.exceptions;

public class FileNotAllowedException extends FileStorageException {
  public FileNotAllowedException(String type) {
    super(String.format("File Type %s Not Allowed!", type));
  }
}
