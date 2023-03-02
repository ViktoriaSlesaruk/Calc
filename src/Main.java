import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);
              int num1 = scanner.nextInt();
              System.out.println("Введите одну из операций: \n+ \n- \n/ \n*");
                char operation = scanner.next().charAt(0);
                System.out.println("Введите второе число: ");
                int num2 = scanner.nextInt();

            if (operation == '/' && num2 == 0) {
                System.out.println("На ноль делить нельзя!");
            }

                 if (operation == '+') {
                    System.out.println("Результат: " + (num1 + num2) + "\nПродолжить: да/нет?");
            }
                 else if (operation == '-'){
                    System.out.println("Результат: " + (num1 - num2) + "\nПродолжить: да/нет?");
                }
                 else if (operation == '*'){
                    System.out.println("Результат: " + (num1 * num2) + "\nПродолжить: да/нет?");
                }
                 else if (operation == '/'){
                    System.out.println("Результат: " + ((double)num1 / num2) + "\nПродолжить: да/нет?");
                }
                 else {
                    System.out.println("Введен невалидный оператор: используйте \n+ \n- \n/ \n*");
                    break;
                };
                String answer = scanner.next();
                if (!answer.equals("да")) {
                    break;
                } else {
                    System.out.println();
                }
            }
        }
    }


