public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(1);
        boolean flag = false;

        try {
            double a = 7/0;
            flag = true;
        }
        catch (ArithmeticException e){
            System.out.println("error: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("error: " + e.getMessage());
        }
        finally {
            if (flag){
                System.out.println(2);
            }else{
                System.out.println("3");
            }
        }


        System.out.println(5);
    }
}
