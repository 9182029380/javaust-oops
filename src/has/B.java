package has;

class B {
    // Overloading by changing the number of parameters
    private static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Overloading by changing the data type of parameters
//    private static void display(int a) {
//        System.out.println("Got Integer data.");
//    }

//    private static void display(String a) {
//        System.out.println("Got String object.");

        public static void main(String[]args){
            display(1);
            display(1, 4);

        }
    }
