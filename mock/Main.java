package mock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TODO
class File {
    String getFileName() {
        return "getFileName";
    }

    String getFileExtension() {
        return "getFileExtension";
    }

    String getFileCreateDate() {
        return "getFileCreateDate";
    }

    String getFileModificationDate() {
        return "getFileModificationDate";
    }

}

interface FileFilter {
//    List<File> getFilteredFiles(List<File> files);
    boolean filterFile(File file);
}

class FileNameFilter implements FileFilter {
    private final String filename;

    FileNameFilter( String filename) {
        this.filename = filename;
    }

    @Override
    public boolean filterFile(File file) {
        return file.getFileName().contains(filename);
    }
}

//TODO
class FileExtensionFilter implements FileFilter {
    @Override
    public boolean filterFile(File file) {
        return false;
    }
}

//TODO
class FileLocalDateTimeFilter implements FileFilter {
    @Override
    public boolean filterFile(File file) {
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();

        FileNameFilter fileNameFilter = new FileNameFilter("filename");
        FileExtensionFilter fileExtensionFilter = new FileExtensionFilter();
        FileLocalDateTimeFilter fileLocalDateTimeFilter = new FileLocalDateTimeFilter();

        Main main = new Main();
        var res = main.applyFilters(files, fileNameFilter, fileExtensionFilter, fileLocalDateTimeFilter);
    }

    public List<File> applyFilters(List<File> files, FileFilter... filters) {

        return files.stream()
                .filter(file -> {
                        for (FileFilter filter : filters) {
                             if (!filter.filterFile(file)) {
                                 return false;
                             }
                        }
                        return true;
                })
                .collect(Collectors.toList());
    }


    //old - wrong
    public static List<File> filterFiles(String filter, String extension, String fileCreateDate, String fileModificationDate, List<File> files) {
        return files.stream()
                .filter(it -> (it.getFileName().contains(filter)
                        && it.getFileExtension().equals(extension)
                        && it.getFileCreateDate().equals(fileCreateDate))
                        && it.getFileModificationDate().equals(fileModificationDate))
                .collect(Collectors.toList());
    }

}
