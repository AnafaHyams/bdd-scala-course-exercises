package classwork_adapter_pattern;

/**
 * @author Evgeny Borisov
 */
public class Table implements Costable {
    @Override
    public int cost() {
        return 20;
    }
}
