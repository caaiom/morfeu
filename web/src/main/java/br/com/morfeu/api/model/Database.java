package br.com.morfeu.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

/**
 * Created by cmaia on 4/15/16.
 */
public enum Database {
    MYSQL("mysql"),
    POSTGRESQL("postgres"),
    ORACLE("oracle");

    private String name;

    Database(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Database fromName(String name) {
        if (name != null) {
           return Stream.of(Database.values()).filter(x -> x.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
        }

        return null;
    }
}
