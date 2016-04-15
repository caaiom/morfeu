package br.com.morfeu.api.service.generate;

import br.com.morfeu.api.converter.generate.GenerateServiceRequestConverter;
import br.com.morfeu.api.exception.ServiceException;
import br.com.morfeu.api.model.generate.GenerateApiServiceRequest;
import br.com.morfeu.api.model.generate.GenerateApiViewModel;
import br.com.morfeu.api.model.generate.GenerateApiServiceResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by cmaia on 14/04/16
 */
@Service
public class GenerateApiService {

    @Value("${generate.service.url}")
    private String serviceUrl;

    public ResponseEntity<GenerateApiServiceResponse> generate(GenerateApiViewModel request) throws ServiceException {
        GenerateApiServiceRequest serviceRequest = new GenerateServiceRequestConverter().convert(request);

        try {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.postForEntity(serviceUrl, serviceRequest, GenerateApiServiceResponse.class);
        } catch(Exception e) {
            throw new ServiceException("Couldn't post to generate service.", e);
        }
    }
}
