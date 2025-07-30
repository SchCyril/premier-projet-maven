package dev;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException {
        String title = ResourceBundle.getBundle("application").getString("title");
        String asciiArt = FigletFont.convertOneLine(title);
        System.out.println(asciiArt);

        String environment = ResourceBundle.getBundle("application").getString("environment");
        System.out.println("Environment : " + environment);
    }
}