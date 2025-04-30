package Vista;

import Model.Jugador;

import java.util.Iterator;

public class ImprimirCarton {

    String[] corners = {"╔", "╗", "╚", "╝"};
    String[] walls = {"════", "║"};
    String[] separators = {"╦", "╩", "╠", "╣", "╬"};

    public void printBoard(String[][] results) {
        constructTopLine(results[0].length);
        for (int i = 0; i < results.length; i++) {
            constructValuesLine(results[i]);
            if (i != results.length - 1) {
                constructSeparatorLine(results[0].length);
            }
        }
        constructBottomLine(results[0].length);
    }

    public void printBoard(Jugador jugador) {
        String[][] results = jugador.getCarton().getBoard();
        System.out.println(jugador.getName());
        constructTopLine(results[0].length);
        for (int i = 0; i < results.length; i++) {
            constructValuesLine(results[i]);
            if (i != results.length - 1) {
                constructSeparatorLine(results[0].length);
            }
        }
        constructBottomLine(results[0].length);
    }


    public void constructTopLine(int size) {
        String topLine = "";

        topLine = topLine.concat(corners[0]);

        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                topLine = topLine.concat(walls[0] + separators[0]);
            } else {
                topLine = topLine.concat(walls[0]);
            }
        }

        topLine = topLine.concat(corners[1]);
        System.out.println(topLine);
    }

    public void constructValuesLine(String[] values) {
        String valuesLine = "";
        valuesLine = valuesLine.concat(walls[1]);
        for (String value : values) {
            valuesLine = valuesLine.concat(" " + formatValue(value) + " " + walls[1]);
        }
        System.out.println(valuesLine);
    }

    public void constructBottomLine(int size) {
        String bottomLine = "";
        bottomLine = bottomLine.concat(corners[2]);
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                bottomLine = bottomLine.concat(walls[0] + separators[1]);
            } else {
                bottomLine = bottomLine.concat(walls[0]);
            }
        }

        bottomLine = bottomLine.concat(corners[3]);
        System.out.println(bottomLine);
    }

    public void constructSeparatorLine(int size) {
        String separatorLine = "";
        separatorLine = separatorLine.concat(separators[2]);
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                separatorLine = separatorLine.concat(walls[0] + separators[4]);
            } else {
                separatorLine = separatorLine.concat(walls[0]);
            }
        }

        separatorLine = separatorLine.concat(separators[3]);
        System.out.println(separatorLine);
    }

    public String formatValue(String value) {
        if (value.length() == 1) {
            if (value.equals("X")) {
                value = " " + value;
            } else {
                value = "0" + value;
            }
        }
        return value;
    }
}
