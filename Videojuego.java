public class Videojuego{
    private String nombre;
    private double precio;
    private boolean tienePaseDeBatalla;
    public Videojuego(String nombreVideojuego, double precioVideojuego){
        nombre = nombreVideojuego;
        precio = precioVideojuego;
        tienePaseDeBatalla = false;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public boolean getTienePaseDeBatalla(){
        return tienePaseDeBatalla;
    }
    
    public String getDetalles(){
        String detalles = "El nombre del videojuego es " + nombre + ", cuesta " + precio + " euros y ";
        if(tienePaseDeBatalla == true){
            detalles = detalles + "tiene pase de batalla";
        }else{
            detalles = detalles + "no tiene pase de batalla";
        }
        return detalles;
    }
    
    public void setNombre (String nombreVideojuego){
        nombre = nombreVideojuego;
    }
    
    public void setPrecio (double precioVideojuego){
        precio = precioVideojuego;
    }
    
    public void setTienePaseDeBatalla(){
        tienePaseDeBatalla = !tienePaseDeBatalla;
    }
    
    public void imprimirDetalles(){
        String detalles = "El nombre del videojuego es " + nombre + ", cuesta " + precio + " euros y ";
        if(tienePaseDeBatalla == true){
            detalles = detalles + "tiene pase de batalla";
        }else{
            detalles = detalles + "no tiene pase de batalla";
        }
        System.out.println(detalles);
    }
}