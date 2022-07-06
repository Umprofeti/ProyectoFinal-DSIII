package controlador;

public class Planilla extends Empleado{
    private double Sphora;
    private int horatrabjada;
    private double Sbruto;
    private double segsocial, segeducativo;
    private final double SS = 0.0975, SE = 0.0125; 
    private double SNETO;
    private int id_planilla;

    public Planilla() {
    }

    public Planilla(double Sphora, int horatrabjada, double Sbruto, double segsocial, double segeducativo, double SNETO) {
        this.Sphora = Sphora;
        this.horatrabjada = horatrabjada;
        this.Sbruto = Sbruto;
        this.segsocial = segsocial;
        this.segeducativo = segeducativo;
        this.SNETO = SNETO;
    }

    public Planilla(double Sphora, int horatrabjada, double Sbruto, double 
            segsocial, double segeducativo, double SNETO, String cedula, 
            String nombre, String nombre2, String Apellido, String Apellido2, 
            String fecha_nacimiento, String direccion, String telefono) {
        super(cedula, nombre, nombre2, Apellido, Apellido2, fecha_nacimiento, direccion, telefono);
        this.Sphora = Sphora;
        this.horatrabjada = horatrabjada;
        this.Sbruto = Sbruto;
        this.segsocial = segsocial;
        this.segeducativo = segeducativo;
        this.SNETO = SNETO;
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

        Sbruto = this.horatrabjada * this.Sphora;

        segsocial = this.Sbruto * SS;

        segeducativo = this.Sbruto * SE;

        SNETO = this.Sbruto - this.segsocial - this.segeducativo;

    }

    public int getId_planilla() {
        return id_planilla;
    }

    public void setId_planilla(int id_planilla) {
        this.id_planilla = id_planilla;
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
