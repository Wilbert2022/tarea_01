import math
signo = str(input("Ingrese signo"))
if(signo == 'p' or signo == 'P' or signo =='%' ):
  raizModulo = int(input("ingrese numero: "))
else:
  num1 = int(input("Ingrese numero 1: "))
  num2 = int(input("Ingrese numero 2: "))
if(signo == '*' ):
  resultado= num1*num2
  print('La multiplicacion es: ',resultado )
elif(signo == '+'):
  resultado= num1+num2
  print('La suma es: ',resultado )
elif(signo == '-'):
  resultado= num1-num2
  print('La resta es: ',resultado )
elif(signo == '/'):
  resultado= num1/num2
  print('La division es: ',resultado )
elif(signo == '^'):
  resultado= num1**num2
  print('La division es : ',resultado )
elif(signo == '%'):
  resultado= num1**num2
  print('La division es: ',resultado )
elif(signo == 'p' or signo == 'P'):
  resultado= math.sqrt(raizModulo)
  print('La raiz cuadrada es: ',resultado )
elif(signo == '%'):
  resultado= raizModulo%2
  print('El Modulo es: ',resultado )
   