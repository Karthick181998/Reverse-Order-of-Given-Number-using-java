import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number reverse number");
        int no = sc.nextInt();
        int reverse=0;
       while(no!=0){
           int rem=no%10;
           reverse=(reverse*10)+rem;
           no=no/10;
       }
        System.out.println("Given the number reverse order is= "+reverse);
    }
}
