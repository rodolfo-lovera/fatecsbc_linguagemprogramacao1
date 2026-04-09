quantidade = int(input("Digite a quantidade em estoque: "))

if quantidade < 1:
    print("Status: estoque em falta")
elif quantidade < 5:
    print("AVISO: O estoque deste produto está baixo.")
else:
    print("Estoque ok.")