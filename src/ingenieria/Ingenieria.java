/*
 Requiero que diseñen e implementen una pequeña librería en Java, que permita leer la información, 
contenida en un archivo, de clientes de una empresa. De los clientes se conoce: Nombre,Apellido,cédula,fecha 
última compra,identificador de cliente.
La librería debe permitir el registro de nuevos clientes, consultar clientes dada la cédula o identificación 
de cliente en la empresa. No se acepta el registro de clientes duplicados, cédula similar, en el archivo.

El diseño debe contemplar la aplicación de dos patrones de diseño, la famosa fachada para modelar la lógica de 
negocio para registrar,consultar información de clientes y el patrón de diseño DAO (Data Access Object) para
modelar las operaciones de lectura y escritura sobre el archivo de datos.

Se requiere entregar el diseño UML de su solución, implementar pruebas unitarias para mostrar el funcionamiento 
de la las operaciones de la capa de acceso a datos y de la lógica de negocio.
*Fecha tope de entrega SABADO 13-01-2018 11:59 AM* SI AM no es un error...
 */
package ingenieria;


public class Ingenieria {

    public static void main(String[] args) {
       
         LogicaDeNegocio p = new Empresa1();
         //aca va la cedula para la busqueda
       
        //Cliente c= new Cliente("JOSE","Ramos",1122,333,44,55);
       // p.registrarCliente(c);
         p.consultarCliente(1122);
        
    }
    
}
