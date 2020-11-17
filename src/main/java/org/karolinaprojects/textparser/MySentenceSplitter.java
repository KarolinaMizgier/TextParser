package org.karolinaprojects.textparser;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MySentenceSplitter implements Splitter {
    @Override
    public List<String> split(String text) {

        char[] chars = text.toCharArray();

        List<String> splittedText = new ArrayList<>();
        List<Character> characters = new ArrayList<>();

        for (Character character : chars) {
            characters.add(character);
            if (character == '.' || character == '?' || character == '!') {
                characters = addLine(characters, splittedText);
            }
        }
        return splittedText;
    }
    private List<Character> addLine(List<Character> characters, List<String> text) {
        String string = characters.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        text.add(string);
        return new ArrayList<>();
    }
}