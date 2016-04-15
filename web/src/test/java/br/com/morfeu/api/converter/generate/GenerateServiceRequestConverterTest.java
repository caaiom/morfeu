package br.com.morfeu.api.converter.generate;

import br.com.morfeu.api.model.Language;
import br.com.morfeu.api.model.generate.GenerateReceiveViewModel;
import br.com.morfeu.api.model.generate.GenerateServiceRequest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cmaia on 14/04/16
 */
public class GenerateServiceRequestConverterTest {
    private GenerateServiceRequestConverter converter;

    @Before
    public void setUp() {
        converter = new GenerateServiceRequestConverter();
    }

    @Test
    public void testConvertSuccess() throws Exception {
        GenerateReceiveViewModel viewModel = new GenerateReceiveViewModel();

        viewModel.setConnection("abc");
        viewModel.setLanguage(Language.JAVA);

        GenerateServiceRequest request = converter.convert(viewModel);
        assertEquals(request.getConnection(), viewModel.getConnection());
        assertEquals(request.getLanguage(), viewModel.getLanguage().toString());
    }
}