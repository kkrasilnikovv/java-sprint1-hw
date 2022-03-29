import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker first = new StepTracker();
        Converter one = new Converter();
        first.fillingWithZeros();//заполнил нулями массив
        while (true){
            printMenu();
            int userInput = scanner.nextInt();
            if(userInput==1){
                System.out.println("Введите месяц числом:");
                int userMonth= scanner.nextInt();
                System.out.println("Введите день:");
                int userDay= scanner.nextInt();
                System.out.println("Введите количество шагов:");
                int userSteps= scanner.nextInt();
                first.inputSteps(userMonth,userDay,userSteps);

            }
            else if(userInput==2){
                System.out.println("Введите месяц числом:");
                int userMonth= scanner.nextInt();
                first.statistics(userMonth);
                one.convertKilometer(first.sum);
                one.convertСalories(first.sum);
            }
            else if(userInput==3){
                System.out.println("Введите желаемую цель:");
                int userGoalBySteps= scanner.nextInt();
                first.modifyTheGoal(userGoalBySteps);

            }
            else if(userInput==4){
                System.out.println("Программа завершена");
                break;
            }
            else
                System.out.println("Вы ввели некорректную комманду");
        }
    }
    private static void printMenu() {
        System.out.println("Что вы желаете сделать:" +'\n'+"1-Ввести количество шагов за определённый день." +'\n'+
                "2-Напечатать статистику за определённый месяц."+'\n'+"3-Изменить цель по количеству шагов в день."+'\n'+
                "4-Выйти из приложения."+'\n');
    }
}
