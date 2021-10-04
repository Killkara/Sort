import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private int[] iDNumber;

    Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод кол-ва итераций");
        int n = in.nextInt();
        System.out.println();
        iDNumber=new int[n];
        for (int i = 0; i < n; i++)
            iDNumber[i] = in.nextInt();
    }

    public void Sort() {
        for (int i = 0; i < iDNumber.length; i++) {
            for (int j = i; j < iDNumber.length; j++) {
                if (iDNumber[i] > iDNumber[j]) {
                    int a = iDNumber[i];
                    iDNumber[i] = iDNumber[j];
                    iDNumber[j] = a;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + Arrays.toString(iDNumber) +
                '}';
    }

    public static void main(String[] args) {
        Student a=new Student();
        a.Sort();
        System.out.println(a);
    }
}