public class Bicycle extends Machine implements Check{


    public Bicycle(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre(){
        System.out.println("Меняем покрышку велосипеда");
    }
    @Override
    public void checkMachine() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();

        }
    }
}

