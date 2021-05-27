import java.util.List;
// use List as it means we can use any type of list (hierarchy)
// gives maximum flexibility

public interface ISaveable {
    List<String> write();
    void read(List<String> vals);
}
