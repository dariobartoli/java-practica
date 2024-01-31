package src;

public class PokemonElectrico extends Pokemon implements IElectrico{
    public PokemonElectrico() {
    }

    public PokemonElectrico(int numPokedex, String nombre, Sexo type, double peso, int temporada) {
        super(numPokedex, nombre, type, peso, temporada);
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Soy "+ nombre+ " y he usado impact trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy "+ nombre+ " y he usado puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy "+ nombre+ " y he usado rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy "+ nombre+ " y he usado rayo carga");
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
