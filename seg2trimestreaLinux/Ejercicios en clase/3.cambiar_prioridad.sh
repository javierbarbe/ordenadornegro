: <<EOF
	script q te pida:

  - el nombre de la aplicacion a cambiar la prioridad. 
  - el valor de la bondad (comprobar q esta entre -19 y 20)
  - si quieres ejecutarla desde el principio con esa
   bondad o si se esta ya ejecutando cambiarsela:

	1. Lanzarla con esa bondad
	2. cambiar la bondad del proceso en ejecucion
	opcion_

EOF
clear
read -p "aplicacion a lanzar o a subir pri:_" ap
read -p "valor de la bondad:_" bon

# ------- aqui condicional if para comprobar valor $bon----
if test $bon -lt -19 -o $bon -gt 20
then
	echo "valor de la bondad invalido, entre -19 y 20"
	exit 0
fi
#----------------------------------------------------------

cat <<kk
	1. Lanzarla con esa bondad
	2. cambiar la bondad del proceso en ejecucion
kk

read -p "opcion:_" op

# -------- aqui condicional if para comprobar valor $op ---
if test $op -eq 1
then
   echo -e "\n\n\t ...lanzando la ap: $ap con bondad: $bon"
   nice -n $bon $ap
   ps -o pid,ppid,pri,ni,status,cmd -C $ap

elif test $op -eq 2
then
   echo -e "\n\n\t...cambiando bondad a la ap: $ap con $bon"
   renice -n $bon -p `pidof $ap`
   ps -o pid,ppid,pri,ni,status,cmd -C $ap

else
	echo "opcion incorrecta!!"
fi
#----------------------------------------------------------






