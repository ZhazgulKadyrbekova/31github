package box;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = new Transaction();

        while (true) {
            var command = scanner.nextLine();
            String[] commands = command.split(" ");
            switch (commands[0]) {
                case "BEGIN": {
                    transaction.begin();
                    break;
                }
                case "COMMIT": {
                    transaction.commit();
                    break;
                }
                case "ROLLBACK": {
                    transaction.rollback();
                    break;
                }
                case "SET": {
                    transaction.set(commands[1], commands[2]);
                    break;
                }
                case "GET": {
                    System.out.println(transaction.get(commands[1]));
                    break;
                }
                case "DELETE": {
                    transaction.delete(commands[1]);
                    break;
                }
                case "COUNT": {
                    System.out.println(transaction.count(commands[1]));
                    break;
                }
            }
        }
    }

}
