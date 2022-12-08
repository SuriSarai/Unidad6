package unidad6;
 
public class Docente {
    private long cedula;
    private String nombre;
    private String profesion;
    private int aTitulacion;
    private float sueldo;
    private String puesto;

    public Docente(long cedula, String nombre, String profesion, int aTitulacion, float sueldo, String puesto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.profesion = profesion;
        this.aTitulacion = aTitulacion;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getaTitulacion() {
        return aTitulacion;
    }

    public void setaTitulacion(int aTitulacion) {
        this.aTitulacion = aTitulacion;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Docente{" + "cedula=" + cedula + ", nombre=" + nombre + ", profesion=" + profesion + ", año de titulacion=" + aTitulacion + ", sueldo=" + sueldo + ", puesto=" + puesto + '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cedula^(cedula >>> 32));
        return Math.abs(result%150);
    }
    
    public static int hashCode(long cedula) {
        final int prime=31;
        int result = 1;
        result = prime * result+ (int) (cedula ^ (cedula >>> 32));
        return Math.abs(result%150);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Docente other = (Docente) obj;
        return true;
    }
    
    
    
}
