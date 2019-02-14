class Main {
    public static void main(String[] args) {
        ClassLoader mMain = Main.class.getClassLoader();
        log(mMain);
        
        log(String.class.getClassLoader());
    }

    private static void log (Object message) {
        System.out.println(message);
    }
}