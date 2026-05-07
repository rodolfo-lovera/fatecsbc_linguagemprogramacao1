/* Classe que representa um insumo na sorveteria (ex: leite condensado,
 * morango).
 * O encapsulamento aqui protege o nome e a quantidade contra alterações
 * diretas.
 */

public class Etapa1_Insumo {
    private String nome;
    private double quantidadeEmEstoque;
    private String unidadeMedida;

    public Etapa1_Insumo(String nome, double quantidade, String unidade) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidade;
        this.unidadeMedida = unidade;
    }
}
