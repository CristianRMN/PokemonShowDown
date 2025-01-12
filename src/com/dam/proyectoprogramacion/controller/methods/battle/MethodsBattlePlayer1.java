package com.dam.proyectoprogramacion.controller.methods.battle;

import com.dam.proyectoprogramacion.view.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.controller.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.view.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.model.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.model.pokemon.PokemonProperties;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * clase con los metodos para la batalla del jugador 1
 * @author cristian
 * @version v3.0
 */
public class MethodsBattlePlayer1 {

    /**
     * metodo que recorre un hashmap y busca el primer pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con la imagen del pokemon seleccionado
     */
    public static String putImageAttackButtonPlayer1(HashMap<String, ArrayList<Object>> players) {

        String pathImagePokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + ".png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }



//---------------------------------xAtaque numero 1 ---------------------------//

    /**
     * metodo para pasar el path con el icono del primer ataque del pokemon del jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack1PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[0];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();
                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return chooseAttackIconPokemon1Player1(type.toLowerCase());

    }

    /**
     * metodo para escoger el icono del ataque según el tipo
     *
     * @param type el tipo del ataque
     * @return el path del icono
     */
    public static String chooseAttackIconPokemon1Player1(String type) {

        String pathType = "";
        switch (type) {

            case "bicho":
                pathType = "imagenes/bicho.png";
                break;
            case "siniestro":
                pathType = "imagenes/siniestro.png";
                break;
            case "dragon":
                pathType = "imagenes/dragon.png";
                break;
            case "electrico":
                pathType = "imagenes/electrico.png";
                break;
            case "lucha":
                pathType = "imagenes/lucha.png";
                break;
            case "hada":
                pathType = "imagenes/hada.png";
                break;
            case "fuego":
                pathType = "imagenes/fuego.png";
                break;
            case "volador":
                pathType = "imagenes/volador.png";
                break;
            case "fantasma":
                pathType = "imagenes/fantasma.png";
                break;
            case "planta":
                pathType = "imagenes/planta.png";
                break;
            case "tierra":
                pathType = "imagenes/tierra.png";
                break;
            case "hielo":
                pathType = "imagenes/hielo.png";
                break;
            case "normal":
                pathType = "imagenes/normal.png";
                break;
            case "veneno":
                pathType = "imagenes/veneno.png";
                break;
            case "psiquico":
                pathType = "imagenes/psiquico.png";
                break;
            case "roca":
                pathType = "imagenes/roca.png";
                break;
            case "acero":
                pathType = "imagenes/acero.png";
                break;
            case "agua":
                pathType = "imagenes/agua.png";
                break;

        }
        return pathType;
    }

    /**
     * metodo para establecer el nombre del primer ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack1PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[0];
                    /**
                     * almacenamos el nombre
                     */
                    name = attack.getName();
                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return name;

    }

    /**
     * Metodo para escoger el color del fondo del ataque del pokemon
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack1PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[0];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el color  según el tipo
         */
        return chooseColorAttacksPokemonPlayer1(type.toLowerCase());

    }

    /**
     * metodo para escoger el color de fondo del ataque 1 del pokemon en batalla
     *
     * @param type el tipo del ataque
     * @return el color correspondiente
     */
    public static Color chooseColorAttacksPokemonPlayer1(String type) {

        Color colorAttack = Color.BLUE;
        switch (type) {

            case "bicho":
                colorAttack = Color.GREEN.brighter();
                break;
            case "siniestro":
                colorAttack = Color.MAGENTA.darker();
                break;
            case "dragon":
                colorAttack = Color.BLUE.brighter();
                break;
            case "electrico":
                colorAttack = Color.YELLOW;
                break;
            case "lucha":
                colorAttack = Color.ORANGE;
                break;
            case "hada":
                colorAttack = Color.PINK;
                break;
            case "fuego":
                colorAttack = Color.RED;
                break;
            case "volador":
                colorAttack = Color.CYAN;
                break;
            case "fantasma":
                colorAttack = Color.MAGENTA.darker().darker();
                break;
            case "planta":
                colorAttack = Color.GREEN;
                break;
            case "tierra":
                colorAttack = Color.ORANGE.darker();
                break;
            case "hielo":
                colorAttack = Color.CYAN.brighter();
                break;
            case "normal":
                colorAttack = Color.GRAY.brighter();
                break;
            case "veneno":
                colorAttack = Color.PINK.darker();
                break;
            case "psiquico":
                colorAttack = Color.MAGENTA;
                break;
            case "roca":
                colorAttack = Color.GRAY.darker();
                break;
            case "acero":
                colorAttack = Color.GRAY;
                break;
            case "agua":
                colorAttack = Color.BLUE;
                break;

        }
        return colorAttack;
    }

