import math
from decimal import Decimal

# Como trabajar con el tipo "NaN" (Not a Number)
a = float("nan")
print(f"El valor de a es: {a}")

# Modulo math
a = float("nan")
print(f"Es NaN: {math.isnan(a)}")

# Modulo decimal
a = Decimal("nan")
print(f"Es NaN: {math.isnan(a)}")
