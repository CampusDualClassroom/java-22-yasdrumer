package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> list = new ArrayList<>();
        list.add("GKFFD");
        list.add("TNANA");
        list.add("MPMSL");
        list.add("PSWME");
        list.add("LZMLF");
        list.add("JYEBV");
        list.add("YELNT");
        list.add("JSNKR");
        list.add("JFESF");
        list.add("TMJLL");
        return list;
    }


    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Elemento: " + i + " | Indice: " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();
        System.out.println("=== Lista inicial ===");
        printElementsAndIndex(myList);

        // Añadir nuevo elemento y volver a imprimir
        System.out.println("\nAñadiendo 'AAAAA': " + addElementToList(myList, "AAAAA"));
        System.out.println("\n=== Lista despues de añadir 'AAAAA' ===");
        printElementsAndIndex(myList);
    }


}
