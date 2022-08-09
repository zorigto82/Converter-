package ru.netology.graphics.image;

public class Schema implements TextColorSchema {
    @Override
    public char convert(int color) {
        if (color <= 255 && color > 216) {
            return ':';
        } else if (color <= 216 && color > 180) {
            return '-';
        } else if (color <= 180 && color > 144) {
            return '*';
        } else if (color <= 144 && color > 108) {
            return '=';
        } else if (color <= 108 && color > 72) {
            return '#';
        } else if (color <= 72 && color > 36) {
            return '%';
        } else if (color <=36 && color > 0) {
            return '@';
        }
        return convert(color);

    }
}
