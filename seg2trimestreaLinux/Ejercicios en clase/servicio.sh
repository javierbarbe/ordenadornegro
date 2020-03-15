:<<EOF
	Script control estado de un servicio por systemd
	te ha de pedir el nombre de un servicio y mostrar el menu:

		Admin Servicios
	------------------------------
		1º Arrancar un servicio
		2º Parar un servicio
		3º Ver el fichero de configuracion de un servicio
		4º Ver dependecias de un servicio
		5º Ver el estado de un servicio
		6º -----Salir-----
Si ponemos  && podemos poner un mensaje si la funcion se cumple seara un true por tanto lo mostrara y si ponemos despues  || mostrara el 
mensaje despues que sera el false

a la hora d eponer un error 2>errores.txt el dos signfica que es el codigo de errores, y si lo pones varias veces se va pisando
y su pongo 2>> esos >> indican que se guardan todos los mensajes no los sobrescribe
se pueden poner mensajes de error cuando es null el hueco 2>/dev/null 
el uno es para la salida normal del comando.
el 0 entrada de datos
y del 3 al 9 son reservados

ls -l  asdjaosndoasi 1>./salida.txt  2>./errores.txt
(Si el comando existe ira por el 1º valor ya que seria true y si es false ira por el 2 que es el de rrores

ls -l  asdjaosndoasi 1>./salida.txt  2>&1  Esto se pone para decir que vayan los dos a la misma ubicacion, asi podremos guardar el dato
true y el dato false


EOF
opc=0;
while test $opc -ne 6
do	
echo -e "	Admin Servicios
	------------------------------
		1º Arrancar un servicio
		2º Parar un servicio
		3º Ver el fichero de configuracion de un servicio
		4º ver dependecias de un servicio
		5º Ver el estado de un servicio
		6º -----Salir-----"

read -p "opcion" opc

# if test -eq 6 && then exit 0
test $opc -eq 6 && { echo "...nos vamos..."; exit 0;}
read -p "Diga el servicio" servicio 
case $opc in
	1) systemctl start $servicio.service;;
	2) systemctl stop $servicio.service 2>/dev/null || echo " el servicio no existe";;
	3) systemctl cat $servicio.service || echo"el servicio no existeeeeee" ;;
	4) systemctl list-dependencies $servicio.service;;
	5) systemctl status $servicio.service;;
	
esac
  sleep 5s
done
