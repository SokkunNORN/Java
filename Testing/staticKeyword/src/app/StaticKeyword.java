package app;

class StaticKeyword {
    static int count = 0;
    public StaticKeyword(String a){
        count++;
        System.out.println(a + " " + count);
    };

// static block 
    static {
        System.out.println("This is a static block 1!");
    }

    static void hello() {
        System.out.println("I want to say something!");
    }
}





