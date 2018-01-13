package ingenieria;

public class Empresa1 implements LogicaDeNegocio {

    @Override
    public void registrarCliente(Cliente c) {
      Cliente cliente;
        Archivo archivo = new BDJson();
           
        cliente=archivo.leer(c.getCedula());
          System.out.println(cliente);
        if(cliente ==null)
              System.out.println("Usted ya esta regitrado");
      
       else 
      archivo.escribir(c);
    }

    @Override
    public void consultarCliente(long c) {
        Cliente cliente;
        Archivo archivo = new BDJson();
        cliente=archivo.leer(c);
        if(cliente != null){
        System.out.println("cedula: "+cliente.getCedula());
        System.out.println("nombre: "+cliente.getNombre());
        System.out.println("id: "+cliente.getId());
        System.out.println("apellido: "+cliente.getApellido());
        System.out.println("Fecha: "+cliente.getFecha());
        System.out.println("Compra: "+cliente.getUltimaCompra());
    }
        else System.out.println("Usted no esta en la lista");
    }

}
