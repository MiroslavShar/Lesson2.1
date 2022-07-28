import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarNew focus = new CarNew("blue", 2010, "Ford");
        CarNew lambo = new CarNew("Red", 2022, "Lamborgini");
        CarNew alpine = new CarNew("Black", 2021, "Alpine");

        String focusColor = focus.getColor();
        int focusYear = focus.getYear();
        String focusBrand = focus.getBrand();

        String lamboColor = lambo.getColor();
        int lamboYear = lambo.getYear();
        String lamboBrand = lambo.getBrand();

        String alpineColor = alpine.getColor();
        int alpineYear = alpine.getYear();
        String alpineBrand = alpine.getBrand();


        ArrayList<String> list = new ArrayList<>();


        String name = focusColor + " " + focusBrand + " " + focusYear;
        String name2 = lamboColor + " " + lamboBrand + " " + lamboYear;
        String name3 = alpineColor + " " + alpineBrand + " " + alpineYear;



        list.add(name);
        list.add(name2);
        list.add(name3);


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

    class NewList extends CarNew {
        int speed;

        public NewList(String color, int year, String brand, int speed) {
            super(color, year, brand);
            speed = 320;
        }
    }
}
