package br.com.morfeu.api.converter.generate;

import static org.junit.Assert.assertEquals;

import br.com.morfeu.api.model.Database;
import br.com.morfeu.api.model.Language;
import br.com.morfeu.api.model.generate.GenerateApiServiceRequest;
import br.com.morfeu.api.model.generate.GenerateApiViewModel;
import org.junit.Before;
import org.junit.Test;

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
        //given
        GenerateApiViewModel viewModel = new GenerateApiViewModel();
        viewModel.setConnection("abc");
        viewModel.setLanguage(Language.JAVA);
        viewModel.setDatabase(Database.MYSQL);

        //when
        GenerateApiServiceRequest request = converter.convert(viewModel);

        //then
        assertEquals(request.getConnection(), viewModel.getConnection());
        assertEquals(request.getLanguage(), viewModel.getLanguage().name());
        assertEquals(request.getDatabase(), viewModel.getDatabase().name());
    }
}