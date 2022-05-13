precio = int(input("Ingrese montodeventa "))
igv= 0
if(precio >= 2000 ):
  igv=precio*0.1
  totalpagar =igv +precio
  print('IGV ', igv)
  print('montototal a pagar: ', totalpagar)
elif(precio >= 1000):
  igv=precio*0.05
  totalpagar =igv +precio
  print('IGV ', igv)
  print('montototal a pagar: ', totalpagar)
else:
  igv=precio*0.02
  totalpagar =igv +precio
  print('IGV ', igv)
  print('montototal a pagar: ', totalpagar)