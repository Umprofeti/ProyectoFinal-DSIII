package controlador;

   import java.util.ArrayList;     
        
public class Planilla extends Empleado{
    private double Sphora;
    private int horatrabjada;
    private double Sbruto;
    private double segsocial, segeducativo;
    private final double SS = 0.0975, SE = 0.0125; 
    private double SNETO;
    private int idplanilla;
    private String fecha;
    
    public Planilla() {
    }

    public Planilla(int idPlanilla, String fecha, double Sbruto, double segsocial, double segeducativo, double SNETO) {
        this.idplanilla = idPlanilla;
        this.fecha = fecha;
        this.Sbruto = Sbruto;
        this.segsocial = segsocial;
        this.segeducativo = segeducativo;
        this.SNETO = SNETO;
    }
    
    public Planilla(int idPlanilla, String fecha, String cedula, String nombre1, String nombre2, String apellido1,
           String apellido2, int ht, double sph, double sb, double ss, double se, double sn) {
        super(cedula, nombre1, nombre2, apellido1, apellido2);
        this.idplanilla = idPlanilla;
        this.fecha = fecha;
        this.horatrabjada = ht;
        this.Sphora = sph;
        this.Sbruto = sb;
        this.segsocial = ss;
        this.segeducativo= se;
        this.SNETO = sn;
    }
    
    public Planilla(int idplanilla) {
        this.idplanilla = idplanilla;
    }

    public Planilla(int idPlanilla, String fecha, double Sphora, int horatrabjada, double Sbruto, double 
            segsocial, double segeducativo, double SNETO, String cedula, 
            String nombre, String nombre2, String Apellido, String Apellido2, 
            String fecha_nacimiento, String direccion, String telefono) {
        super(cedula, nombre, nombre2, Apellido, Apellido2, fecha_nacimiento, direccion, telefono);
        this.idplanilla = idPlanilla;
        this.fecha = fecha;
        this.Sphora = Sphora;
        this.horatrabjada = horatrabjada;
        this.Sbruto = Sbruto;
        this.segsocial = segsocial;
        this.segeducativo = segeducativo;
        this.SNETO = SNETO;
    }

    public int getIdplanilla() {
        return idplanilla;
    }

    public void setIdplanilla(int idplanilla) {
        this.idplanilla = idplanilla;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSphora() {
        return Sphora;
    }

    public void setSphora(double Sphora) {
        this.Sphora = Sphora;
    }

    public int getHoratrabjada() {
        return horatrabjada;
    }

    public void setHoratrabjada(int horatrabjada) {
        this.horatrabjada = horatrabjada;
    }

    public double getSbruto() {
        return Sbruto;
    }

    public void setSbruto(double Sbruto) {
        this.Sbruto = Sbruto;
    }

    public double getSegsocial() {
        return segsocial;
    }

    public void setSegsocial(double segsocial) {
        this.segsocial = segsocial;
    }

    public double getSegeducativo() {
        return segeducativo;
    }

    public void setSegeducativo(double segeducativo) {
        this.segeducativo = segeducativo;
    }

    public double getSNETO() {
        return SNETO;
    }

    public void setSNETO(double SNETO) {
        this.SNETO = SNETO;
    }
    
    public void Salirobruto() {

        Sbruto = Math.round((this.horatrabjada * this.Sphora)*100)/100;

        segsocial = Math.round((this.Sbruto * SS)*100)/100;

        segeducativo = Math.round((this.Sbruto * SE)*100)/100;

        SNETO = this.Sbruto - this.segsocial - this.segeducativo;

    }
    
    public boolean validarhorastr() {
        if (this.horatrabjada >= 4 && this.horatrabjada <= 12) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarsalario() {
        if (this.Sphora >= 5.00 && this.Sphora <= 20.00) {
            return true;
        } else {
            return false;
        }
    }
}
        
