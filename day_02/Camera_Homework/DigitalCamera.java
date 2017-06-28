public class DigitalCamera implements Printable{
  private String name;

  public DigitalCamera(String name){
    this.name = name;
  }


    public String printDetails(){
      return name;
    }
  }
