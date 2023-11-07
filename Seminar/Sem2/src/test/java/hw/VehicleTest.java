package hw;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {
    //Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void testInstance(){
        Car car = new Car("Lada","Vesta", 2008);
        assertThat(car instanceof Vehicle).isEqualTo(true);
    }

    //Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void testWheel(){
        Car car = new Car("Lada","Vesta", 2008);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void testWheelMoto(){
        Motorcycle motorcycle = new Motorcycle("Java","12V",1978);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    //Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void speedCar(){
        Car car = new Car("Lada","Vesta", 2008);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    //Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testMoto(){
        Motorcycle motorcycle = new Motorcycle("Java","12V",1978);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void testMove(){
        Car car = new Car("Lada","Vesta", 2008);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void  testMoveMoto(){
        Motorcycle motorcycle = new Motorcycle("Java","12V",1978);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}