import java.util.Scanner;

public class palindromseries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=input.next();
        boolean ispalindrome=true;


        int i=0;
        int j=str.length()-1;
        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)) {
                ispalindrome=false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(ispalindrome);

    }

}

