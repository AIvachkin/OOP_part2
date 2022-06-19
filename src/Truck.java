public class Truck extends Machine implements Check {

    public Truck(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }
    private void updateTyre(){
        System.out.println("Меняем покрышку грузовика");
    }

    private void checkEngine () {
        System.out.println("Проверяем двигатель грузовика");
    }
    private void checkTrailer () {
        System.out.println("Проверяем прицеп грузовика");
    }



    @Override
    public void checkMachine() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }



}
