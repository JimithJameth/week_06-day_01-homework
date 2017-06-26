import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest {

  Bus bus;
  Passenger passenger;

  @Before
  public void before() {
    bus = new Bus("37");
    passenger = new Passenger();
  }

  @Test
  public void hasName(){
    assertEquals("37", bus.getName());
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.peopleCount());
  }

  @Test
  public void canAddPassenger() {
    bus.add(passenger);
    assertEquals(1, bus.peopleCount());
  }

  @Test
  public void cannotAddPassengerWhenBusIsFull() {
    for (int i = 0; i < 6; i++) {
      bus.add(passenger);
    }
    assertEquals(5, bus.peopleCount());
  }
  @Test
  public void BusIsFull(){
    for (int i = 0; i < 5; i++){
      bus.add(passenger);
    }
    assertEquals(true, bus.isBusFull());
  }
  @Test
  public void shouldBeEmptyAfterDroppingOffPassengers() {
    bus.add(passenger);
    bus.rest();
    assertEquals(0, bus.peopleCount());

  }
}