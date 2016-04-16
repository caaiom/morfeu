package br.com.morfeu.api.model;

import java.util.stream.Stream;

/**
 * Created by cmaia on 4/15/16.
 */
public enum Database {
    MYSQL,
    POSTGRESQL,
    ORACLE;

    public Database fromName(String name) {
        if (name != null) {
           return Stream.of(Database.values()).filter(x -> x.name().equalsIgnoreCase(name)).findFirst().orElse(null);
        }

        return null;
    }
}
