: <<EOF
	1º)
	script q te pida el nombre de un usuario
 	mostrar de los procesos de ese usuario
	estas opciones:
		-pid
		-ppid
		-prioridad
		-bondad
		-estado del proceso
		-uso de memoria
		-uso de cpu
		-tiempo de ejecucion
		-comando

	2º) comprobar si ese usuario EXISTE en el sistema
	si no existe, acabar script con mensaje de error
	  fichero de usuarios:  /etc/passwd
EOF
#! /bin/bash
clear
read -p "usuario del que quieres ver procesos:_" us
ps -o pid,ppid,pri,ni,status,pmem,cputime,stime,cmd -u $us
 












