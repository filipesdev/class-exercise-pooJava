package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // instanciando Lista
        List<String> list = new ArrayList<>();

        // adicionando elementos na list
        list.add("Maria Eduarda");
        list.add("Filipe");
        list.add("Emanuelle");
        list.add("Rafaela");
        list.add(0, "Ana Júlia");

        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------------------------------");

        // removendo elementos da lista
        // list.remove(1);

        list.removeIf(x -> x.charAt(0) == 'F'); // remoção por predicado
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------------------------------");

        // procurando o indice
        System.out.println("Index of Emanuelle: " + list.indexOf("Emanuelle"));
        System.out.println("Index of Filipe: " + list.indexOf("Filipe")); // procurando o indice de algum elemento que não tem na lista ele retorna -1
        System.out.println("-------------------------------------------------");

        // pegando a lista  e filtrando somente os elementos que começam com a letra 'A' e devolver uma nova lista com esses elementos
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------------------------------------------");
        // procurando na lista o primeiro elemento que começa com a letra 'A', se não existir ele retorna null
        String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
        System.out.println(name);

    }
}