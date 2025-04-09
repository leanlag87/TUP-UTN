#Calcular la suma de los "N" primeros números
if __name__ == '__main__':
	n = int()
	suma = int()
	i = int()
	print("Digite la cantidad de numeros a sumarse: ", end="")
	n = int(input())
	suma = 0
	for i in range(1,n+1):
		suma = suma+i
	print("La suma es: ",suma)