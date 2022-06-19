public class Car extends Machine  implements  Check, Engine {


    public Car(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }
@Override
public void updateTyre(){
    System.out.println("Меняем покрышку машины");
}
@Override
public void checkEngine () {
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
