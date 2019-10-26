package lsp;

public class RolandGarrosCourt extends Court{

    @Override
    public void cutGrass() {
        throw new IllegalArgumentException("Tierra batida no tiene cesped que cortar");
    }
}
