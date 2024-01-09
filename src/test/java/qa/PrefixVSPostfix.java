package qa;

public class PrefixVSPostfix {

    public static void main(String[] args) {

        testPostfix();
        testPrefix();

    }


    public static void testPostfix() {

        int x = 999;
        int y = x++;
        System.out.println(y);
        System.out.println(x);
        //999
        //1000
    }

    public static void testPrefix() {
        int x = 999;
        int y = ++x;
        System.out.println(y);
        System.out.println(x);
        //1000
        //1000
    }

}

