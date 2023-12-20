package team.unnamed.gui.item.skull;

public class SkullSkin {

    private final String signature;
    private final String value;
    private final String name;

    public SkullSkin(String signature, String value , String name) {
        this.signature = signature;
        this.value = value;
        this.name = name;
    }

    public String getSignature() {
        return signature;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SkullSkin{" +
                "signature='" + signature + '\'' +
                ", value='" + value + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
