package DataProviders;

import org.testng.annotations.DataProvider;

public class StringParserDataProvider {

    @DataProvider
    public Object [][] DPforStringParser() {
        return new Object[][] {
                {"fas", "a", "fsa", "afs", "cat", "cta"},
                {"dog", "dgo", "odg", "gdo", "l"},
                {"test", "sett", "tets", "tset", "stet", "estet"}
        };
    }
}
