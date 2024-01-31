package src;

public class PokemonPlanta extends Pokemon implements IPlanta{
    public PokemonPlanta() {
    }

    public PokemonPlanta(int numPokedex, String nombre, Sexo type, double peso, int temporada) {
        super(numPokedex, nombre, type, peso, temporada);
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy "+ nombre+ " y he usado drenaje");
    }

    @Override
    public void atacarParalisis() {
        System.out.println("Soy "+ nombre+ " y he usado paralisis");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy "+ nombre+ " y he usado latigo cepa");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy "+ nombre+ " y he usado hoja afilada");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy "+ nombre+ " y he usado placaje");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy "+ nombre+ " y he usado mordisco");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy "+ nombre+ " y he usado arañazo");
    }
}
