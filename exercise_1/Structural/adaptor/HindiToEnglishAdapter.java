package Exercise_1.exercise_1.Structural.adaptor;

public class HindiToEnglishAdapter implements Language {
    private HindiSpeaker hindiSpeaker;

    public HindiToEnglishAdapter(HindiSpeaker hindiSpeaker) {
        this.hindiSpeaker = hindiSpeaker;
    }

    @Override
    public void speak(String words) {
      
        hindiSpeaker.bolo(words);
    }
}
