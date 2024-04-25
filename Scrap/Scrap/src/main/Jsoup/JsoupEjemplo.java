import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class JsoupEjemplo {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://www.disneyplus.com/es-es/home").get();

            String title = document.title();
            System.out.println("Título de la página: " + title);

            Elements links = document.select("src");

            System.out.println("Enlaces encontrados:");
            for (Element link : links) {
                String linkText = link.text();
                String linkHref = link.attr("href");
                System.out.println(linkText + " / " );
            }

        } catch (IOException e) {
            System.out.println("No se puede acceder");
        }
    }
}
