package ClassDiagrams.Saveable;

public interface Saveable {
    void save();
    void delete();
    void load(String address);
}
