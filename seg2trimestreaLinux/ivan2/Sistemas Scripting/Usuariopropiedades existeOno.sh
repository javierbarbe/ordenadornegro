: <<EOF
1º)	script que te pida el nombre de un usuario
	mostrar de los procesos de ese usuario estas opciones:
		-pid
		-ppid
		-prioridad
		-bondad
		-estado del proceso
		-uso de memoria
		-uso de cpu
		-tiempo de ejecucion
		-comando

2º)	script que compruebe si ese usuario EXISTE en el sistema si no existe, acabar script con mensaje de error
	fichero de usuarios: less /etc/passwd
EOF
#! /bin/bash
clear
usuario=alumnot
echo -e "\n\n\t\t VAMOS A MOSTRAR LA INFO DE: $usuario"
echo -e "\t\t----------------------------------------------"

ps -f -u $usuario