//---------------------------------xAtaque numero 2 ---------------------------//

    /**
     * metodo para pasar el path con el icono del segundo ataque del pokemon del jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack2PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[1];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();
                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return chooseAttackIconPokemon1Player1(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del segundo ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack2PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[1];
                    /**
                     * almacenamos el nombre
                     */
                    name = attack.getName();
                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return name;

    }

    /**
     * Metodo para escoger el color del fondo del segundo del pokemon
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack2PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[1];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el color  según el tipo
         */
        return chooseColorAttacksPokemonPlayer1(type.toLowerCase());

    }


    //---------------------------------xAtaque numero 3 ---------------------------//

    /**
     * metodo para pasar el path con el icono del tercer ataque del pokemon del jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack3PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[2];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();
                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return chooseAttackIconPokemon1Player1(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del tercer ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack3PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[2];
                    /**
                     * almacenamos el nombre
                     */
                    name = attack.getName();
                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return name;

    }

    /**
     * Metodo para escoger el color del fondo del tercer del pokemon
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack3PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al segundo elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[2];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el color  según el tipo
         */
        return chooseColorAttacksPokemonPlayer1(type.toLowerCase());

    }

    //---------------------------------xAtaque numero 4 ---------------------------//

    /**
     * metodo para pasar el path con el icono del cuarto ataque del pokemon del jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack4PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[3];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();
                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return chooseAttackIconPokemon1Player1(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del cuarto ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack4PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[3];
                    /**
                     * almacenamos el nombre
                     */
                    name = attack.getName();
                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return name;

    }

    /**
     * Metodo para escoger el color del fondo del cuarto del pokemon
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack4PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al segundo elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[3];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el color  según el tipo
         */
        return chooseColorAttacksPokemonPlayer1(type.toLowerCase());

    }

    //-------------------------Cambios de Pokemon-------------------------//


    /**
     * metodo para obtener el path del icono del  pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getPathPokemon1Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el path del icono del pokemon
         */
        String pathIconPokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * almacenamos el path
                     */
                    pathIconPokemon = "imagenes/" + firstPokemon.getName().toLowerCase() + ".png";

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna el path con el icono del pokemon
         */
        return pathIconPokemon;

    }

    /**
     * metodo para obtener el nombre del primer pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getNamePokemon1Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del pokemon
         */
        String namePokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * almacenamos el nombre del pokemon
                     */
                    namePokemon = firstPokemon.getName();

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna el nombre del pokemon
         */
        return namePokemon;

    }

    /**
     * metodo para obtener el path del icono del  pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getPathPokemon2Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el path del icono del pokemon
         */
        String pathIconPokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al segundo elemento de la lista de pokemons
                     */
                    PokemonProperties secondPokemon = (PokemonProperties) pokemons.get(1);
                    /**
                     * almacenamos el path
                     */
                    pathIconPokemon = "imagenes/" + secondPokemon.getName().toLowerCase() + ".png";

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna el path con el icono del pokemon
         */
        return pathIconPokemon;

    }

    /**
     * metodo para obtener el nombre del segundo pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getNamePokemon2Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del pokemon
         */
        String namePokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al segundo elemento de la lista de pokemons
                     */
                    PokemonProperties secondPokemon = (PokemonProperties) pokemons.get(1);
                    /**
                     * almacenamos el nombre del pokemon
                     */
                    namePokemon = secondPokemon.getName();

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna el nombre del pokemon
         */
        return namePokemon;

    }

    /**
     * metodo para obtener el path del icono del  pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getPathPokemon3Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el path del icono del pokemon
         */
        String pathIconPokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties thirdPokemon = (PokemonProperties) pokemons.get(2);
                    /**
                     * almacenamos el path
                     */
                    pathIconPokemon = "imagenes/" + thirdPokemon.getName().toLowerCase() + ".png";

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna el path con el icono del pokemon
         */
        return pathIconPokemon;

    }

    /**
     * metodo para obtener el nombre del tercer pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getNamePokemon3Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del pokemon
         */
        String namePokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al tercer elemento de la lista de pokemons
                     */
                    PokemonProperties thirdPokemon = (PokemonProperties) pokemons.get(2);
                    /**
                     * almacenamos el nombre del pokemon
                     */
                    namePokemon = thirdPokemon.getName();

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna el nombre del pokemon
         */
        return namePokemon;

    }

    //-------------------------Pulsas un boton y cambias de pokemon-------------------------//


    //-------------------------Pulsas un boton y cambias EL path del pokemon 1-------------------------//


    /**
     * metodo para establecer el nuevo logo del pokemon al cambio
     * @return el nuevo nombre del icono del pokemon
     */

    public static String newPathIconPokemon1Player1() {
        String pathIcon = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * nuevo path
                     */
                    pathIcon = "imagenes/" + getNameOfThePokemonPlayer1Pokemon1().toLowerCase() + ".png";
                }

            }


        }


        /**
         * devolvemos el path
         */
     return pathIcon;
    }
         //-------------------------Cambio de características del ataque 1 del pokemon 1-------------------------//
    /**
     * metodo para poner el nuevo nombre del primer ataque del pokemon del jugador 1
     * @return el nuevo nombre del primer ataque
     */
    public static String newName1Attack1Pokemon1Player1() {
        String nameAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack1 = attakc1.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack1;
    }

    /**
     * metodo para cambiar el icono del ataque 1 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType1Attack1Pokemon1Player1() {
        String typeAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack1 = attakc1.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack1.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 1 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor1Attack1Pokemon1Player1() {
        String typeAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack1 = attakc1.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack1.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 2 del pokemon 1-------------------------//

    /**
     * metodo para poner el nuevo nombre del segundo ataque del pokemon del jugador 1
     * @return el nuevo nombre del segundo ataque
     */
    public static String newName2Attack2Pokemon1Player1() {
        String nameAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack2 = attakc2.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack2;
    }

    /**
     * metodo para cambiar el icono del ataque 2 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType2Attack2Pokemon1Player1() {
        String typeAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack2 = attakc2.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack2.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 2 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor2Attack2Pokemon1Player1() {
        String typeAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack2 = attakc2.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack2.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 3 del pokemon 1-------------------------//


    /**
     * metodo para poner el nuevo nombre del tercer ataque del pokemon del jugador 1
     * @return el nuevo nombre del tercer ataque
     */
    public static String newName3Attack3Pokemon1Player1() {
        String nameAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 2 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack3 = attakc3.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack3;
    }

    /**
     * metodo para cambiar el icono del ataque 3 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType3Attack3Pokemon1Player1() {
        String typeAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 2 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack3 = attakc3.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack3.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 3 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor3Attack3Pokemon1Player1() {
        String typeAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack3 = attakc3.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack3.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 4 del pokemon 1-------------------------//


    /**
     * metodo para poner el nuevo nombre del tercer ataque del pokemon del jugador 1
     * @return el nuevo nombre del cuarto ataque
     */
    public static String newName4Attack4Pokemon1Player1() {
        String nameAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 3 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack4 = attakc4.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack4;
    }

    /**
     * metodo para cambiar el icono del ataque 3 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType4Attack4Pokemon1Player1() {
        String typeAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 3 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack4 = attakc4.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack4.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 3 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor4Attack4Pokemon1Player1() {
        String typeAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack4 = attakc4.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack4.toLowerCase());
    }

    //-----------------------------xCambios para el pokemon 2 ---------------------//

    /**
     * metodo para establecer el nuevo logo del pokemon al cambio del jugador 1
     * @return el nuevo icono
     */
    public static String newPathIconPokemon2Player1() {
        String pathIcon = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * nuevo path
                     */
                    pathIcon = "imagenes/" + getNameOfThePokemonPlayer1Pokemon2().toLowerCase() + ".png";
                }

            }


        }


        /**
         * devolvemos el path
         */
        return pathIcon;
    }

    //-------------------------Cambio de características del ataque 1 del pokemon 2-------------------------//



    /**
     * metodo para poner el nuevo nombre del primer ataque del pokemon del jugador 1
     * @return el nuevo nombre del primer ataque
     */
    public static String newName1Attack1Pokemon2Player1() {
        String nameAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack1 = attakc1.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack1;
    }

    /**
     * metodo para cambiar el icono del ataque 1 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType1Attack1Pokemon2Player1() {
        String typeAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack1 = attakc1.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack1.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 1 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor1Attack1Pokemon2Player1() {
        String typeAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack1 = attakc1.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack1.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 2 del pokemon 2-------------------------//


    /**
     * metodo para poner el nuevo nombre del segundo ataque del pokemon del jugador 1
     * @return el nuevo nombre del segundo ataque
     */
    public static String newName2Attack2Pokemon2Player1() {
        String nameAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack2 = attakc2.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack2;
    }

    /**
     * metodo para cambiar el icono del ataque 2 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType2Attack2Pokemon2Player1() {
        String typeAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack2 = attakc2.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack2.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 2 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor2Attack2Pokemon2Player1() {
        String typeAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack2 = attakc2.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack2.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 3 del pokemon 2-------------------------//


    /**
     * metodo para poner el nuevo nombre del tercer ataque del pokemon del jugador 1
     * @return el nuevo nombre del tercer ataque
     */
    public static String newName3Attack3Pokemon2Player1() {
        String nameAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 2 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack3 = attakc3.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack3;
    }

    /**
     * metodo para cambiar el icono del ataque 3 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType3Attack3Pokemon2Player1() {
        String typeAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 2 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack3 = attakc3.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack3.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 3 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor3Attack3Pokemon2Player1() {
        String typeAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack3 = attakc3.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack3.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 4 del pokemon 2-------------------------//


    /**
     * metodo para poner el nuevo nombre del tercer ataque del pokemon del jugador 1
     * @return el nuevo nombre del cuarto ataque
     */
    public static String newName4Attack4Pokemon2Player1() {
        String nameAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 3 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack4 = attakc4.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack4;
    }

    /**
     * metodo para cambiar el icono del ataque 3 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType4Attack4Pokemon2Player1() {
        String typeAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 3 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack4 = attakc4.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack4.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 3 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor4Attack4Pokemon2Player1() {
        String typeAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon2())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack4 = attakc4.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack4.toLowerCase());
    }
    //---------------------cambio del 3º pokemon -------------------//

    /**
     * metodo para establecer el nuevo logo del pokemon al cambio del jugador 1
     * @return el nuevo icono
     */
    public static String newPathIconPokemon3Player1() {
        String pathIcon = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * nuevo path
                     */
                    pathIcon = "imagenes/" + getNameOfThePokemonPlayer1Pokemon3().toLowerCase() + ".png";
                }

            }


        }


        /**
         * devolvemos el path
         */
        return pathIcon;
    }

    //-------------------------Cambio de características del ataque 1 del pokemon 3-------------------------//


    /**
     * metodo para poner el nuevo nombre del primer ataque del pokemon del jugador 1
     * @return el nuevo nombre del primer ataque
     */
    public static String newName1Attack1Pokemon3Player1() {
        String nameAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack1 = attakc1.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack1;
    }

    /**
     * metodo para cambiar el icono del ataque 1 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType1Attack1Pokemon3Player1() {
        String typeAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack1 = attakc1.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack1.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 1 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor1Attack1Pokemon3Player1() {
        String typeAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack1 = attakc1.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack1.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 2 del pokemon 3-------------------------//


    /**
     * metodo para poner el nuevo nombre del segundo ataque del pokemon del jugador 1
     * @return el nuevo nombre del segundo ataque
     */
    public static String newName2Attack2Pokemon3Player1() {
        String nameAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack2 = attakc2.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack2;
    }

    /**
     * metodo para cambiar el icono del ataque 2 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType2Attack2Pokemon3Player1() {
        String typeAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack2 = attakc2.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack2.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 2 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor2Attack2Pokemon3Player1() {
        String typeAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack2 = attakc2.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack2.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 3 del pokemon 3-------------------------//


    /**
     * metodo para poner el nuevo nombre del tercer ataque del pokemon del jugador 1
     * @return el nuevo nombre del tercer ataque
     */
    public static String newName3Attack3Pokemon3Player1() {
        String nameAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 2 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack3 = attakc3.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack3;
    }

    /**
     * metodo para cambiar el icono del ataque 3 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType3Attack3Pokemon3Player1() {
        String typeAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 2 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack3 = attakc3.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack3.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 3 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor3Attack3Pokemon3Player1() {
        String typeAttack3 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc3 = pokemon1.getAttacks()[2];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack3 = attakc3.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack3.toLowerCase());
    }

    //-------------------------Cambio de características del ataque 4 del pokemon 3-------------------------//


    /**
     * metodo para poner el nuevo nombre del tercer ataque del pokemon del jugador 1
     * @return el nuevo nombre del cuarto ataque
     */
    public static String newName4Attack4Pokemon3Player1() {
        String nameAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 3 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack4 = attakc4.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack4;
    }

    /**
     * metodo para cambiar el icono del ataque 3 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType4Attack4Pokemon3Player1() {
        String typeAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 3 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack4 = attakc4.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack4.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 3 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor4Attack4Pokemon3Player1() {
        String typeAttack4 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon3())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc4 = pokemon1.getAttacks()[3];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack4 = attakc4.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack4.toLowerCase());
    }

    //-------------------------comprobacion para no poder cambiar a un pokemon que ya está en batalla-------------------------//



    /**
     * metodo que recorre un hashmap y busca el primer pokemon escogido por el jugador 1
     * despues devuelve la imagen del pokemon
     * @param players el hashmap de los jugadores
     * @return el path con la imagen del pokemon seleccionado
     */

    public static String putImagePokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {

        String pathImagePokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + "SP.png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }

    /**
     * metodo para establecer la nueva imagen del pokemon en batalla al cambio
     * @return la nueva imagen
     */

    public static String newImagePokemonInBattle1Player1() {
        String pathIcon = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * nuevo path
                     */
                    pathIcon = "imagenes/" + getNameOfThePokemonPlayer1Pokemon1().toLowerCase() + "SP.png";
                }

            }


        }
        return pathIcon;
    }


    /**
     * metodo para establecer la nueva imagen del pokemon en batalla al cambio
     * @return la nueva imagen
     */

    public static String newImagePokemonInBattle2Player1() {
        String pathIcon = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * nuevo path
                     */
                    pathIcon = "imagenes/" + getNameOfThePokemonPlayer1Pokemon2().toLowerCase() + "SP.png";
                }

            }


        }
        return pathIcon;
    }


    /**
     * metodo para establecer la nueva imagen del pokemon en batalla al cambio
     * @return la nueva imagen
     */

    public static String newImagePokemonInBattle3Player1() {
        String pathIcon = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1Pokemon1())) {

                    /**
                     * nuevo path
                     */
                    pathIcon = "imagenes/" + getNameOfThePokemonPlayer1Pokemon3().toLowerCase() + "SP.png";
                }

            }


        }
        return pathIcon;
    }

    //-----------------conseguir ataque, defensa y cantidad de poder de ataques del pokemon en batalla--------------------//

    /**
     * metodo para saber la cantidad de ataque del pokemon en batalla
     * @param namePokemon el nombre del pokemon en batalla
     * @return el valor del ataque
     */
    public static int getAmountAttackPokemonInBattlePlayer1(String namePokemon){

        /**
         * iniciamos la cantidad de ataue a 0
         */
        int amountAttack = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer1();

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
                 * asignamos el ataque
                 */
                amountAttack = pokemon.getAttack();
                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return amountAttack;
    }
    /**
     * metodo para saber el poder del ataque1 del pokemon en batalla del jugador 1
     * @param namePokemon el nombre del pokemon en batalla
     * @return el valor del ataque
     */
    public static int getPowerAttack1PokemonInBattlePlayer1(String namePokemon){

        /**
         * iniciamos la cantidad de ataque a 0
         */
        int powerAttack1 = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer1();

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
                 * iniciamos la variable de tipo ataque que es igual a la primera posicion
                 */
                AttacksPokemons attacks = pokemon.getAttacks()[0];
                /**
                 * recogemos el valor del ataque
                 */
                powerAttack1 = attacks.getPower();
                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return powerAttack1;
    }
    /**
     * metodo para saber el poder del ataque2 del pokemon en batalla del jugador 1
     * @param namePokemon el nombre del pokemon en batalla
     * @return el valor del ataque
     */
    public static int getPowerAttack2PokemonInBattlePlayer1(String namePokemon){

        /**
         * iniciamos la cantidad de ataque a 0
         */
        int powerAttack2 = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer1();

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
                 * iniciamos la variable de tipo ataque que es igual a la primera posicion
                 */
                AttacksPokemons attacks = pokemon.getAttacks()[1];
                /**
                 * recogemos el valor del ataque
                 */
                powerAttack2 = attacks.getPower();
                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return powerAttack2;
    }
    /**
     * metodo para saber el poder del ataque3 del pokemon en batalla del jugador 1
     * @param namePokemon el nombre del pokemon en batalla
     * @return el valor del ataque
     */
    public static int getPowerAttack3PokemonInBattlePlayer1(String namePokemon){

        /**
         * iniciamos la cantidad de ataque a 0
         */
        int powerAttack3= 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer1();

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
                 * iniciamos la variable de tipo ataque que es igual a la primera posicion
                 */
                AttacksPokemons attacks = pokemon.getAttacks()[2];
                /**
                 * recogemos el valor del ataque
                 */
                powerAttack3 = attacks.getPower();
                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return powerAttack3;
    }
    /**
     * metodo para saber el poder del ataque4 del pokemon en batalla del jugador 1
     * @param namePokemon el nombre del pokemon en batalla
     * @return el valor del ataque
     */
    public static int getPowerAttack4PokemonInBattlePlayer1(String namePokemon){

        /**
         * iniciamos la cantidad de ataque a 0
         */
        int powerAttack4 = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer1();

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
                 * iniciamos la variable de tipo ataque que es igual a la primera posicion
                 */
                AttacksPokemons attacks = pokemon.getAttacks()[3];
                /**
                 * recogemos el valor del ataque
                 */
                powerAttack4 = attacks.getPower();
                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return powerAttack4;
    }

    /**
     * metodo para saber la velocidad del pokemon en batalla del jugador 1
     * @param namePokemon el nombre del pokemon en batalla
     * @return el valor de la velocidad
     */
    public static int getSpeedPokemonInBattlePlayer1(String namePokemon) {

        /**
         * iniciamos la cantidad de ataque a 0
         */
        int speed = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer1();

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
                 * asignamos la velocidad
                 */
                speed = pokemon.getSpeed();
                break;
            }
        }
        return speed;
    }


    /**
     * metodo para obtener la defensa del pokemon rival en batalla
     * @param nameOpposingPokemon el nombre del pokemon en batalla
     * @return el valor de su defensa
     */
    public static int getDefenseOpposingPokemonInBattle(String nameOpposingPokemon){
        /**
         * iniciamos la cantidad de defensa a 0
         */
        int defense = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer2();

        /**
         * recorremos con un for el array de pokemons
         */
        for (int i = 0; i < pokemons.size(); i++) {

            PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);

            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (pokemon.getName().equalsIgnoreCase(nameOpposingPokemon)) {
                /**
                 * lo indicamos
                 */
                pokemon = (PokemonProperties) pokemons.get(i);

                /**
                 * almacenamos el valor de la defensa
                 */
                defense = pokemon.getDefense();

                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return defense;

    }

    /**
         * metodos para obtener el texto del boton de los pokemons
         * @return el texto de los pokemons
         */
    public static String getNameOfThePokemonPlayer1Pokemon1() {

        return ButtonInterfaceChangePokemonPlayer1.getPokemon1team().getText();
    }
    public static String getNameOfThePokemonPlayer1Pokemon2() {

        return ButtonInterfaceChangePokemonPlayer1.getPokemon2team().getText();
    }
    public static String getNameOfThePokemonPlayer1Pokemon3() {

        return ButtonInterfaceChangePokemonPlayer1.getPokemon3team().getText();
    }
}