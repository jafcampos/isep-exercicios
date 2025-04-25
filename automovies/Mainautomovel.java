package automovies;

import java.util.ArrayList;

public class Mainautomovel {
    public static void main(String[] args) {

        ArrayList<Automovel> list = new ArrayList<>();


        Automovel a1 = new Automovel("54-AB-45", "Toyota", 2023);
        list.add(a1);
        Automovel a2 = new Automovel("67-CD-89", "Honda", 1900);
        list.add(a2);
        Automovel a3 = new Automovel("78-EF-90", "Ford", 1500);
        list.add(a3);
        Automovel a4 = new Automovel("12-GH-34", "Chevrolet", 2500);
        list.add(a4);
        Automovel a5 = new Automovel("56-IJ-78", "Nissan", 1800);   
        list.add(a5);
        Automovel a6 = new Automovel("90-KL-12", "BMW", 3000);
        list.add(a6);
        
        for (int index = 0; index < list.size(); index++) {
            System.err.println(list.get(index).toString());
        }
        for (Automovel automovel : list) {
            System.out.println(automovel.toString());
        }
        Automovel a7 = new Automovel("13-NA-20", "Volkswagen", 2000);
        list.add(a7);

        if (list.contains(a7)) {
            System.out.println("Automovel added successfully: " + a7.toString());
        } else {
            System.out.println("Failed to add the Automovel.");
        }
        list.remove(3);

        System.out.println("After removal:");
        for (Automovel automovel : list) {
            System.out.println(automovel.toString());
        }
        list.add(0, a4);

        System.out.println("After adding back to the first position:");
        for (Automovel automovel : list) {
            System.out.println(automovel.toString());
        }
        Automovel a01 = new Automovel("99-ZZ-99", "Tesla", 2022);
        list.add(list.size() - 1, a01);

        System.out.println("After adding a01 to the penultimate position:");
        for (Automovel automovel : list) {
            System.out.println(automovel.toString());
        }
        if (list.contains(a6)) {
            int index = list.indexOf(a6);
            System.out.println("Automovel a6 is found at index: " + index);
        } else {
            System.out.println("Automovel a6 is not in the list.");
        }
        // Remove all Automoveis from the list
        list.clear();

        // First way to demonstrate the list is empty
        if (list.isEmpty()) {
            System.out.println("The list is empty (checked using isEmpty()).");
        } else {
            System.out.println("The list is not empty.");
        }

        // Second way to demonstrate the list is empty
        if (list.size() == 0) {
            System.out.println("The list is empty (checked using size()).");
        } else {
            System.out.println("The list is not empty.");
        }
    }
    
}
