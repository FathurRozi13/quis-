import java.util.Scanner;
public class Bangundatar {
    public static void main(String[] args) {
        int pilih=0;
        int pil=0;
        double hasil=0;
        int a=0;
        int b=0;
        int c=0;
        float phi=3.14f;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("    Bangun Datar  ");
        System.out.println("====================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("====================");
        
        System.out.print("Masukkan pilihan anda: ");
        pilih=input.nextInt();
        
        switch(pilih){
            case 1 :
                System.out.println("Menghitung Bangun Datar Persegi ");
                System.out.println("1. Luas Persegi");
                System.out.println("2. Keliling Persegi ");
                System.out.println(" ");
                System.out.print("Masukkan pilihan anda: ");
                pil=input.nextInt();
                if(pil==1){
                    System.out.println("Luas Bangun Datar Persegi");
                    System.out.println("=========================");
                    System.out.print("Masukkan sisi: ");
                    a= input.nextInt();
                    hasil= a*a;
                    System.out.println("Jadi luas persegi adalah: "+hasil);
                    break;
                }
                else if(pil==2){
                    System.out.println("Keliling Bangun Datar Persegi");
                    System.out.println("=============================");
                    System.out.print("Masukkan sisi: ");
                    a= input.nextInt();
                    hasil= 4*a;
                    System.out.println("Jadi keliling persegi adalah: "+hasil);
                    break;
                }
            case 2 :
                System.out.println("Menghitung Bangun Datar Persegi Panjang ");
                System.out.println("1. Luas Persegi Panjang");
                System.out.println("2. Keliling Persegi Panjang ");
                System.out.println(" ");
                System.out.print("Masukkan pilihan anda: ");
                pil=input.nextInt();
                if(pil==1){
                    System.out.println("Luas Bangun Datar Persegi Panjang");
                    System.out.println("=================================");
                    System.out.print("Masukkan panjang: ");
                    a= input.nextInt();
                    System.out.print("Masukkan lebar: ");
                    b= input.nextInt();
                    hasil= a*b;
                    System.out.println("Jadi luas persegi panjang adalah: "+hasil);
                    break;
                }
                else if(pil==2){
                    System.out.println("Keliling Bangun Datar Persegi Panjang");
                    System.out.println("=====================================");
                    System.out.print("Masukkan panjang: ");
                    a= input.nextInt();
                    System.out.print("Masukkan lebar: ");
                    b= input.nextInt();
                    hasil= 2*(a+b);
                    System.out.println("Jadi keliling persegi panjang adalah: "+hasil);
                    break;
                }
            case 3 :
                System.out.println("Menghitung Bangun Datar Segitiga ");
                System.out.println("1. Luas Segitiga");
                System.out.println("2. Keliling Segitiga ");
                System.out.println(" ");
                System.out.print("Masukkan pilihan anda: ");
                pil=input.nextInt();
                if(pil==1){
                    System.out.println("Luas Bangun Datar Segitiga");
                    System.out.println("=================================");
                    System.out.print("Masukkan alas: ");
                    a= input.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    b= input.nextInt();
                    hasil= a*b/2;
                    System.out.println("Jadi luas segitiga adalah: "+hasil);
                    break;
                }
                else if(pil==2){
                    System.out.println("Keliling Bangun Datar Segitiga");
                    System.out.println("=====================================");
                    System.out.print("Masukkan a: ");
                    a= input.nextInt();
                    System.out.print("Masukkan b: ");
                    b= input.nextInt();
                    System.out.print("Masukkan c: ");
                    c= input.nextInt();
                    hasil= a+b+c;
                    System.out.println("Jadi keliling segitiga adalah: "+hasil);
                    break;
                }
            case 4 :
                System.out.println("Menghitung Bangun Datar Lingkaran ");
                System.out.println("1. Keliling Persegi Lingkaran");
                System.out.println("2. Luas Persegi Lingkaran ");
                System.out.println(" ");
                System.out.print("Masukkan pilihan anda: ");
                pil=input.nextInt();
                if(pil==1){
                    System.out.println("Luas Bangun Datar Lingkaran");
                    System.out.println("=================================");
                    System.out.print("Masukkan jari-jari: ");
                    a= input.nextInt();
                    hasil= phi*a*a;
                    System.out.println("Jadi luas lingkaran adalah: "+hasil);
                    break;
                }
                else if(pil==2){
                    System.out.println("Keliling Bangun Datar Lingkaran");
                    System.out.println("=====================================");
                    System.out.print("Masukkan jari-jari: ");
                    a= input.nextInt();
                    hasil= 2*phi*a;
                    System.out.println("Jadi keliling lingkaran adalah: "+hasil);
                    break;
                }
            default:
                System.out.println("Masukan anda salah !!");
        }
            
    }
}