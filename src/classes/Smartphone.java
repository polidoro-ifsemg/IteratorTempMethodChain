package classes;

public abstract class Smartphone {
    private String name;
    private Integer numberOfCores;
    private Integer numberOfRam;
    private Integer yearRelease;
    private boolean hasGraphicCard;
    private Smartphone superiorDevice;
    public abstract String verificarSuporte();

    public String canPlayGame(Game game) {
        if (this.getNumberOfRam() >= game.getRequiredNumberRam()) {
            return "O game roda a partir do device " + this.getName();
        }
        else {
            if (superiorDevice != null) {
                return superiorDevice.canPlayGame(game);
            }
            else
            {
                return "Sem device capaz de rodar";
            }
        }
    }
    public Integer getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(Integer yearRelease) {
        this.yearRelease = yearRelease;
    }

    public Smartphone getSuperiorDevice() {
        return superiorDevice;
    }

    public void setSuperiorDevice(Smartphone superiorDevice) {
        this.superiorDevice = superiorDevice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public Integer getNumberOfRam() {
        return numberOfRam;
    }

    public void setNumberOfRam(Integer numberOfRam) {
        this.numberOfRam = numberOfRam;
    }

    public boolean isHasGraphicCard() {
        return hasGraphicCard;
    }

    public void setHasGraphicCard(boolean hasGraphicCard) {
        this.hasGraphicCard = hasGraphicCard;
    }


}
