public class recursion {
    public static void main(String[] args) {
        recursionFunction(10);
        


        //call your recursion fuction
        //print result

    }

    public static void recursionFunction(int n) {

        if (n <= 0) {
            System.out.println("Countdown complete!");
        } else {
            System.out.println(n);
            recursionFunction(n - 1);
        }

    }
}