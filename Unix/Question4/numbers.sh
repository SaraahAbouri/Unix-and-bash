# Saraah Abouri

#get two inputs X and Y 
read -p "Enter X:" x
read -p "Enter Y:" y

if [ $x == $y ]
then echo "X  is equal to Y"
  
elif [ $x -lt $y ]
then echo "X is less than Y"
else echo "Y is less than X"


fi