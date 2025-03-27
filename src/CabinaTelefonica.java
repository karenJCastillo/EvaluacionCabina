public class CabinaTelefonica {
    protected String tipodeLlamada;
    protected double duraciondelallamada;
    protected int costodelallamda;
    String idLLamada;
    public CabinaTelefonica() {
    }

    public CabinaTelefonica(String tipodeLlamada, double duraciondelallamada, int costodelallamda, String idLLamada) {
        this.tipodeLlamada = tipodeLlamada;
        this.duraciondelallamada = duraciondelallamada;
        this.costodelallamda = costodelallamda;
        this.idLLamada = idLLamada;
    }

    public String getTipodeLlamada() {
        return tipodeLlamada;
    }

    public void setTipodeLlamada(String tipodeLlamada) {
        this.tipodeLlamada = tipodeLlamada;
    }

    public double getDuraciondelallamada() {
        return duraciondelallamada;
    }

    public void setDuraciondelallamada(double duraciondelallamada) {
        this.duraciondelallamada = duraciondelallamada;
    }

    public int getCostodelallamda() {
        return costodelallamda;
    }

    public void setCostodelallamda(int costodelallamda) {
        this.costodelallamda = costodelallamda;
    }

    public String getIdLLamada() {
        return idLLamada;
    }

    public void setIdLLamada(String idLLamada) {
        this.idLLamada = idLLamada;
    }

    @Override
    public String toString() {
        return "CabinaTelefonica{" +
                "tipodeLlamada='" + tipodeLlamada + '\'' +
                ", duraciondelallamada=" + duraciondelallamada +
                ", costodelallamda=" + costodelallamda +
                ", idLLamada='" + idLLamada + '\'' +
                '}';
    }

    public boolean mostrarInformacion  (){
        System.out.println("Total de llamadas realizadas " +"duracion de las llamadas"+duraciondelallamada+"mn ");
        return false;
    }

}
