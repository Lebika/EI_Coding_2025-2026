package exercise_1.creational.factory;

public class WordConverter implements DocumentConverter {
    @Override
    public void convert(String inputFile) {
        System.out.println("Converting " + inputFile + " to Word format...");
    }
}
