package classes;

public class SamsungSmartphone extends Smartphone {
    @Override
    public String verificarSuporte() {
        if (this.getYearRelease() >= 2018) {
            return "Possui suporte da fabricante";
        }
        else {
            return "Aparelho sem suporte";
        }
    }
}
