#Dadas las horas trabajadas de 5 personas y la tarifa de pago 
#calcular el salario, y la sumatoria de todos los salarios.

# Inicializamos las variables
suma = 0

# Iteramos sobre 5 empleados
for i in range(1, 6):
    print(f'Salarios del empleado {i}:')
    
    # Pedimos las horas trabajadas y la tarifa por hora
    horas = int(input('Digite las horas trabajadas: '))
    tarifa = float(input('Digite la tarifa por hora: '))
    
    # Calculamos el salario
    salario = horas * tarifa
    
    # Mostramos el salario
    print(f'El salario es: ${salario:.2f}')
    
    # Acumulamos el salario en la suma total
    suma += salario
    
    # Espacio en blanco para separar los empleados
    print('')

# Mostramos la suma de todos los salarios
print(f'La suma de todos los salarios es: ${suma:.2f}')
