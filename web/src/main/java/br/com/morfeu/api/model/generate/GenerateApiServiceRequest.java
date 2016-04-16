package br.com.morfeu.api.model.generate;

import java.io.Serializable;

/**
 * Created by cmaia on 14/04/16
 */
public class GenerateApiServiceRequest implements Serializable {

    private static final long serialVersionUID = 5744427260052016065L;

    private String connection;
    private String language;
    private String database;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
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

        GenerateApiServiceRequest that = (GenerateApiServiceRequest) o;

        if(connection != null ? !connection.equals(that.connection) : that.connection != null) {
            return false;
        }
        if(language != null ? !language.equals(that.language) : that.language != null) {
            return false;
        }
        return database != null ? database.equals(that.database) : that.database == null;
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
        final StringBuilder sb = new StringBuilder("GenerateApiServiceRequest{");
        sb.append("connection='").append(connection).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", database='").append(database).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
