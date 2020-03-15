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
EOF
clear
if test "$USERNAME" = "root"
then
	
	read -p "introduce nombre usuario:_" $USERNAME
	id -u $USERNAME
	id -g $USERNAME
	grep -e "root:$SHELL" /etc/passwd
	grep  "root:" /etc/shadow	
	

else
	$USERNAME -ne "root"
	echo "....no eres root, no puedes ejecutar este script"
	exit 0
fi

