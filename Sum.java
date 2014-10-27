class Sum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, type any number");
            return;
        }
        int sum = 0;
        try {
            for (String arg: args) {
                String[] numbers = arg.split(" "); 
                for (String number: numbers) {
                    if (number.length() != 0) {
                        sum += Integer.parseInt(number);
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + e);
            return;
        }
        System.out.println("Result: " + sum);
    }
}