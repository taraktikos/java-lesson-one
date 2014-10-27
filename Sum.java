class Sum {
    public static void main(String[] args) {
        if (args.length != 0) {
            int sum = 0;
            for (String arg: args) {
                String[] numbers = arg.split(" "); 
                for (String number: numbers) {
                    try {
                        if (number.length() != 0) {
                            sum += Integer.parseInt(number);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number: " + number);
                        return;
                    }
                }
            }
            System.out.println("Result: " + sum);
        } else {
            System.out.println("Please, type any number");
        }
    }
}