package br.com.morfeu.api.model.generate;

import java.io.Serializable;

/**
 * Created by cmaia on 14/04/16
 */
public class GenerateApiServiceResponse implements Serializable {
    private static final long serialVersionUID = 1690002795452431613L;

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
