package factorymethod.after;

import java.util.HashMap;

public class CarFactory {

    private HashMap<String, Car> carHashMap = new HashMap<>();
    // 외부에서 생성되면 안 됨..
    private static CarFactory instance = new CarFactory();

    private CarFactory() {

    }

    // 가져다쓰기 위해 public 메서드 만들어줌..
    public static CarFactory getFactory() {
        // 방어 코드
        if (instance == null) {
            instance = new CarFactory();
        }

        return instance;
    }

    public Car createCar(String type, String owner) {
        Car returnCar = null;

        if (type.equals(CarName.SONATA.name)) {
            returnCar = new Sonata(type, owner);
        } else if (type.equals(CarName.GENESIS.name)) {
            returnCar = new Genesis(type, owner);
        } else if (type.equals(CarName.GRANDEUR.name)) {
            returnCar = new Grandeur(type, owner);
        }
        registerCar(returnCar, owner);
        return returnCar;
    }

    public void registerCar(Car car, String owner) {
        Car myCar = carHashMap.get(owner);
        if (myCar == null) {
            carHashMap.put(owner, car);
        }
    }

    public Car searchMyCar(String owner) {
        Car myCar = carHashMap.get(owner);
        if (myCar != null) {
            return myCar;
        } else {
            System.out.println("해당 차가 없습니다.");
            return null;
        }
    }
}
