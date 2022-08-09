package ru.netology.graphics;


import ru.netology.graphics.image.Converter;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter();// Создайте тут объект вашего класса конвертера
        //converter.setMaxRatio(2);
        //converter.setMaxWidth(100);
        //converter.setMaxHeight(50);


        GServer server = new GServer(converter);// Создаём объект сервера
        server.start(); // Запускаем

        // Или то же, но с выводом на экран:;
        //String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        //String imgTxt = converter.convert(url);
        //System.out.println(imgTxt);
    }
}
