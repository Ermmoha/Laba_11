class Person{
    private int Age;
    public String FIO;
    public String Number;
    Person(int age, String fio, String number){
        this.Age = age;
        this.FIO = fio;
        this.Number = number;
    }
    int getAge(){
        return Age;
    }
}
class Student extends Person{
    public int Course;
    public String Facultet;
    private int Date;
    Student(int Age, String FIO, String Number, int course, String facultet, int date) {
        super(Age, FIO, Number);
        this.Course = course;
        this.Facultet = facultet;
        this.Date = date;
    }
    int getDate(){
        return Date;
    }

}

public class Main {
    public static void main(String[] args) {
        Student[] students = { new Student(17, "Лапицкий Д.В", "+79786752134",2, "Программирование",2022),
                new Student(18, "Ермохин Д.Е","+79875260892", 1, "Системная безопасность", 2023 ),
                new Student(18,"Дулатов И.И","+79786543217", 3,"Веб-дизайнер", 2021)
        };
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].FIO + " Возраст: " + students[i].getAge());
        }
        System.out.println("Студенты факультета программирования");
        for (int i = 0; i < students.length; i++){
            if (students[i].Facultet == "Программирование"){
                System.out.println(students[i].FIO);
            }
        }
        System.out.println("Студенты поступившие после 2021 года");
        for ( int i = 0; i < students.length; i++){
            if ( students[i].getDate() > 2021){
                System.out.println(students[i].FIO);
            }
        }
    }
}