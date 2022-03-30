public class Converter {
    private int KILOMETRS_IN_CENTIMETRS=100000;
    private int CENTIMETRS_IN_STEP=75;
    private int CALORIES_IN_STEP=50;
    private int CALORIES_IN_KILOCAL=1000;
    protected void convertKilometer(int sum){
        System.out.println("Пройдено километров за месяц:"+(double)(sum*CENTIMETRS_IN_STEP)/KILOMETRS_IN_CENTIMETRS+'\n');
    }
    protected void convertСalories(int sum){
        System.out.println("Потрачено калорий за месяц:"+(sum*CALORIES_IN_STEP)/CALORIES_IN_KILOCAL);
    }
}
