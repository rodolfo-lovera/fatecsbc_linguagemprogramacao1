public class Etapa2_Insumo {
    // ETAPA 1: Atributos privados (O Escudo)
    private double quantidadeEmEstoque;
    private String nome;
    private String unidadeMedida;

    // CONSTRUTOR: Etapa 2
    public Etapa2_Insumo(String nome, String unidade, double QuantidadeInicial) {
        this.nome = nome;
        this.unidadeMedida = unidade;
        setQuantidadeEmEstoque(QuantidadeInicial);
    }

    // Métodos da Etapa 2 (Os "Guardiões")
    public double getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Define a quantidade, mas impede valores negativos
     * 
     * @param novaQuantidade valor a ser definido
     * @throws IllegalArgumentException se a quantidade for negativa
     */
    public void setQuantidadeEmEstoque(double novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Erro: estoque não pode ser negativo.");
        }
        this.quantidadeEmEstoque = novaQuantidade;
    }
}
