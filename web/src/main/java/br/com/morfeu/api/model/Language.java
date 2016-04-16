package br.com.morfeu.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

/**
 * Created by cmaia on 14/04/16
 */
public enum Language {
    JAVA("java"),
    PYTHON("python"),
    RUBY("ruby"),
    JAVASCRIPT("javascript");

    private String name;

    Language(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language fromName(String name) {
        if (name != null) {
            return Stream.of(Language.values()).filter(x -> x.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
        }

        return null;
    }
}
