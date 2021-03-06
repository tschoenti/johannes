package ch.johannes;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

    public static String readFileInPackage(Object instanceOfPackage, String filename) {
        Package aPackage = instanceOfPackage.getClass().getPackage();
        String packageName = aPackage.getName();
        String resourceName = "/".concat(packageName.replace('.', '/')).concat("/").concat(filename);

        try(InputStream resourceAsStream = instanceOfPackage.getClass().getResourceAsStream(resourceName)) {
            if (resourceAsStream == null) {
                throw new IllegalArgumentException(String.format("Couldn't find resource '%s' in package '%s' (%s).", filename, packageName, resourceName));
            }

            return readInputStream(resourceAsStream);
        } catch (IOException e) {
            throw new IllegalArgumentException("Couldn't find or read resource " + filename, e);
        }
    }

    private static String readInputStream(InputStream inputStream) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(inputStream); ByteArrayOutputStream buf = new ByteArrayOutputStream()) {
            int result = bis.read();
            while (result != -1) {
                buf.write((byte) result);
                result = bis.read();
            }
            return buf.toString();
        }
    }

}
