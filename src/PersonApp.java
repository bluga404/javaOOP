public class PersonApp {
        public static void main(String[] args) {

            var person1 = new Person("Walker", "Balige");

            Person person2;
            person2 = new Person("Joko");

            Person person3 = new Person();
            person3.name = "Sahroni";

            System.out.println(person1.name);
            System.out.println(person1.address);
            System.out.println(person1.country);

            person1.sayHello("Budi");
            person2.sayHello("Andika");
            person3.sayHello("Uya Kuya");

        }
    }
