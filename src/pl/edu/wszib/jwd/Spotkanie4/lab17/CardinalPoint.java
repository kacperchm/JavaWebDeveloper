package pl.edu.wszib.jwd.Spotkanie4.lab17;

public enum CardinalPoint {
    N("North","Północ"),
    S("South","Południe"),
    E("East","Wschód"),
    W("West","Zachód"),
    NE("North East","Północny Wshód"),
    NW("North West","Północny Zachód"),
    SE("South East", "Południowy Wschód"),
    SW("South West", "Południowy Zachód");

    private String englishVersion;
    private String polishVersion;

    CardinalPoint(String englishVersion, String polishVersion) {
        this.englishVersion = englishVersion;
        this.polishVersion = polishVersion;
    }

    public String getEnglishVersion() {
        return englishVersion;
    }

    public String getPolishVersion() {
        return polishVersion;
    }

    @Override
    public String toString() {
        return "CardinalPoint{" +
                "englishVersion='" + englishVersion + '\'' +
                ", polishVersion='" + polishVersion + '\'' +
                '}';
    }
}
