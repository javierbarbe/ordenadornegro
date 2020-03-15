#!/bin/bash
: <<EOF
	script que comprueba si eres root antes de ejecutarlo
	(ver variables de entorno $UID o $USERNAME) si no eres 
	root mostrar mensaje de error y salir...
	
	te tiene que pedir el nombre de una cuenta y te debe mostrar:
		- directorio personal: .........
		- uid: ...........
		- gid: ...........
		- shell : ...........
		- hashpass: ..........

cut -d ":" -f 1,2,3 /etc/passwd
grep -e "^$usuario"
EOF
clear
if test "$USERNAME" = "root"
then
	read -p "introduce nombre usuario:_" usuario

else
	echo "....no eres root, no puedes ejecutar este script"
	exit 0
fi
