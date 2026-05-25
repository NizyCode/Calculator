//Импорт сканера для считывания клавиатуры
import java.util.Scanner;



public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Переменная, которая управляет циклом(Продолжаем расчёты или выходим)
        boolean continueCalculating = true;

        //Приветственное сообщение
        System.out.println("===КОНСОЛЬНЫЙ КАЛЬКУЛЯТОР===");
        System.out.println("Доступные операции: +, -, *, /");
        System.out.println("при делении на ноль будет сообщение об ошибке");
        System.out.println("Для выхода в конце введите 'нет'");
        System.out.println("===============================");

        //Пока countinueCalculating = true цикл будет работать
        while(continueCalculating){

            //Первое число
            double num1 = 0;
            //Флаг правильности ввода
            boolean validInput = false;

            //Цикл будет повторятся, пока пользователь не введёт корректное число
            while (!validInput){
                System.out.println("Введите  первое число: ");
                //Читает всю строку которую ввёл пользователь
                String input = scanner.nextLine();

                //Преобразовываем строку в число double
                try{
                    num1 = Double.parseDouble(input);
                    validInput = true; //Если дошли до этой строки преобразование успешно

                } catch (NumberFormatException e){
                    //Если пользователь ввёл буквы или некорректное число
                    //Выводим сообщение и просим ввести снова
                    System.out.println("Ошибка! Введите число, например 5 или 3.14");
                }
            }
            System.out.println("Ваше первое число: " + num1);

            //Второе число
            double num2 = 0;
            validInput = false; //Сбрасываем флаг для второго числа

            while (!validInput){
                System.out.println("Введите  второе число: ");
                //Читает всю строку которую ввёл пользователь
                String input = scanner.nextLine();

                //Преобразовываем строку в число double
                try{
                    num2 = Double.parseDouble(input);
                    validInput = true; //Если дошли до этой строки преобразование успешно

                } catch (NumberFormatException e){
                    //Если пользователь ввёл буквы или некорректное число
                    //Выводим сообщение и просим ввести снова
                    System.out.println("Ошибка! Введите число, например 5 или 3.14");
                }
            }
            System.out.println("Ваше второе число: " + num2);
        }
    }
}
