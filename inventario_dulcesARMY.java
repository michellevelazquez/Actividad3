import java.util.Scanner;
/**
 *
 * @author michelle velázquez
 */
public class inventario_dulcesARMY {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int cantidad = 0;
        int existencia = 0;
        int precio = 0;
        String producto = "";
        
        do {
            System.out.println("     Sistema de inventario DULCES ARMY   ");
            System.out.println("1. Agregar producto ");
            System.out.println("2. Modificar producto ");
            System.out.println("3. Eliminar producto ");
            System.out.println("4. Consultar inventario ");
            System.out.println("5. Salir ");
            System.out.println("Ingrese una opción:  ");
            opcion = scanner.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    producto = scanner.next();
                    System.out.println("Ingresa la cantidad: ");
                    cantidad = scanner.nextInt();
                    System.out.println("Ingrese el precio: ");
                    precio = scanner.nextInt();
                    System.out.println(" ¡¡TU PRODUCTO SE AGREGO EXITOSAMENTE!! ");
                    break;
                    
                case 2:
                    System.out.println("Ingresa el nombre del producto a modificar: ");
                    producto = scanner.next();
                    System.out.println("Ingresa la nueva cantidad: ");
                    cantidad = scanner.nextInt();
                    System.out.println("Ingresa el nuevo precio: ");
                    precio = scanner.nextInt();
                    System.out.println(" ¡¡TU PRODUCTO FUE MODIFICADO EXITOSAMENTE!! ");
                    break;
                    
                case 3:
                    System.out.println("Ingrese el nombre del producto a eliminar: ");
                    producto = scanner.next();
                    System.out.println(" ¡¡TU PRODUCTO ELIMINADO EXITOSAMENTE!! ");
                    break;
                    
                case 4:
                    System.out.println("Inventario: ");
                    System.out.println("Producto\tCantidad\tPrecio");
                    System.out.println(producto + "\t"+cantidad+"\t"+precio);
                    break;
                    
                case 5:
                    System.out.println("Saliendo del sistema de inventario de DULCES ARMY");
                    break;
                    
                default:
                    System.out.println("Opción Inválida");
                    break;
            }
            
        } while (opcion !=5);
        
    }
    
}
