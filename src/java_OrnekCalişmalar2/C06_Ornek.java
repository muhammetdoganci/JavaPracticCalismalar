package java_OrnekCalişmalar2;

import java.util.Arrays;
import java.util.Scanner;

import static day8_practice.Q04_HackerLanguage.hackerDili;

public class C06_Ornek {
    public static void main(String[] args) {


        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
        //    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        //    s -> 5
        //    a -> 4
        //    e -> 3
        //    i -> 1
        //    o -> 0
        //    Test data
        //    hackerDili("java ile hersey guzel")
        //    j4v4 1l3 h3r53y guz3l
        //    İpucu harfleri değiştirin ve ekrana yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir cumle giriniz : ");
        String cumle=scan.nextLine().toLowerCase();

        hackerDilli(cumle);
    }

    public static void hackerDilli(String cumle) {
        String[] arr = new String[cumle.length()];
        for (int i = 0; i <cumle.length() ; i++) {
            arr[i]=cumle.substring(i,i+1);
             if (arr[i].contains("s")){
                 arr[i]="5";
             }if (arr[i].contains("a")) {
                arr[i] = "4";
            }if (arr[i].contains("e")) {
                arr[i] = "3";
            }if (arr[i].contains("i")) {
                arr[i] = "1";
            }if (arr[i].contains("o")) {
                arr[i] = "0";
            }
            System.out.print(arr[i]);
        }


    }

}
