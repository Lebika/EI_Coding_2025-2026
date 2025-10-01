package Exercise_1.exercise_1.Structural.adaptor;

public class Main {
    public static void main(String[] args) {
        
        Language tamilInterpreter = new TamilToEnglishAdapter(new TamilSpeaker());
        tamilInterpreter.speak("Hello, nice to meet you!");

      
        Language hindiInterpreter = new HindiToEnglishAdapter(new HindiSpeaker());
        hindiInterpreter.speak("Good morning, how are you?");
    }
}
