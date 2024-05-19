package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.util.ArrayList;

public class MethodsTextAreaBattlePlayer2 {

    /**
     * metodo para poner el nombre del pokemon que hará el ataque en el text area de batalla del jugador 2
     * @return el nombre del pokemon
     */
    public static String getNamePokemon1PLayer2(){
        String namePokemon1Player2 = "";
        /**
         * iniciamos variables iguales al path del pokemon en batalla
         */
        String namePokemonInBattle = ButtonInterfaceCombat.getPathPokemonBattlePlayer2();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonInBattle.lastIndexOf('/');
        namePokemon1Player2 = namePokemonInBattle.substring(lastIndex + 1, namePokemonInBattle.lastIndexOf('.'));


        return namePokemon1Player2;
    }
    /**
     * metodo para saber el tipo del pokemon que hay en batalla del jugador 2
     * @return el tipo del pokemon
     */
    public static String getTypePokemonInBattlePlayer2() {

        /**
         * iniciamos distintas variables
         * la primera almacenará el tipo
         * la segundo la iniciamos e indicamos quees igual al nombre del pokemon en batalla
         * la tercera es un array de objetos que hacemos igual a el array de pokemons del jugador 1
         */
        String type = "";
        String namePokemon = getNamePokemon1PLayer2();
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer2();

        /**
         * recorremos con un for el array de pokemons
         */
        for (int i = 0; i < pokemons.size(); i++) {

            PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);

            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (pokemon.getName().equalsIgnoreCase(namePokemon)) {
                /**
                 * lo indicamos
                 */
                pokemon = (PokemonProperties) pokemons.get(i);

                /**
                 * asignamos la variable tipo al tipo del pokemon
                 */
                type = pokemon.getType();
                break;


            }
        }
        return type;
    }


    /**
     * metodo para poner el nombre del ataque 1 que hará el pokemon en el text area de batalla del jugador 2
     * @return el nombre del primer ataque
     */
    public static String getNameAttack1PokemonPLayer2(){
        /**
         * iniciamos una variable para encontrar el alias del jugador 1 en el hashmap
         */
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        /**
         * iniciamos una variable de tipo string igual a un metodo que nos da el nombre del pokemon en batalla
         */
        String namePokemonToLook = getNamePokemon1PLayer2();
        String attack1 = "";

        /**
         * recorremos el hashmap de jugasdores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si hay coincidencias en la clave, se mete en la condicion
             */
            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos igual al valor del hashmap
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                /**
                 * hacemos un for con el array
                 */
                for (int i = 0; i < pokemons.size(); i++) {
                    /**
                     * iniciamos una variable de tipo pokemon que es igual al tamaño
                     */
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    /**
                     * si encuentra el nombre del pokemon se mete en la condicion
                     */
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        /**
                         * lo indicamos
                         */
                        pokemon = (PokemonProperties) pokemons.get(i);
                        /**
                         * iniciamos una variable de ataques pokemon igual a la posicion 0 del array
                         */
                        AttacksPokemons attacks = pokemon.getAttacks()[0];
                        /**
                         * obtenemos el nombre
                         */
                        attack1 = attacks.getName();
                        break;
                    }
                }

            }
        }
        /**
         * devolvemos el nombre del ataque
         */
        return attack1;
    }
    /**
     * metodo para poner el nombre del ataque 2 que hará el pokemon en el text area de batalla del jugador 1
     * @return el nombre del primer ataque
     */
    public static String getNameAttack2PokemonPLayer2(){
        /**
         * iniciamos una variable para encontrar el alias del jugador 2 en el hashmap
         */
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        /**
         * iniciamos una variable de tipo string igual a un metodo que nos da el nombre del pokemon en batalla
         */
        String namePokemonToLook = getNamePokemon1PLayer2();
        String attack2 = "";

        /**
         * recorremos el hashmap de jugasdores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si hay coincidencias en la clave, se mete en la condicion
             */
            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos igual al valor del hashmap
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                /**
                 * hacemos un for con el array
                 */
                for (int i = 0; i < pokemons.size(); i++) {
                    /**
                     * iniciamos una variable de tipo pokemon que es igual al tamaño
                     */
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    /**
                     * si encuentra el nombre del pokemon se mete en la condicion
                     */
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        /**
                         * lo indicamos
                         */
                        pokemon = (PokemonProperties) pokemons.get(i);
                        /**
                         * iniciamos una variable de ataques pokemon igual a la posicion 1 del array
                         */
                        AttacksPokemons attacks = pokemon.getAttacks()[1];
                        /**
                         * obtenemos el nombre
                         */
                        attack2 = attacks.getName();
                        break;
                    }
                }

            }
        }
        /**
         * devolvemos el nombre del ataque
         */
        return attack2;
    }
    /**
     * metodo para poner el nombre del ataque 3 que hará el pokemon en el text area de batalla del jugador 2
     * @return el nombre del tercer ataque
     */
    public static String getNameAttack3PokemonPLayer2(){
        /**
         * iniciamos una variable para encontrar el alias del jugador 2 en el hashmap
         */
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        /**
         * iniciamos una variable de tipo string igual a un metodo que nos da el nombre del pokemon en batalla
         */
        String namePokemonToLook = getNamePokemon1PLayer2();
        String attack3 = "";

        /**
         * recorremos el hashmap de jugasdores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si hay coincidencias en la clave, se mete en la condicion
             */
            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos igual al valor del hashmap
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                /**
                 * hacemos un for con el array
                 */
                for (int i = 0; i < pokemons.size(); i++) {
                    /**
                     * iniciamos una variable de tipo pokemon que es igual al tamaño
                     */
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    /**
                     * si encuentra el nombre del pokemon se mete en la condicion
                     */
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        /**
                         * lo indicamos
                         */
                        pokemon = (PokemonProperties) pokemons.get(i);
                        /**
                         * iniciamos una variable de ataques pokemon igual a la posicion 2 del array
                         */
                        AttacksPokemons attacks = pokemon.getAttacks()[2];
                        /**
                         * obtenemos el nombre
                         */
                        attack3 = attacks.getName();
                        break;
                    }
                }

            }
        }
        /**
         * devolvemos el nombre del ataque
         */
        return attack3;
    }
    /**
     * metodo para poner el nombre del ataque 4 que hará el pokemon en el text area de batalla del jugador 2
     * @return el nombre del cuarto ataque
     */
    public static String getNameAttack4PokemonPLayer2(){
        /**
         * iniciamos una variable para encontrar el alias del jugador 1 en el hashmap
         */
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        /**
         * iniciamos una variable de tipo string igual a un metodo que nos da el nombre del pokemon en batalla
         */
        String namePokemonToLook = getNamePokemon1PLayer2();
        String attack4 = "";

        /**
         * recorremos el hashmap de jugasdores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si hay coincidencias en la clave, se mete en la condicion
             */
            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos igual al valor del hashmap
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                /**
                 * hacemos un for con el array
                 */
                for (int i = 0; i < pokemons.size(); i++) {
                    /**
                     * iniciamos una variable de tipo pokemon que es igual al tamaño
                     */
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    /**
                     * si encuentra el nombre del pokemon se mete en la condicion
                     */
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        /**
                         * lo indicamos
                         */
                        pokemon = (PokemonProperties) pokemons.get(i);
                        /**
                         * iniciamos una variable de ataques pokemon igual a la posicion 3 del array
                         */
                        AttacksPokemons attacks = pokemon.getAttacks()[3];
                        /**
                         * obtenemos el nombre
                         */
                        attack4 = attacks.getName();
                        break;
                    }
                }

            }
        }
        /**
         * devolvemos el nombre del ataque
         */
        return attack4;
    }


    /**
     * metodo para poner el nombre del pokemon 1  para cambiarlo del jugador 2
     * @return el nombre del pokemon
     */
    public static String getNamePokemon1ToChangePLayer2(){
        String namePokemon1Player2 = "";
        /**
         * iniciamos variables iguales al path del pokemon a cambiar
         */
        String namePokemonChange = DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconPokemon1();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonChange.lastIndexOf('/');
        namePokemon1Player2 = namePokemonChange.substring(lastIndex + 1, namePokemonChange.lastIndexOf('.'));


        return namePokemon1Player2;
    }

    /**
     * metodo para poner el nombre del pokemon 2  para cambiarlo del jugador 2
     * @return el nombre del pokemon
     */
    public static String getNamePokemon2ToChangePLayer2(){
        String namePokemon2Player2 = "";
        /**
         * iniciamos variables iguales al path del pokemon en a cambiar
         */
        String namePokemonChange = DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconPokemon2();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonChange.lastIndexOf('/');
        namePokemon2Player2 = namePokemonChange.substring(lastIndex + 1, namePokemonChange.lastIndexOf('.'));


        return namePokemon2Player2;
    }


    /**
     * metodo para poner el nombre del pokemon 3  para cambiarlo del jugador 2
     * @return el nombre del pokemon
     */
    public static String getNamePokemon3ToChangePLayer2(){
        String namePokemon3Player2 = "";
        /**
         * iniciamos variables iguales al path del pokemon a cambiar
         */
        String namePokemonChange = DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconPokemon3();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonChange.lastIndexOf('/');
        namePokemon3Player2 = namePokemonChange.substring(lastIndex + 1, namePokemonChange.lastIndexOf('.'));


        return namePokemon3Player2;
    }

    /**
     * metodo para saber el nombre del pokemon rival, el cual recibirá el ataque
     * @return el nombre del pokemon rival
     */
    public static String KnowTheNameOfTheOpposingPokemon(){
        String namePokemon1Player1 = "";
        /**
         * iniciamos variables iguales al path del pokemon en batalla
         */
        String namePokemonInBattle = ButtonInterfaceCombat.getPathPokemonBattlePlayer1();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonInBattle.lastIndexOf('/');
        namePokemon1Player1 = namePokemonInBattle.substring(lastIndex + 1, namePokemonInBattle.lastIndexOf('.'));


        return namePokemon1Player1;

    }

    /**
     * metodo para obtener el tipo del ataque 1 del pokemon en batalla del jugador 2
     * @param namePokemonInBattle el nombre del pokemon en batalla
     * @return el nombre dle tipo
     */
    public static String getTypeAttack1PokemonInBattlePlayer2(String namePokemonInBattle) {
        /**
         * iniciamos variables, una es el tipo y otra el nombre del primer ataque
         */
        String type = "";
        String attack1 = ButtonInterfaceAttacks.getAttack1Player2().getText();


        /**
         * recorremos con un for el array de objetos de pokemons
         */
        for (Object pokemonObj : MethosInterfaceSelectionPokemon.getPokemonsPLayer2()) {

            /**
             * iniciamos un string igual al nombre de los pokemons que vayqan saliendo
             */
            PokemonProperties pokemon = (PokemonProperties) pokemonObj;
            String nameToLookFor = pokemon.getName();


            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (nameToLookFor.equalsIgnoreCase(namePokemonInBattle)) {

                /**
                 * hacemos un for con los ataques del pokemon
                 */
                for (AttacksPokemons attack : pokemon.getAttacks()) {

                    /**
                     * si algun nombre de sus ataques coincide con el del boton, se mete en la condicion
                     */
                    if (attack1.equalsIgnoreCase(attack.getName())) {

                        /**
                         * el tipo será igual al tipo del ataque
                         */
                        type = attack.getType();
                        break;
                    }
                }

                break;
            }
        }
        return type;
    }

    /**
     * metodo para obtener el tipo del ataque 2 del pokemon en batalla del jugador 2
     * @param namePokemonInBattle el nombre del pokemon en batalla
     * @return el nombre del tipo
     */
    public static String getTypeAttack2PokemonInBattlePlayer2(String namePokemonInBattle) {
        /**
         * iniciamos variables, una es el tipo y otra el nombre del segundo ataque
         */
        String type = "";
        String attack2 = ButtonInterfaceAttacks.getAttack2PLayer2().getText();


        /**
         * recorremos con un for el array de objetos de pokemons
         */
        for (Object pokemonObj : MethosInterfaceSelectionPokemon.getPokemonsPLayer2()) {

            /**
             * iniciamos un string igual al nombre de los pokemons que vayqan saliendo
             */
            PokemonProperties pokemon = (PokemonProperties) pokemonObj;
            String nameToLookFor = pokemon.getName();


            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (nameToLookFor.equalsIgnoreCase(namePokemonInBattle)) {

                /**
                 * hacemos un for con los ataques del pokemon
                 */
                for (AttacksPokemons attack : pokemon.getAttacks()) {

                    /**
                     * si algun nombre de sus ataques coincide con el del boton, se mete en la condicion
                     */
                    if (attack2.equalsIgnoreCase(attack.getName())) {

                        /**
                         * el tipo será igual al tipo del ataque
                         */
                        type = attack.getType();
                        break;
                    }
                }

                break;
            }
        }
        return type;
    }

    /**
     * metodo para obtener el tipo del ataque 3 del pokemon en batalla del jugador 2
     * @param namePokemonInBattle el nombre del pokemon en batalla
     * @return el nombre dle tipo
     */
    public static String getTypeAttack3PokemonInBattlePlayer2(String namePokemonInBattle) {
        /**
         * iniciamos variables, una es el tipo y otra el nombre del tercer ataque
         */
        String type = "";
        String attack3 = ButtonInterfaceAttacks.getAttack3Player2().getText();


        /**
         * recorremos con un for el array de objetos de pokemons
         */
        for (Object pokemonObj : MethosInterfaceSelectionPokemon.getPokemonsPLayer2()) {

            /**
             * iniciamos un string igual al nombre de los pokemons que vayqan saliendo
             */
            PokemonProperties pokemon = (PokemonProperties) pokemonObj;
            String nameToLookFor = pokemon.getName();


            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (nameToLookFor.equalsIgnoreCase(namePokemonInBattle)) {

                /**
                 * hacemos un for con los ataques del pokemon
                 */
                for (AttacksPokemons attack : pokemon.getAttacks()) {

                    /**
                     * si algun nombre de sus ataques coincide con el del boton, se mete en la condicion
                     */
                    if (attack3.equalsIgnoreCase(attack.getName())) {

                        /**
                         * el tipo será igual al tipo del ataque
                         */
                        type = attack.getType();
                        break;
                    }
                }

                break;
            }
        }
        return type;
    }

    /**
     * metodo para obtener el tipo del ataque 4 del pokemon en batalla del jugador 2
     * @param namePokemonInBattle el nombre del pokemon en batalla
     * @return el nombre del tipo
     */
    public static String getTypeAttack4PokemonInBattlePlayer2(String namePokemonInBattle) {
        /**
         * iniciamos variables, una es el tipo y otra el nombre del primer ataque
         */
        String type = "";
        String attack4 = ButtonInterfaceAttacks.getAttack4Player2().getText();


        /**
         * recorremos con un for el array de objetos de pokemons
         */
        for (Object pokemonObj : MethosInterfaceSelectionPokemon.getPokemonsPLayer2()) {

            /**
             * iniciamos un string igual al nombre de los pokemons que vayqan saliendo
             */
            PokemonProperties pokemon = (PokemonProperties) pokemonObj;
            String nameToLookFor = pokemon.getName();


            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (nameToLookFor.equalsIgnoreCase(namePokemonInBattle)) {

                /**
                 * hacemos un for con los ataques del pokemon
                 */
                for (AttacksPokemons attack : pokemon.getAttacks()) {

                    /**
                     * si algun nombre de sus ataques coincide con el del boton, se mete en la condicion
                     */
                    if (attack4.equalsIgnoreCase(attack.getName())) {

                        /**
                         * el tipo será igual al tipo del ataque
                         */
                        type = attack.getType();
                        break;
                    }
                }

                break;
            }
        }
        return type;
    }


}