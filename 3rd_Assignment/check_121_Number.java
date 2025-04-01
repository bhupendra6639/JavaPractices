
class Pallindrome {

    public static void main(String args[]) {

        int number = 121;
        System.out.println("If Check  Number Pallindrome OR NOT \n");
        int rem, rev = 0;
        int temp = number;
        while (number > 0) {
            rem = number % 10;
            rev = rev * 10 + rem;//
            number = number / 10;
        }
        if (rev == temp) {
            System.out.println(temp + ":- number is Pallindrome");
        } else {
            System.out.println(temp + ":- number  is not Pallindroe");

        }

    }
}
