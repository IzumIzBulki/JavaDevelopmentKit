package JDK_HomeWork#3.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       
        System.out.println("---Задание #1---------");
        GenericCollection<Integer> collection2 = new GenericCollection<>(Arrays.asList(10, 12, 13, 65));
        collection2.forEachPrint();

        System.out.println("\n---Задание #2---------");
        System.out.println(Calculator.sum(62.0, 56f));
        System.out.println(Calculator.multiply(62.0, 56));
        System.out.println(Calculator.divide(62.0, 56.0));
        System.out.println(Calculator.subtract(62, 56));

        System.out.println("\n---Задание #3---------");
        String[] strings1 = new String[]{"werwer", "werwerwr", "12"};
        String[] strings2 = new String[]{"654", "fhy", "12"};
        String[] strings3 = new String[]{"werwer", "werwerwr", "12"};
        Integer[] integers1 =new Integer[]{12,65,998,78};
        Integer[] integers2 =new Integer[]{12,65,998,78};
        ArrayComparator.compareNPrint(strings1,strings2);
        ArrayComparator.compareNPrint(strings1,strings3);
        ArrayComparator.compareNPrint(integers1,integers2);
    }
}
