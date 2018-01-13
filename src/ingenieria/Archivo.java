package ingenieria;
public interface Archivo {

  public abstract void escribir(Cliente c);

  public abstract Cliente leer(long id); //File archivo

}
