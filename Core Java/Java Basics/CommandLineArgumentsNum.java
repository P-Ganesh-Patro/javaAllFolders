public class CommandLineArgumentsNum {
    public static void main(String[] args) {
        System.out.println(args.length);

        try {
            int num = Integer.parseInt(args[0]);

            int length = (args.length > 1) ? Integer.parseInt(args[1]) : 5;
            for (int i = 0; i < length; i++) {
                System.out.println(num);
            }

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());

        }

    }

}
