////Если необходимо, исправьте данный код
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }


public class task2 {
    public static void main(String[] args) {
        int[] intArray = new int[9];
        int d = 0;
        if (d == 0) {

            System.out.println("Catching exception: деление на 0");

        } else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }


//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
////    } catch(ArithmeticException e){
////        System.out.println("Catching exception: " + e);
//    }
    }
}
