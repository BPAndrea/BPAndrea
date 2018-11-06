import java.util.Arrays;

public class UrlFixer {
    public static void main(String[] args) {
        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        //:

        String url = "https//www.reddit.com/r/nevertellmethebots";
        String urlRepl = url.replace("bots", "odds");
        String urlFixed = urlRepl.substring(0, 5) + ":" + urlRepl.substring(5, urlRepl.length());

        System.out.println(urlFixed);


    }
}
