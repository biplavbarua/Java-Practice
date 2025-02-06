import java.util.*;
public class Iterating_1D_Array {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("The elements of the array: ");
        for(int i=0; i<size; i++)
        {
            System.out.println(array[i]+" ");
        }
        s.close();
    }
}