import java.util.Scanner;

public class test {


    public static void first(int a) {
        if (a>7)
        {
                System.out.println("Привет");
        }
    }
    public static void second(Scanner a) {
        String userInput = a.next();
        if (userInput.equals("Вячеслав"))
        {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
    public static void third()  {
        int[] a=new int[10];
        Scanner scr=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            a[i]=scr.nextInt();
        }
        for (int j : a) {
            System.out.println(j);
        }
    }
}
