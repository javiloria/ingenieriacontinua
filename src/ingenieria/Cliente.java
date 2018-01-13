package ingenieria;
public class Cliente {

  /************************************          ATRIBUTOS             *************************************/
  private String nombre;
  private String apellido;
  private long cedula;
  private int id;
  private int fecha;
  private int ultimaCompra;


  /**************************************         constructor           **************************************/
  public Cliente (String nombre, String apellido,long cedula,int id , int ultimaCompra, int fecha){
    this.nombre=nombre;
    this.apellido=apellido;
    this.cedula=cedula;
    this.id=id;
    this.fecha=fecha;
    this.ultimaCompra=ultimaCompra;

  }
  public Cliente(){
      this.nombre="";
    this.apellido="";
    this.cedula=0;
    this.id=0;
    this.fecha=0;
    this.ultimaCompra=0;
      
  }

  /**********************************************  GET *********************************************************/
  public String getNombre(){
    return this.nombre;
  }

  public String getApellido(){
    return this.apellido;
  }

  public long getCedula(){
    return this.cedula;
  }

  public int getId(){
    return this.id;
  }
  public int getFecha(){
    return this.fecha;
  }
  public int getUltimaCompra(){
    return this.ultimaCompra;
  }
    public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public void setApellido(String apellido){
    this.apellido=apellido;
  }

  public void setCedula(long cedula){
    this.cedula=cedula;
  }

  public void setId(int id){
 this.id=id;
  }
  public void setFecha(int fecha){
    this.fecha=fecha;
  }
  public void setUltimaCompra(int ultimaCompra){
this.ultimaCompra=ultimaCompra;
  }
}
