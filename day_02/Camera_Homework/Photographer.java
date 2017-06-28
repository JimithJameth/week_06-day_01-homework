import java.util.ArrayList;

public class Photographer{
  private String name;
  private ArrayList<Printable> cameras;

  public Photographer (String name){
    this.name = name;
    this.cameras = new ArrayList<Printable>();
  }

  public String getName(){
    return this.name;
  }

  public int cameraCount(){
    return this.cameras.size();
  }

  public void addCamera(Printable camera){
    this.cameras.add(camera);
  }

  public Printable removeCamera(Printable camera){
    if(cameraCount() > 0) {
      return cameras.remove(0);
    }
    return null;
  }
  public String cameraCollection(){
    String allDetails = ""; 
     for (Printable camera : this.cameras){
      allDetails += camera.printDetails();
    } 
    return allDetails; 
  }
}
