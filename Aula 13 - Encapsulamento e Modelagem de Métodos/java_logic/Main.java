public class Main {
    // O segredo está nos colchetes: String args
    public static void main(String args) {

        // 1. Criando o objeto (Estado Inicial)
        // Certifique-se que o nome da classe é exatamente o que você salvou (Insumo ou
        // Etapa3_Insumo)
        Etapa3_Insumo morango = new Etapa3_Insumo("Morango", 10.0, "kg");

        // 2. Testando o Getter
        System.out.println("Estoque inicial: " + morango.getQuantidadeEmEstoque());

        // 3. Testando a validação (O "caminho de erro")
        try {
            System.out.println("Tentando definir estoque negativo...");
            morango.setQuantidadeEmEstoque(-5.0);
        } catch (IllegalArgumentException e) {
            // O tratamento de erro confirma que o encapsulamento protegeu o dado
            System.out.println("Sucesso no teste de segurança: " + e.getMessage());
        }

        // 4. Testando o Método de Negócio (O "caminho feliz")
        if (morango.consumir(4.0)) {
            System.out.println("Consumo de 4kg realizado com sucesso.");
            System.out.println("Novo estoque: " + morango.getQuantidadeEmEstoque() + "kg");
        }
    }
}