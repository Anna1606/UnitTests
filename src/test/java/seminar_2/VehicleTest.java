package seminar_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seminar_2.Vehicle.Car;
import seminar_2.Vehicle.Motorcycle;
import seminar_2.Vehicle.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeMethod
    @BeforeEach
    public void setUp() {
        car = new Car("Toyota", "Corolla", 2009);
        motorcycle = new Motorcycle("Suzuki", "GSX750",2010);
        car.testDrive();
        motorcycle.testDrive();
    }

    @AfterMethod
    @AfterEach
    public void vehiclePark() {
        car.park();
        motorcycle.park();
    }


    @Test
    @DisplayName("Car является экземпляром транспортного средства")
    public void carIsInstanceOfVehicleTest() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Car создается с 4-мя колесами")
    public void numberCarWheelsTest() {
        assertEquals(4, car.getNumWheels(), "number of wheels must be 4");
    }

    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    public void numberMotorcycleWheelsTest() {
        assertEquals(2, motorcycle.getNumWheels(), "number of wheels must be 2");
    }

    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения")
    public void testDriveCarSpeedTest() {
        assertEquals(60,car.getSpeed(), "car speed expected 60");
    }

    @Test
    @DisplayName("Motorcycle развивает скорость 75")
    public void testDriveMotorcycleSpeedTest() {
        assertEquals(75, motorcycle.getSpeed(), "Motorcycle speed expected 75");
    }

    @Test
    @DisplayName("Тест режима парковки машины")
    public void carParkTest() {
        car.park();
        assertEquals(0, car.getSpeed(), "car ");
    }

    @Test
    @DisplayName("Тест режима парковки мотоцикла")
    public void motorcycleParkTest() {
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "Motorcycle must to stop");
    }
}
