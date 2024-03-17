package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // scannerでイベント会場の場所を入力してもらいます。
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter event place");
        String place = scanner.nextLine();

        // scannerで入力された場所がList内にある場合は true ない場合はfalse　を返します。
        List<String> eventPlace = List.of("tokyo", "osaka", "nara", "kyoto", "fukuoka");
        boolean hasPlace = eventPlace.stream().anyMatch(name -> name.equals(place));

        if (hasPlace) {
            System.out.println("There will be events held in " + place );
        }else {
            System.out.println("There are not events held in " + place );
        }
    }
}