package UI;

import Domain.AlphaVantageConnector;
import Domain.ForeignExchange;
import Domain.output.AlphaVantageException;
import Domain.output.exchange.CurrencyExchange;
import Domain.output.exchange.data.CurrencyExchangeData;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;


public class App {
    public static void createLogFile() throws FileNotFoundException {
//     This is for on a Mac (~/Desktop = /Users/luisarendsanchez/Desktop)

       /*PrintStream o = new PrintStream(new FileOutputStream("/Users/luisarendsanchez/Desktop/Spoon DS/logTest/a.txt", true));
       System.setOut(o);
       */

//     This is for the Unix based OS
       PrintStream Pi = new PrintStream(new FileOutputStream("~/Desktop/logTest/a.txt", true));
       System.setOut(Pi);

        String apiKey = "89HPIWEIMKSVS0TW";
        int timeout = 3000;
        AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);
        ForeignExchange foreignExchange = new ForeignExchange(apiConnector);

        try {
        CurrencyExchange currencyExchange = foreignExchange.currencyExchangeRate("EUR", "GBP");
        CurrencyExchangeData currencyExchangeData = currencyExchange.getData();

            String result =
                    LocalDateTime.now() +
                            " | from currency code: " + currencyExchangeData.getFromCurrencyCode() +
                            " | from currency name: " + currencyExchangeData.getFromCurrencyName() +
                            " | to currency code:   " + currencyExchangeData.getToCurrencyCode() +
                            " | to currency name:   " + currencyExchangeData.getToCurrencyName() +
                            " | exchange rate:      " + currencyExchangeData.getExchangeRate() +
                            " | last refresh:       " + currencyExchangeData.getTime() +
                            "\n";

            System.out.println(result);
        } catch (AlphaVantageException e) {
            System.out.println("The maximum amount of Server polling has been achieved (5/minute or 500/day)");
        }
    }
}



//        try {
//            CurrencyExchange currencyExchange = foreignExchange.currencyExchangeRate("EUR", "USD");
//            CurrencyExchangeData currencyExchangeData = currencyExchange.getData();
//
//            System.out.println("--------------------------------------------------------------------");
//            System.out.println("from currency code: " + currencyExchangeData.getFromCurrencyCode());
//            System.out.println("from currency name: " + currencyExchangeData.getFromCurrencyName());
//            System.out.println("to currency code:   " + currencyExchangeData.getToCurrencyCode());
//            System.out.println("to currency name:   " + currencyExchangeData.getToCurrencyName());
//            System.out.println("exchange rate:      " + currencyExchangeData.getExchangeRate());
//            System.out.println("last refresh:       " + currencyExchangeData.getTime());
//        } catch (AlphaVantageException e) {
//            System.out.println("something went wrong");
//        }
//        try {
//            CurrencyExchange currencyExchange = foreignExchange.currencyExchangeRate("GBP", "USD");
//            CurrencyExchangeData currencyExchangeData = currencyExchange.getData();
//
//            System.out.println("--------------------------------------------------------------------");
//            System.out.println("from currency code: " + currencyExchangeData.getFromCurrencyCode());
//            System.out.println("from currency name: " + currencyExchangeData.getFromCurrencyName());
//            System.out.println("to currency code:   " + currencyExchangeData.getToCurrencyCode());
//            System.out.println("to currency name:   " + currencyExchangeData.getToCurrencyName());
//            System.out.println("exchange rate:      " + currencyExchangeData.getExchangeRate());
//            System.out.println("last refresh:       " + currencyExchangeData.getTime());
//        } catch (AlphaVantageException e) {
//            System.out.println("something went wrong");
//        }
//    }
//}