public class Main {
    public static void main(String[] args) {

        Animal murzik = new Animal.Cat("Мурзик") ;
        Animal barbos = new Animal.Dog("Барбос") ;
        Animal barsik = new Animal.Cat("Барсик") ;

        eat(murzik) ;
        eat(barbos) ;
        eat(barsik) ;

          }

          private static void eat(Eatable eatable){
        eatable.eat();
          }

    private interface Eatable {

        void eat();
// этот метод абстрактный, и он должен быть переопределен в
        // Cat и Dog
    }

    private static abstract class Animal implements Eatable {
        // Имплементируем, т.к. все животные едят
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Animal(String name) {
            this.name = name;
        }

        private static class Cat extends Animal {
            public Cat(String name) {
                super(name);
            }

            @Override
            public void eat() {
                System.out.println("Кормим кошку " + getName());

            }
        }

        private static class Dog extends Animal {
            public Dog(String name) {
                super(name);
            }

            @Override
            public void eat() {
                System.out.println("Кормим собаку " + getName());
            }
        }


    }
}