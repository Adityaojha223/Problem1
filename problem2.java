public class problem2
{
     public static void main(String[] args) {

        int Num1 = 1;
        int Num2 = 2;
        int sum = 0;
        int temp = 0;

        do
        {
             if (Num2 % 2 == 0)
                sum = sum + Num2;
            temp = Num1 + Num2;
            Num1 = Num2;
            Num2 = temp;

           
        }
        while (Num2 < 4000000);

        System.out.println(sum);
    }
}