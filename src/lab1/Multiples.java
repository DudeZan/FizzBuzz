package lab1;

public class Multiples {
    static void main() {
        int count = 0;
        int i = 1;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }}
