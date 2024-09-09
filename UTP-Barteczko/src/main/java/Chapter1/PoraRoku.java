package Chapter1;

public enum PoraRoku {
    ZIMA("Zimno jest, może padać śnieg",5),
    WIOSNA("zakwita roślinność", 2),
    LATO("może być ciepło, ale niekoniecznie", 3),
    JESIEŃ("jest chłodno, często pada deszcz",2);

    private String opis;
    private int liczbaMiesiecy;

    private PoraRoku(String opis, int liczbaMiesiecy){
        this.opis = opis;
        this.liczbaMiesiecy = liczbaMiesiecy;
    }

    public String getOpis() { return opis; }
    public int getLiczbaMiesiecy() {return liczbaMiesiecy;}

}
