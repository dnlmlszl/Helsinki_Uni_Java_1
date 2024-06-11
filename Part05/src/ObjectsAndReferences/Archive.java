package ObjectsAndReferences;

import java.util.Objects;

public class Archive {
    private String name;
    private String id;
    public Archive(String name, String id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (compared == null || getClass() != compared.getClass()) return false;
        Archive archive = (Archive) compared;
        return Objects.equals(id, archive.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return String.format("%s: %s", id, name);
    }
}
