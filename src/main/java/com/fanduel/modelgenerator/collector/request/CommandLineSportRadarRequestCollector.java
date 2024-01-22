package com.fanduel.modelgenerator.collector.request;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Scanner;

public class CommandLineSportRadarRequestCollector extends SportRadarRequestCollector {

    private static final Map<String, String> urlMap = Map.ofEntries(
            Map.entry("Golf V3", "https://developer.sportradar.com/docs/read/golf/Golf_v3"),
            Map.entry("MLB V7", "https://developer.sportradar.com/docs/read/baseball/MLB_v7"),
            Map.entry("NBA V7", "https://developer.sportradar.com/docs/read/basketball/NBA_v7"),
            Map.entry("NBA V8", "https://developer.sportradar.com/docs/read/basketball/NBA_v8"),
            Map.entry("NFL V7", "https://developer.sportradar.com/docs/read/american_football/NFL_v7"),
            Map.entry("NHL V7", "https://developer.sportradar.com/docs/read/hockey/NHL_v7")
    );

    @Override
    protected String getSportRadarDocsUrl() {
        System.out.println("The following documentation URLs are here for your convenience:");
        System.out.println(urlMap.entrySet().toString().replaceAll(",\\s", System.lineSeparator())
                .replaceAll("\\[", ""));
        // ask for url for docs
        String url = null;
        while (url == null) {
            System.out.print("Enter SportRadar docs url or one of the keys (keys are not case-sensitive) for one mentioned above: ");
            Scanner scanner = new Scanner(System.in);
            final String enteredUrl = scanner.nextLine();
            url = urlMap.entrySet().stream()
                    .peek(System.out::println)
                    .filter(entry -> entry.getKey().equalsIgnoreCase(enteredUrl))
                    .peek(System.out::println)
                    .map(Map.Entry::getValue)
                    .peek(System.out::println)
                    .findFirst()
                    .orElseGet(() -> {
                        try {
                            return new URI(enteredUrl).toURL().toString();
                        } catch (URISyntaxException | MalformedURLException | IllegalArgumentException e) {
                            System.out.println(enteredUrl + " is not a valid URL.");
                        }
                        return null;
                    });
        }
        return url;
    }
}
