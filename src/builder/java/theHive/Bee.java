package builder.java.theHive;

/*************
 * Bee Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class creates a bee
 */

public class Bee implements BeeInterface {
    private String species;
    private String color1;
    private String name;
    private String role;
    private String hive;

    /**********
     * creates a bee.
     */
    public Bee() {

        species = "";
        color1 = "black";
        name = "";
        role = "";
        hive = "";

    }

    @Override
    public void setSpecies(String sp) {

        species = sp;

    }

    @Override
    public String getSpecies() {

        return species;
    }

    @Override
    public void setColor1(String clr) {

        color1 = clr;
    }

    @Override
    public String getColor1() {

        return color1;
    }

    @Override
    public String getRole() {

        return role;

    }

    @Override
    public void setRole(String rl) {

        role = rl;
    }

    @Override
    public String getName() {

        return name;

    }

    @Override
    public void setName(String nm) {

        name = nm;

    }

    @Override
    public String getHive() {

        return hive;
    }

    @Override
    public void setHive(String hv) {
        hive = hv;
    }

}
