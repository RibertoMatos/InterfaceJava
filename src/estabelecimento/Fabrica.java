package estabelecimento;

import equipamentos.copiadora.copiadora;
import equipamentos.digitalizadora.digitalizadora;
import equipamentos.impressora.impressora;
import equipamentos.multifuncional.equipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        equipamentoMultifuncional em = new equipamentoMultifuncional();
        impressora impressora = em;
        digitalizadora digitalizadora = em;
        copiadora copiadora = em;
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
