package task5;

public class Task5 {
    public static void main(String[] args) {
        int start = 10, end = 500, conceived;

        conceived = start + (int) (end * Math.random());

        if (conceived > 25 && conceived <200) System.out.println("Число " + conceived + " содержится в интервале (25; 200)");
        else System.out.println("Число " + conceived + " не содержится в интервале (25; 200)");
    }

}
