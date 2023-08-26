package bloque2;
//Objeto tipo Estudiante "atributos constructores Getter and setter".
public class Estudiante2 {
   private String nombre ;
   private String ciudad;
   private String carrera;

   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   public String getNombre(){
      return nombre;
   }
   public void setCiudad(String ciudad){
      this.ciudad = ciudad;
   }
   public String getCiudad(){
      return ciudad;
   }
   public  void setCarrera(String carrera){
      this.carrera = carrera;
   }

   public String getCarrera() {
      return carrera;
   }
}
