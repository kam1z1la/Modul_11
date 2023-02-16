import Task1.Name;
import Task2.SortName;
import Task3.StringValue;
import Task4.OwnRandValue;

import java.util.ArrayList;

import static Task4.OwnRandValue.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Taras");
        list.add("Anton");
        list.add("Ivan");
        list.add("Ivanka");
        list.add("Artem");
        System.out.println(Name.namesWithUnpairedIndex(list));
        System.out.println();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Taras");
        list1.add("Anton");
        list1.add("Ivan");
        list1.add("Ivanka");
        list1.add("Artem");
        list1.add("Zara");
        System.out.println(list1);
        System.out.println(SortName.namesReversedSort(list1));
        System.out.println();

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("6, 7, 8");
        list3.add("3, 4, 5");
        list3.add("0, 1, 2, -1");
        System.out.println(list3);
        System.out.println(StringValue.makeStringFromArray(list3));
        System.out.println();

        System.out.println(OwnRandValue.lineaCongruentGenerator(c, a, m));
        System.out.println();
    }
}