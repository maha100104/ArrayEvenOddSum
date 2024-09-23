import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EvenOddSorting {
    public static void evenOddsorting(int N, int arr[]) {
        int sum=0;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if(i%2==0)
            {
                even.add(arr[i]);
            }
            else
            {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int eve = even.get(even.size()-2);
        int od  = odd.get(odd.size()-2);
        System.out.println(eve+od);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        evenOddsorting(N,arr);
    }
}
/*
output;
Size = 5
Elements = 3 4 1 7 9
sum = 7*/
