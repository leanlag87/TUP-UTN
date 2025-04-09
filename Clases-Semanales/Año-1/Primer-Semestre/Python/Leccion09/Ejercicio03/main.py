#Leer 10 números e imprimir cuantos son positivos, cuantos negativos y cuantos neutros. 
if __name__ == '__main__':
	num = int()
	i = int()
	conteopositivo = int()
	conteonegativo = int()
	conteoneutro = int()
	conteopositivo = 0
	conteonegativo = 0
	conteoneutro = 0
	for i in range(1,11):
		print(i,". Digite un numero: ")
		num = int(input())
		if num==0:
			conteoneutro = conteoneutro+1
		else:
			if num>0:
				conteopositivo = conteopositivo+1
			else:
				conteonegativo = conteonegativo+1
	print("La cantidad de positivos es: ",conteopositivo)
	print("La cantidad de negativos es: ",conteonegativo)
	print("La cantidad de neutros es: ",conteoneutro)