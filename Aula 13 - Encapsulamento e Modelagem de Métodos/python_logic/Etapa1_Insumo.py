class Etapa1_Insumo:
    def __init__(self, nome, quantidade, unidade):
        """
        Inicializa o insumo com atributos protegidos por convenção.
        O uso de __ dificulta o acesso acidental externo.
        """
        self.__nome = nome
        self.__quantidade = quantidade
        self.__unidade = unidade

# Tentativa de acesso que resultará em erro de atributo
# morango = Insumo("Morango", 10.0, "kg")
# print(morango.__quantidade) # Erro: AttributeError

