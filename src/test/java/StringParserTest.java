import DataProviders.StringParserDataProvider;
import org.testng.annotations.Test;

public class StringParserTest {

    StringParser stringParser;

    StringParserTest() {
        stringParser = new StringParser();
    }

    @Test(dataProvider = "DPforStringParser", dataProviderClass = StringParserDataProvider.class)
    public void StringParsingTest(String[] input) {
        stringParser.StringParser(input);
    }
}
