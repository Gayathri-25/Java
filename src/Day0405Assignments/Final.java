package Day0405Assignments;
final class Final {
    final void finalMethod() {
<<<<<<< HEAD
        final int code = 234;
=======
        final int code = 9856;
>>>>>>> origin/master
        System.out.println("The code is: " + code);
    }

    public static void main(String[] args) {
        Final obj = new Final();
        obj.finalMethod();
    }
}
