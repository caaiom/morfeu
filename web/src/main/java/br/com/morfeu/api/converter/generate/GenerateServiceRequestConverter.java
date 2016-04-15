package br.com.morfeu.api.converter.generate;

import br.com.morfeu.api.model.generate.GenerateReceiveViewModel;
import br.com.morfeu.api.model.generate.GenerateServiceRequest;

/**
 * Created by cmaia on 14/04/16
 */
public class GenerateServiceRequestConverter {

    public GenerateServiceRequest convert(GenerateReceiveViewModel generateReceiveViewModel) {
        GenerateServiceRequest generateServiceRequest = new GenerateServiceRequest();

        generateServiceRequest.setConnection(generateReceiveViewModel.getConnection());
        generateServiceRequest.setLanguage(generateReceiveViewModel.getLanguage().toString().toLowerCase());

        return generateServiceRequest;
    }
}
