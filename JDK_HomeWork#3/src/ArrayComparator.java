package JDK_HomeWork#3.src;

import java.util.Arrays;

public class ArrayComparator {
    public static  <T> boolean compare(T[] a, T[] b) {
       return Arrays.equals(a, b);
    }
    public static  <T> void compareNPrint(T[] a, T[] b){
        System.out.println(print(a,b)+" -> "+compare2(a,b));
    }
    public static  <T> boolean compare2(T[] a, T[] b) {
        if (a.length!=b.length)return false;
        for (int i = 0; i < a.length; i++)
            if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static <T> String print(T[] a, T[] b) {
        StringBuilder sb = new StringBuilder("* ");
        for (int i = 0; i < a.length; i++)
            sb.append(a[i]).append(" |");
        sb.append(" - ");
        for (int i = 0; i < b.length; i++)
            sb.append(b[i]).append(" |");
        return sb.toString();
    }
}
