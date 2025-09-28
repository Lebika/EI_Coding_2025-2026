package exercise_1.creational.factory;

public class ExcelConverter implements DocumentConverter {
    @Override
    public void convert(String inputFile) {
        System.out.println("Converting " + inputFile + " to Excel format...");
    }
}
