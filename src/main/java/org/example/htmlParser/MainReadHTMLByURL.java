package org.example.htmlParser;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class MainReadHTMLByURL {
    public static void main(String[] args) throws IOException { 

        try {
            URL url = new URL("https://kpfu.ru/Michael.Abramsky");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

            int r = connection.getResponseCode();

            System.out.println(r);

            // Берем ссылку на входной поток, через который получаем данные
            InputStream is = connection.getInputStream();

            FileOutputStream fos = new FileOutputStream("abramsky.html");

            is.transferTo(fos);

            fos.flush();

            is.close();
            fos.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        InputStreamReader isr = new InputStreamReader(new FileInputStream("abramsky.html"),"windows-1251");
        BufferedReader reader = new BufferedReader(isr);
        String line = reader.readLine();
        while (line != null) {
            if (line.contains("<div class=\"top_menu_div_in\"><span>")){
                System.out.println(line.replaceAll("\\<.*?>", ""));
            }
            if (line.contains("<div style=\"font-weight:bold;width:420px;margin-bottom:2px;\">")){
                System.out.println(line.replaceAll("\\<.*?>", ""));
            }
            if (line.contains("<li class=\"li_spec\">") && line.contains("образование")){
                //System.out.println(line);
                System.out.println(line.replaceAll("\\<.*?>", ""));
            }
            if (line.contains("<li class=\"li_spec\">") && line.contains("</li>")){
                System.out.println(line.replaceAll("\\<.*?>", ""));
            }
            if (line.contains("<tr><td style=\"width: 100px;text-align:right;\"><b>")){
                System.out.println(line.replaceAll("\\<.*?>", ""));
            }
            line = reader.readLine();
        }
    }
}
