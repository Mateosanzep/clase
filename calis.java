public class calis {
    String materia;
    int semestre;
    double cali;
    public calis(){
        this.materia = "***";
        this.semestre = 0;
        this.cali = 0;
    }
    public calis(String materia, int semestre, double cali) {
        this.materia = materia;
        this.semestre = semestre;
        this.cali = cali;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public double getCali() {
        return cali;
    }
    public void setCali(double cali) {
        this.cali = cali;
    }
    
}
