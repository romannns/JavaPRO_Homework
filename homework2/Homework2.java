package basicPro.homework2;

public class Homework2 {
    public static void main(String[] args) {
        Employees[] emplArray = new Employees[5];
        emplArray[0] = new Employees("Ivan Ivanov", "Engineer", "ivivan@mail.com", "20967584", 800, 25);
        emplArray[1] = new Employees("Dave Rodgers", "Builder", "ae86@mail.com", "27685940", 1200, 50);
        emplArray[2] = new Employees("Klim Klimov", "Plumber", "klkl@mail.com", "20987666", 1500, 43);
        emplArray[3] = new Employees("Steve Davidson", "Electrician", "sel@mail.com", "20006785", 900, 28);
        emplArray[4] = new Employees("Akira Yamaoka", "Manager", "akdj@mail.com", "20985554", 1000, 30);
        for (int i = 0; i < emplArray.length; i++){
            if (emplArray[i].getAge() > 40){
                System.out.println(emplArray[i]);
            }
        }
    }
}