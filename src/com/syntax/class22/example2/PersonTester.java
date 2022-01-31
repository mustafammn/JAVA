package com.syntax.class22.example2;

public class PersonTester {
    public static void main(String[] args) {
       /* Person person=new Teacher("Asghar");
        person.eat();*/
       // Teacher teacher=new Person("Person");
        //break till 8:53
        Person person1=new Student("Mykl");
        Person [] persons={new Student("Farhad")
                ,new Employee("Naiya"),new Teacher("Asel")};

        for (Person person2:persons
             ) {
            person2.performDailyTasks();

            if(person2 instanceof Teacher){
                ((Teacher)person2).designClasses();
            }


        }
    }
}
