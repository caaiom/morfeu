package br.com.morfeu.api.converter.generate;

import br.com.morfeu.api.model.generate.GenerateApiServiceRequest;
import br.com.morfeu.api.model.generate.GenerateApiViewModel;

/**
 * Created by cmaia on 14/04/16
 */
public class GenerateServiceRequestConverter {

    public GenerateApiServiceRequest convert(GenerateApiViewModel generateApiViewModel) {
        GenerateApiServiceRequest generateApiServiceRequest = new GenerateApiServiceRequest();

        generateApiServiceRequest.setConnection(generateApiViewModel.getConnection());
        generateApiServiceRequest.setLanguage(generateApiViewModel.getLanguage().toString().toLowerCase());

        return generateApiServiceRequest;
    }
}
