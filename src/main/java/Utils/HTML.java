/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.Locale;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;

/**
 *
 * @author welin
 */
public final class HTML {
    private static final JsonbConfig jsonbConfig = new JsonbConfig()
            .withFormatting(true)
            .withDateFormat("dd/MM/yyyy",
                    Locale.forLanguageTag("pt_BR"))
            .withPropertyOrderStrategy(
                    PropertyOrderStrategy.LEXICOGRAPHICAL
            );

    public static String toJson(Object object) {
        return JsonbBuilder
                .create(jsonbConfig)
                .toJson(object);
    }

    public static String blocoRelatorioBuilder(String title, Object relatorio) {
        return "<h2>" + title + "</h2>"
                + "<style=\" font-size: 1.3em\"> " +
                "<summary style=\"cursor: pointer\"></summary> " +
                
                "<p><pre class=\"language-json\"> " + toJson(relatorio) + "</pre></p></details>";
    }
}