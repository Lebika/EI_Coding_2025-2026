package exercise_1.creational.factory;

public class ConverterFactory {
    public static DocumentConverter getConverter(String type) {
        if (type == null) return null;

        switch (type.toUpperCase()) {
            case "PDF":
                return new PDFConverter();
            case "WORD":
                return new WordConverter();
            case "EXCEL":
                return new ExcelConverter();
            default:
                throw new IllegalArgumentException("Unknown format: " + type);
        }
    }
}
