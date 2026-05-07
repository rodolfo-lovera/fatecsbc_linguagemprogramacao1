public class Etapa3_Insumo {
    // ETAPA 1: Atributos privados (O Escudo)
    private String nome;
    private double quantidadeEmEstoque;
    private String unidadeMedida;

    // CONSTRUTOR: Etapa 2
    public Etapa3_Insumo(String nome, double quantidadeInicial, String unidade) {
        this.nome = nome;
        this.unidadeMedida = unidade;
        setQuantidadeEmEstoque(quantidadeInicial); // Usa a validação da Etapa 2
    }

    // ETAPA 2: Getters e Setters (Os Guardiões com Validação)
    public double getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setQuantidadeEmEstoque(double novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Erro: estoque não pode ser negativo.");
        }
        this.quantidadeEmEstoque = novaQuantidade;
    }

    // ETAPA 3: Método de Negócio (A Inteligência / Modelagem)
    /**
     * Tenta reduzir o estoque para uma produção.
     * 
     * @param valor quantidade a ser consumida
     * @return true se a operação foi realizada, false se não houver estoque
     *         suficiente
     */
    public boolean consumir(double valor) {
        // Lógica Atômica: Verifica e executa no mesmo lugar
        if (valor > this.quantidadeEmEstoque) {
            System.out.println("Alerta de Negócio: Insumo " + nome + " insuficiente!");
            return false;
        }

        // Altera o estado interno de forma segura
        this.quantidadeEmEstoque -= valor;
        return true;
    }
}
