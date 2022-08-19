from xml.etree.ElementTree import tostring


number = int(input("input number: "))
if number%2==0 : 
    oddOrEven = "even"
else :
    oddOrEven = "odd"
print(number,"is",oddOrEven,"number.")