package Day0405Assignments;
final class Final {
    final void finalMethod() {
        final int code = 234;
        System.out.println("The code is: " + code);
    }

    public static void main(String[] args) {
        Final obj = new Final();
        obj.finalMethod();
    }
}
