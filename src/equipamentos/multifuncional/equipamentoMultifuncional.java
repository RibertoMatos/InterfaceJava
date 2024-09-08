package equipamentos.multifuncional;

import equipamentos.copiadora.copiadora;
import equipamentos.digitalizadora.digitalizadora;
import equipamentos.impressora.impressora;

public class equipamentoMultifuncional implements impressora, copiadora, digitalizadora{
    public void imprimir() {
        // Implementação do método
        System.out.println("Imprimindo multifuncional");
    }
    public void digitalizar() {
    // Implementação do método
    System.out.println("Dizitalizando multifuncional");
    }
    public void copiar() {
        // Implementação do método
        System.out.println("Copiando multifuncional");
    }
}