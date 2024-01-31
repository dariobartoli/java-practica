package src;

public class PokemonAgua extends Pokemon implements IAgua{
    public PokemonAgua() {
    }

    public PokemonAgua(int numPokedex, String nombre, Sexo type, double peso, int temporada) {
        super(numPokedex, nombre, type, peso, temporada);
    }



    @Override
    public void atacarHidroBomba() {
        System.out.println("Soy "+ nombre+ " y he usado hidro bomba");
    }

    @Override
    public void atacarBurbujas() {
        System.out.println("Soy "+ nombre+ " y he usado burbujas");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy "+ nombre+ " y he usado pistola de agua");
    }

    @Override
    public void atacarHidroPulso() {
        System.out.println("Soy "+ nombre+ " y he usado hidropulso");
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
