package qa;

public class SoutTests {
    public static void main(String[] args) {
        String a = "I love JAVA";
        String b = "I love Python";
        String c;

        switch (a) {
            case "I_love_JAVA":
                c = a + b;
                break;
            case "i love python":
                c = b + a;
                break;
            case "i love JAVA":
                c = b + b;
                break;
            default:
                c = a + a;
                System.out.println(c);
                //I love JAVAI love JAVA


                for (int i = 10; i < 20; i += 2) {
                    if (i > 15)
                        break;
                    if (i % 4 == 0)
                        continue;
                    System.out.println(i);
                    //10
                    //14
                }

        }}}