: <<EOF
	Este es nuestro primer script
	... empieza la magia ....     

 	Esto es para ver los procesos que tenemos en el sistema

	
EOF
#! /bin/bash
clear
echo "Informacion  de los procesos del sistema"
echo "----------------------------------------"
ps --no-headers -o euser,pid,ppid,pri,ni,status,time,cmd

usuario=alumnot
echo -e "\n\n VAMOS A MOSTRAR LOS PROCESOS DE : $usuario"
echo "---------------------------------------------------"

ps -f -u $usuario


