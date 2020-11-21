package RSA;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TryRSA {

    public static void main(String[] args) {
        RSA a=new RSA();
     long m=a.getCodeMassage(10);
     long c=a.getDecodeMassage(m);
       System.out.println(m+" "+c);
    }


}
