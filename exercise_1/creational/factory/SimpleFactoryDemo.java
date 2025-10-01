package exercise_1.creational.factory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        String inputFile = "report.txt";

        DocumentConverter converter1 = ConverterFactory.getConverter("PDF");
        converter1.convert(inputFile);

        DocumentConverter converter2 = ConverterFactory.getConverter("WORD");
        converter2.convert(inputFile);

        DocumentConverter converter3 = ConverterFactory.getConverter("EXCEL");
        converter3.convert(inputFile);
    }
}
