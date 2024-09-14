import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner inp1=new Scanner(System.in);
        try {
            test.first(inp1.nextInt());
        }
        catch (Exception e)
        {
            System.out.println("Введите число");
        }
        Scanner inp2=new Scanner(System.in);
        try {
            test.second(inp2);
        }
        catch (Exception e)
        {
            System.out.println("Ошибка!");
        }
        try {
            test.third();
        }
        catch (Exception e)
        {
            System.out.println("Ошибка!");
        }
    }
}

