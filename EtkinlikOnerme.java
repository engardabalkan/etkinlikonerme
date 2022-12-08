import java.util.Scanner;

public class EtkinlikOnerme{
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz:");
        heat = input.nextInt();

        if (heat > 5) {
            if (heat<15){
                System.out.println("Sinemaya gidebilirsin.");
                if (heat>10){
                    System.out.println("Pikniğe gidebilirsin.");
                }
                
            } else if (heat<25) {
                System.out.println("Pikniğe gidebilirsin.");

            }else {
                System.out.println("Yüzmeye gidebilirsin.");
            }

        }else {
            System.out.println("Kayağa gidebilirsin.");
        }
    }
}