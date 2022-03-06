import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions._;

import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@ExtendWith(classOf[MockitoExtension])
class CarTest {

  @InjectMocks
  val service: example.service.CarService = example.service.CarServiceImpl();

    @Test
    def createCar_getPrice(): Unit = {
      val o: example.model.Car = service.createCar();
      val expected = 0.0;
      assertEquals(o.price, expected);
    }

    @Test
    def createCar_getYear(): Unit = {
      val o: example.model.Car = service.createCar();
      val expected = 0;
      assertEquals(o.year, expected);
    }

    @Test
    def createCar_getMake(): Unit = {
      val o: example.model.Car = service.createCar();
      val expected = "test";
      assertEquals(o.make, expected);
    }

    @Test
    def createCar_getModel(): Unit = {
      val o: example.model.Car = service.createCar();
      val expected = "test";
      assertEquals(o.model, expected);
    }

    @Test
    def createCar_objectNotNull(): Unit = {
      val o: example.model.Car = service.createCar();
      assertNotNull(o);
    }

    @Test
    def createRandomCar_objectNotNull(): Unit = {
      val o: example.model.Car = service.createRandomCar();
      assertNotNull(o);
    }

    @Test
    def findAll_sizeIsThree(): Unit = {
      val lst: List<example.model.Car> = service.findAll();
      val expected = 3;
      assertEquals(lst.size, expected);
    }

    @Test
    def addCar_sizeIsFour(): Unit = {
      val lst: List<example.model.Car> = service.addCar();
      val expected = 4;
      assertEquals(lst.size, expected);
    }

    @Test
    def deleteCar_sizeIsTwo(): Unit = {
      val lst: List<example.model.Car> = service.deleteCar();
      val expected = 2;
      assertEquals(lst.size, expected);
    }
}
