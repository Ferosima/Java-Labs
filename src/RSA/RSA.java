package RSA;

import java.util.Random;

public class RSA {
    public long[] key;
    public long[] _key;
    public String massage;

    public long[] getPublicKey() {
        return key;
    }

    RSA() {
        createKeys(1);
    }

    private int GCD(long n1, long n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    private long getGeneratedNumber(int length) {
        Random r = new Random();
        long number = 2;
        for (int i = 0; i < length; i++) {
            int rand = r.nextInt(10);
            number += Math.pow(10, i) * rand;
        }
        return number;
    }
    private long getGeneratedNumber(long length) {
        Random r = new Random();
        return r.nextInt((int) length);
    }

    public void createKeys(int length) {
        long p, q, n, fn, e, d;
        //set p and q
        while (true) {
            p = getGeneratedNumber(length);
            q = getGeneratedNumber(length);
            if(p-1==q|| q-1==p||p>q){
                continue;
            }
            if (GCD(p, q) == 1)
                break;
        }
        p = 3;
        q = 11;

        //set n,fn,e
        n = p * q;
        fn = (p - 1) * (q - 1);
        e = 1;
        while (true) {
//            if (1 < e && e < fn && GCD(e, fn) == 1)
            if((e*p)%fn==1) {
                break;
            }
            else {
                e++;
            }
            System.out.println(e);
        }
        while (true) {
            d = getGeneratedNumber(length);
            if (((d * e) % fn) == 1)
                break;
        }
        System.out.println("p : " + p + " d : " + q);
        System.out.println("n : " + n + " fn : " + fn + " e : " + e);
        System.out.println("d : " + d);
        //set keys
        key = new long[]{e, n};
        _key = new long[]{d, n};
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public long getCodeMassage(long m) {
        System.out.println("m: " + m + " key " + key[0] + " " + key[1] + " " + (59 * 11) % 12);
        System.out.println("mpow: " + Math.pow(m, key[0]) + " " + Math.pow(m, key[0]) % key[1]);
        System.out.println('S' + 5 % 2);
        return (long) (Math.pow(m, key[0]) % key[1]);
    }

    public long getDecodeMassage(long c) {
        System.out.println("c: " + c + " key " + _key[0] + " " + _key[1]);
        System.out.println("cpow: " + Math.pow(c, _key[0]));
        return (long) (Math.pow(c, _key[0]) % _key[1]);
    }
}

