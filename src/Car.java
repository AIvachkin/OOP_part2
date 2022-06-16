public class Car extends Machine  implements  Check {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    @Override
    public void checkMachine() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
    }

}
