package com.sda.exercises.terminal;

import java.util.Scanner;

public class Terminal {

    public Terminal() {
        private int number;
        private Scanner scanner;
    }

    public int work(){
        System.out.println("Podaj liczbę ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        this.number = parseInteger(input);
        Integer integer = Integer.getInteger(input);
        return integer;



    }
    private int parseInteger(String input) {
        Integer integer = Integer.getInteger(input);
        return integer;
    }
    private String writeOnTerminal(){
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";
        for (int i=0; i<number; i++){
            line += "*";
            line = line + "*";
        }
        return stringBuilder.toString();
    }
}
