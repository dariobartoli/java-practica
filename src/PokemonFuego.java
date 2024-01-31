package src;

public class PokemonFuego extends Pokemon implements IFuego{
    public PokemonFuego() {
    }

    public PokemonFuego(int numPokedex, String nombre, Sexo type, double peso, int temporada) {
        super(numPokedex, nombre, type, peso, temporada);
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy "+ nombre+ " y he usado puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy "+ nombre+ " y he usado ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy "+ nombre+ " y he usado lanzallamas");
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
