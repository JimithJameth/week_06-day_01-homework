import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  AnalogCamera analogCamera;
  DigitalCamera digitalCamera;

  @Before
  public void setup(){
    photographer = new Photographer("Jamie");
    analogCamera = new AnalogCamera("E.G 1. Nikon 34T"); 
    digitalCamera = new DigitalCamera("Sony ILCE5100L"); 
  }

  @Test
  public void hasName(){
    assertEquals("Jamie", photographer.getName());
  }

  @Test
  public void addCamera(){
    photographer.addCamera(analogCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void removeCamera(){
    photographer.removeCamera(analogCamera);
    assertEquals(0,photographer.cameraCount());
  }

  @Test
  public void cameraCollection(){
    photographer.addCamera(analogCamera);
    photographer.addCamera(digitalCamera);
    String cameraDetails = "E.G 1. Nikon 34T" + "Sony ILCE5100L";
    assertEquals(cameraDetails, photographer.cameraCollection());

  }
}