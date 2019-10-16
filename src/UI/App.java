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
    public static void createLogFile(String currencyFrom, String currencyTo) throws FileNotFoundException{

       PrintStream Pi = new PrintStream(new FileOutputStream("varOutput", true));
       System.setOut(Pi);


       // String apiKey = "89HPIWEIMKSVS0TW";
        String apiKey = "NN1UVZE1B2K3V0YH";
        int timeout = 3000;
        AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);
        ForeignExchange foreignExchange = new ForeignExchange(apiConnector);

        try {
        CurrencyExchange currencyExchange = foreignExchange.currencyExchangeRate(currencyFrom, currencyTo);
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
            System.out.println("ERROR: The maximum amount of Server polling has been achieved (5/minute or 500/day)"+"\n");
        }
    }
}