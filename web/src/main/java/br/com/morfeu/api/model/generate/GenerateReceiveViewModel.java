package br.com.morfeu.api.model.generate;

import br.com.morfeu.api.model.Language;

import java.io.Serializable;

/**
 * Created by cmaia on 14/04/16
 */
public class GenerateReceiveViewModel implements Serializable {

    private static final long serialVersionUID = 3835054156564409733L;
    private String connection;
    private Language language;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenerateReceiveViewModel that = (GenerateReceiveViewModel) o;

        return connection != null ? connection.equals(that.connection) : that.connection == null && language == that.language;

    }

    @Override
    public int hashCode() {
        int result = connection != null ? connection.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GenerateReceiveViewModel{" +
                "connection='" + connection + '\'' +
                ", language=" + language +
                '}';
    }
}
