package rutis.transport.list2;

public class Main2 {
    public static void main(String[] args) {
        List2Direction list2 = new List2Direction();
        list2.add(new Apple("Красный",55,"Антоновка",120));
        list2.add(new Apple("Зеленый",60,"Грени",100));
        list2.add(new Apple("Желтый",80,"Голден",130));
        list2.add(new Apple("Алый",75,"Гала",150));
        list2.add(new Apple("Сливовый",65,"Спартан",90));
        list2.add(new Apple("Красно-белый",70,"Башкирская красавица",120));

        list2.print();

        list2.add(new Apple("Зеленый",64,"Семеринская",125));

        list2.print();

        System.out.println(list2.pop());

        list2.print();

        System.out.println(list2.remove(2));

        list2.print();

        list2.printReverse();

        list2.sort();

        list2.print();
    }
}
