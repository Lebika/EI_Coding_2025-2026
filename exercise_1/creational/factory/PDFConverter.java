package exercise_1.creational.factory;

public class PDFConverter implements DocumentConverter {
    @Override
    public void convert(String inputFile) {
        System.out.println("Converting " + inputFile + " to PDF format...");
    }
}
