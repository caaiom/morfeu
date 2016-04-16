package br.com.morfeu.api.model.generate;

import java.io.Serializable;

import br.com.morfeu.api.model.Database;
import br.com.morfeu.api.model.Language;

/**
 * Created by cmaia on 14/04/16
 */
public class GenerateApiViewModel implements Serializable {

    private static final long serialVersionUID = 3835054156564409733L;
    private String connection;
    private Language language;
    private Database database;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }

        GenerateApiViewModel that = (GenerateApiViewModel) o;

        if(connection != null ? !connection.equals(that.connection) : that.connection != null) {
            return false;
        }
        if(language != that.language) {
            return false;
        }
        return database == that.database;
    }

    @Override
    public int hashCode() {
        int result = connection != null ? connection.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (database != null ? database.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenerateApiViewModel{");
        sb.append("connection='").append(connection).append('\'');
        sb.append(", language=").append(language);
        sb.append(", database=").append(database);
        sb.append('}');
        return sb.toString();
    }
}
