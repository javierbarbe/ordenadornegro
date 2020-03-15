#!/bin/bash
:<<EOF
	script control estado de un servicio por systemd
	te ha de pedir el nombre de un servicio y mostrar el menu:

		ADMIN SERVICIOS
		---------------
		1.Arrancar un servicio
		2.Parar un servicio
		3.Ver el fichero de configuracion de un servicio
		4.Ver Dependencias de un servicio
		5.Ver el ESTADO de un servicio
		6. ---SALIR---
		
EOF
opcion=0
while test $opcion -ne 6
do
	clear
	
	echo -e "\t\t\t ADMIN SERVICIOS"
	echo -e "\t\t\t ---------------"
	echo -e "\t\t\t 1.Arrancar un servicio"
	echo -e "\t\t\t 2.Parar un servicio"
	echo -e "\t\t\t 3.Ver el fichero de configuracion de un servicio"
	echo -e "\t\t\t 4.Ver Dependencias de un servicio"
	echo -e "\t\t\t 5.Ver el ESTADO de un servicio"
	echo -e "\t\t\t 6. ---SALIR---"

	read -p "Opcion_" opcion
	read -p "nombre del servicio..." serv
	case $opcion in
		1) systemctl start $serv.service ;;
		2) systemctl stop $serv.service ;;
		3) systemctl cat $serv.service ;;
		4) systemctl list-dependencies $serv.service;;
		5) systemctl status $serv.service ;;
	esac
	read  -n 1 -p "......pulsa una tecla para continuar....." tecla
done











