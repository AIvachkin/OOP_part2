public class Car extends Machine  implements  Check {


    public Car(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }

private void updateTyre(){
    System.out.println("Меняем покрышку машины");
}

private void checkEngine () {
    System.out.println("Проверяем двигатель машины");
}

    @Override
    public void checkMachine() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

}
