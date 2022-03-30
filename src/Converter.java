public class Converter {
    protected void convertKilometer(int sum){
        System.out.println("Пройдено километров за месяц:"+(sum*75)/10000+'\n');
    }
    protected void convertСalories(int sum){
        System.out.println("Потрачено калорий за месяц:"+(sum*50)/1000);
    }
}
