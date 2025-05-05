public class CommandLineArgument {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Enter The Values:- ");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            int length = 10;

            if (args.length >= 2) {
                length = Integer.parseInt(args[1]);
            }
            System.out.println(num);
            System.out.println(length);

        } catch (NumberFormatException e) {
            System.out.println("Please Enter Valid Number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of bound");
        }

    }
}
