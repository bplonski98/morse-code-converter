package pl.sdacademy.converter;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class ParamsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                //  String input, String expectedCode
                Arguments.of("SDA", "... -.. .-"),
                Arguments.of("SOS", "... --- ..."),
                Arguments.of("JAVA", ".--- .- ...- .-"),
                Arguments.of("HEY SDA", ".... . -.--   ... -.. .-"),
                Arguments.of("JAVA ROCKS", ".--- .- ...- .-   .-. --- -.-. -.- ..."),
                Arguments.of("I LOVE JAVA", "..   .-.. --- ...- .   .--- .- ...- .-"),
                Arguments.of("SOFTWARE DEVELOPMENT ACADEMY", "... --- ..-. - .-- .- .-. .   -.. . ...- . .-.. --- .--. -- . -. -   .- -.-. .- -.. . -- -.--")
        );
    }
}
