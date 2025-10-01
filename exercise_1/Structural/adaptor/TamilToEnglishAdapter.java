package Exercise_1.exercise_1.Structural.adaptor;

public class TamilToEnglishAdapter implements Language {
    private TamilSpeaker tamilSpeaker;

    public TamilToEnglishAdapter(TamilSpeaker tamilSpeaker) {
        this.tamilSpeaker = tamilSpeaker;
    }

   
    public void speak(String words) {
     
        tamilSpeaker.pesu(words);
    }
}
