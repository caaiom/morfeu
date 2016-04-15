package br.com.morfeu.api.converter.generate;

import br.com.morfeu.api.model.Language;
import br.com.morfeu.api.model.generate.GenerateApiViewModel;
import br.com.morfeu.api.model.generate.GenerateApiServiceRequest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cmaia on 14/04/16
 */
public class GenerateApiServiceRequestConverterTest {
    private GenerateServiceRequestConverter converter;

    @Before
    public void setUp() {
        converter = new GenerateServiceRequestConverter();
    }

    @Test
    public void testConvertSuccess() throws Exception {
        GenerateApiViewModel viewModel = new GenerateApiViewModel();

        viewModel.setConnection("abc");
        viewModel.setLanguage(Language.JAVA);

        GenerateApiServiceRequest request = converter.convert(viewModel);
        assertEquals(request.getConnection(), viewModel.getConnection());
        assertEquals(request.getLanguage(), viewModel.getLanguage().toString());
    }
}