valorSalario = float(input("Digite o salário: "))
valorBeneficio = float(input("Digite o benefício: "))

valorImposto = 0

if (valorSalario >= 0 and valorSalario <= 1100):
    valorImposto = 0.5 * valorSalario
elif (valorSalario >= 1100.01 and valorSalario <= 2500.00):
    valorImposto = 0.10 * valorSalario
else:
    valorImposto = 0.15 * valorSalario

saida  = valorSalario - valorImposto + valorBeneficio

print("VALOR ATUALIZADO DESCONTANDO O IMPOSTO É: ", saida)

print()
