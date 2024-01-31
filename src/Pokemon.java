package src;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected Sexo type;
    protected double peso;
    protected int temporada;

    public Pokemon() {
    }

    public Pokemon(int numPokedex, String nombre, Sexo type, double peso, int temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.type = type;
        this.peso = peso;
        this.temporada = temporada;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getType() {
        return type;
    }

    public void setType(Sexo type) {
        this.type = type;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public abstract void atacarPlacaje();
    public abstract void atacarMordisco();
    public abstract void atacarAraniazo();


}
