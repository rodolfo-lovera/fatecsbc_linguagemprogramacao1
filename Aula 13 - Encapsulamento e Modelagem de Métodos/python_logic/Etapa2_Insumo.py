class Etapa2_Insumo:
    def __init__(self, nome, quantidade, unidade):
        # Atributos com __ iniciam o "Name Mangling", dificultando o acesso externo direto.
        self.__nome = nome 
        self.__unidade = unidade
        # PONTO CHAVE: Aqui não usamos __quantidade. Ao atribuir a self.quantidade, 
        self.quantidade = quantidade 

    # O símbolo @ é um DECORADOR. Ele "embrulha" sua função para dar a ela superpoderes.
    
    @property 
    def quantidade(self):
        """
        MÉTODO GETTER: Transforma a chamada de um método em um acesso de atributo.
        O usuário do código digita: print(insumo.quantidade)
        O Python executa: return self.__quantidade
        """
        return self.__quantidade

    @quantidade.setter
    def quantidade(self, valor):
        """
        MÉTODO SETTER: Intercepta a tentativa de mudar o valor.
        O usuário do código digita: insumo.quantidade = -5
        O Python executa: esta função, que dispara o ValueError.
        """
        if valor < 0:
            # Lançar exceções é a forma correta de travar estados inválidos no MVP.
            raise ValueError("Quantidade de insumo inválida (negativa).")
        
        # Se passar pela validação, o dado é guardado no atributo privado real.
        self.__quantidade = valor