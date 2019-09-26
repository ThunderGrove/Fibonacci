/*class fibonacci
{
    static int fib(int x)
    {
        if (x <= 1)
            return x;
        return fib(x-1) + fib(x-2);
    }

    public static void main (String args[])
    {
        int x = 15;
        System.out.println(fib(x));
    }
}

// Når int x = 0 er resultatet = 0
// Når int x = 5 er resultatet = 5  (som ellers vist på tavlen skulle give 15!!!)
// Når int x = 15 er resultatet 610 og afviger dermed fra testen
// Når int x < 0 er resultatet -1 indtil tallet er på 32 tegn så gives en fejl at tallet er for langt

*/

class Fibonacci {

    /*public static void main(String[] args){
        System.out.println(fibonacci(43));
    }*/

    public int fibonacci(int number){
        if(number<0){
            return -1;
        }

        int value = 0;
        int x = 0;
        int y = 0;

        for (int counter = 0; counter < number; counter++) {

            if (counter == 0) {
                value = 0;
            } else if (counter <= 2) {
                x = 1;
                y = 1;
                value = 1;
            } else {
                value = x + y;
                x = y;
                y = value;
            }
        }

        return value;
    }
}





