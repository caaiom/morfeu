package br.com.morfeu.api.model;

import java.util.stream.Stream;

/**
 * Created by cmaia on 14/04/16
 */
public enum Language {
    JAVA,
    PYTHON,
    RUBY,
    JAVASCRIPT;

    public Language fromName(String name) {
        if (name != null) {
            return Stream.of(Language.values()).filter(x -> x.name().equalsIgnoreCase(name)).findFirst().orElse(null);
        }

        return null;
    }
}
