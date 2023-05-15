package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String word = "";
        int i = 0;
        while (i < chars.length){
            word+=chars[i++];
        }
        System.out.print(word);
    }
}
