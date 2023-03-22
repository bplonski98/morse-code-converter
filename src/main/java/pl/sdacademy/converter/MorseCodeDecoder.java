package pl.sdacademy.converter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    private final static String LETTER_DELIMITER = " ";
    private final static String WORD_DELIMITER = " {3}";
    private final MorseCodeDictionary dictionary;

    public MorseCodeDecoder(MorseCodeDictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String decode(String morseCode) {
        String[] words = morseCode.split(WORD_DELIMITER);

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split(LETTER_DELIMITER);

            for (String letter : letters) {
                String dictionaryLetter = dictionary.getLetter(letter);
                sb.append(dictionaryLetter);
            }
            sb.append(LETTER_DELIMITER);
        }

        return sb.toString().trim();
    }
    public String decodeStreamMethod(String morseCode) {
        return Arrays.stream(morseCode.split(WORD_DELIMITER))
                .map(w -> w.split(LETTER_DELIMITER))
                .map(this::createWord)
                .collect(Collectors.joining(LETTER_DELIMITER));
    }
        private String createWord(String[] letters) {
        return Arrays.stream(letters)
                .map(dictionary::getLetter)
                .collect(Collectors.joining());
    }
}
