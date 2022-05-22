package interfaces;

import java.io.File;


public interface ObjectFileHandler <T> {

    void writeObjectToFile(T t, File file);

    T readObjectsFromFile(File file);

}
