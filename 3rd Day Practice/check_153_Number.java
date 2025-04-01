
class Amstrong {

    public static void main(String args[]) {
        int number = 153;
        System.out.println("If Check  Number Armstrong OR NOT \n");
        int rem, sum = 0;
        int temp = number;
        while (number > 0) {
            rem = number % 10;
            sum = sum + (rem * rem * rem);
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println(temp + ":- number is armstrong");
        } else {
            System.out.println(temp + ":- number  is not armstrong");

        }

    }
}
