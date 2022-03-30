import java.awt.*;

public class StepTracker {
    private int[][] monthToData=new int[30][12];
    protected int sum;
    private int max;
    private int count;
    private int maxCombo;
    private int goalBySteps = 10000;//цель по шагам
    private Converter first = new Converter();

   public void modifyTheGoal(int userGoalBySteps){
        if(userGoalBySteps>0){
            goalBySteps=userGoalBySteps;
            System.out.println("Ваша новая цель: "+goalBySteps+" шагов в день."+'\n');
        }
        else
            System.out.println("Вы ввели некорректное значение!"+'\n');
    }
    public void inputSteps(int userMonth,int userDay,int userSteps){
        if(userSteps>-1 && userMonth>0 && userMonth<13 && userDay>0 && userDay<31){
            monthToData[userDay-1][userMonth-1]=userSteps;
            System.out.println("Данные успешно внесены."+'\n');
        }
        else
            eror();
    }
    public void statistics(int userMonth){
        if(userMonth>0 && userMonth<13) {
            max=0;
            maxCombo=0;
            for (int i = 0; i < monthToData.length; i++) {
                System.out.print(i+1 + " день: " + monthToData[i][userMonth-1] + ", ");

                sum+=monthToData[i][userMonth-1];//общее количесво шагов

                if(monthToData[i][userMonth-1]>max)
                    max=monthToData[i][userMonth-1];//поиск максимума шагов

                if(monthToData[i][userMonth-1]>=goalBySteps){
                    count++;
                }
                else{
                    if(count>maxCombo) {
                        maxCombo=count;
                        count=0;
                    }
                    }
                }
            print();;

        }
        else{
            eror();
    }
   }
    private void eror(){
        System.out.println("Вы ввели некорректное значение!"+'\n' +"Напонинание:"+'\n' + "В году 12 месяцев,в месяце 30 дней."+'\n');
    }
    private void print(){
        System.out.println('\n');
        System.out.println("Общее количество шагов за месяц: "+sum);
        System.out.println("Максильмальное количество шагов за месяц: "+max);
        System.out.println("Среднее количество шагов за месяц: "+sum/30);
        System.out.println("Лучшая серия: "+maxCombo);
        first.convertСalories(sum);
        first.convertKilometer(sum);
    }
}
