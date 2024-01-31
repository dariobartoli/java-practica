package src;

public class Practica {

    public static void main(String[] args){
        PokemonElectrico pikachu = new PokemonElectrico(25, "Pikachu",Sexo.MASCULINO,3.44,1);
        PokemonAgua squirtle = new PokemonAgua(7, "Squirtle", Sexo.FEMENINO, 4.55, 1);
        PokemonFuego charmander = new PokemonFuego(4, "Charmander", Sexo.MASCULINO, 4.32, 1);
        PokemonPlanta bulbasaur = new PokemonPlanta(1, "Bulbasaur", Sexo.MASCULINO, 3.67, 1);
        PokemonFuego charizard = new PokemonFuego(6, "Charizard", Sexo.FEMENINO, 35.3, 1);


        pikachu.atacarImpacTrueno();
        charizard.atacarLanzallamas();
        bulbasaur.atacarHojaAfilada();
        charmander.atacarAscuas();
        squirtle.atacarBurbujas();

        System.out.println(pikachu.getNumPokedex());
        System.out.println(charizard.getPeso());
    }
}
