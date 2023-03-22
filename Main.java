import java.util.Scanner;

public class Main {

    //quicksort algoritması kullanılmıştır.
    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void quickSort(int A[],int p, int r)
    {
        int q;

        if(p<r)
        {
            q=partition(A,p, r);
            quickSort(A,p, q-1);
            quickSort(A,q+1, r);
        }

    }
    public static int partition(int A[],int p, int r){
        int tmp;
        int x = A[r];
        int i = p-1;

        for(int j=p; j<=r-1; j++)
        {
            if(A[j]<=x)
            {
                i++;
                tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
        }
        tmp=A[i+1];
        A[i+1]=A[r];
        A[r]=tmp;
        return i+1;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu n : ");
        int boyut=input.nextInt();
        int[] kullanıcıDizi= new int[boyut];
        for (int i=0;i<boyut;i++){
            System.out.println("Dizinin "+(i+1)+". elemanı : ");
            int eleman=input.nextInt();
            kullanıcıDizi[i]=eleman;
        }
        quickSort(kullanıcıDizi,0,kullanıcıDizi.length-1);
        System.out.print("Sıralama: ");
        printArray(kullanıcıDizi);

    }
}