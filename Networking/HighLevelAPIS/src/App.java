import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            // absolute URI
            // URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");

            URI baseUri  = new URI("db://username:password@myserver.com:5000");

            // relative URI
            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=12345");

            URI resolvedUri1 = baseUri.resolve(uri1);
            URI resolvedUri2 = baseUri.resolve(uri2);
            URI resolvedUri3 = baseUri.resolve(uri3);

            // can change all these URL by changing only the baseURI
            System.out.println("URL 1 = " + resolvedUri1);
            System.out.println("URL 2 = " + resolvedUri2);
            System.out.println("URL 3 = " + resolvedUri3);

            URI relativizedURI = baseUri.relativize(resolvedUri2);
            System.out.println("Relative URI = " + relativizedURI);


            // URI uri = new URI("hello");

            // URL newUrl = new URL("http://example.org");

            // URI uri = newUrl.toURI();
            // URLConnection urlConnection = newUrl.openConnection();

            // a URI can consist of 9 parts:
            // System.out.println("Scheme = " + uri.getScheme());
            // System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
            // System.out.println("Authority = " + uri.getAuthority());
            // System.out.println("User info = " + uri.getUserInfo());
            // System.out.println("Host = " + uri.getHost());
            // System.out.println("Port = " + uri.getPort());
            // System.out.println("Path = " + uri.getPath());
            // System.out.println("Query = " + uri.getQuery());
            // System.out.println("Fragment = " + uri.getFragment());

            // urlConnection.setDoOutput(true);
            // urlConnection.connect();

            // BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            // shows the HTML content of the webpage
            // String line = "";
            // while (line != null) {
            //     line = inputStream.readLine();
            //     System.out.println(line);
            // }
            // inputStream.close();

            // prints out the headers of the web page
            // Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
            // for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            //     String key = entry.getKey();
            //     List<String> value = entry.getValue();   
            //     System.out.println("-----key = " + key);             
            //     for(String string: value ) {
            //         System.out.println("value = " + value);
            //     }
            // }

            // httpUrlConnection is a subclass of URLConnection which contains support for
            // HTTP
            // browser sends a GET request and receives response code
            URL newUrl = new URL("https://api.flicker.com/services/feeds/photos_public.gne?tags=dogs");

            HttpURLConnection connection = (HttpURLConnection) newUrl.openConnection();
            connection.setRequestMethod("GET"); // GET is the default request method
            connection.setRequestProperty("User-Agent", "Chrome");
            // connection.setReadTimeout(30000);
            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if (responseCode != 200) {
                System.out.println("Error reading web page");
                System.out.println(connection.getResponseMessage());
            }


            BufferedReader inputReader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));

            // shows the HTML content of the webpage
            String line;
            while((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }
            inputReader.close();



            // URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");

            // URL has to be absolsute so cannot convert from a relative URI, has to be absolute also
            // conversion would work with the relative URI above as it has been resolved to a base URI
            // URL url = uri.toURL();
            // System.out.println("URL = " + url);



        }
        catch (URISyntaxException e) {
            System.out.println("URI Bad syntax " + e.getMessage());
        } catch(MalformedURLException e ) {
            System.out.println("URL Malformed: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
