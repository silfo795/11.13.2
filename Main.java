import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int counter=1;
        System.out.printf("N 10*N 100*N 1000*N\n");
        while(counter<=n)
        {
            System.out.printf("%d %d %d %d\n",counter,counter*10,counter*100,counter*1000);
            counter=counter+1;
        }
    }
}
