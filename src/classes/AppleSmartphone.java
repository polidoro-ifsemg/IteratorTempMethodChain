package classes;

public class AppleSmartphone extends Smartphone{
    @Override
    public String verificarSuporte() {
        if (this.getYearRelease() >= 2020) {
            return "Possui suporte da fabricante";
        }
        else {
            return "Aparelho sem suporte";
        }
    }
}
