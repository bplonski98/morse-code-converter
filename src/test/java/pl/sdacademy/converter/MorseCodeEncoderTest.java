package pl.sdacademy.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;


class MorseCodeEncoderTest {

    private final MorseCodeDictionary dictionary = new MorseCodeDictionary();
    private final MorseCodeEncoder encoder = new MorseCodeEncoder(dictionary);

    @ParameterizedTest
    //@MethodSource("paramsProvider")
    @ArgumentsSource(ParamsProvider.class)
    void testEncodeHappyPath(String input, String expectedCode) {

        // when
        final String actualCode = encoder.encode(input);

        // then
        Assertions.assertEquals(expectedCode, actualCode);
    }
    @ParameterizedTest
    //@MethodSource("paramsProvider")
    @ArgumentsSource(ParamsProvider.class)
    void testEncodeStreamMethodHappyPath(String input, String expectedCode) {

        // when
        final String actualCode = encoder.encodeStreamMethod(input);

        // then
        Assertions.assertEquals(expectedCode, actualCode);
    }
}