: <<EOF
	script q te pida el nombre del proceso al q quieres
	mandar una señal, despues te muestra:

		   señal a mandar..
		1- SIGSTOP
		2- SIGKILL
		3- SIGTERM
		4- SIGUP
		  opcion_

	debes mandar la señal seleccionada al proceso
		
EOF
clear

read -p "Introduce nombre proceso a mandar señal:_" proc
cat <<kk
	   ------------------
	   señal a mandar....
	   ------------------
		1- SIGSTOP
		2- SIGKILL
		3- SIGTERM
		4- SIGUP
kk
read -p "introduce numero de opcion de señal a mandar_" opc

case $opc in
	1)    senal=SIGSTOP
		;;
	2)    senal=SIGKILL
		;;
	3)   senal=SIGTERM
		;;
	4)   senal=SIGUP
		;;
	*)
		echo -e "\n\n\t OPCION INVALIDA!!"
		exit 0;
esac
echo -e "\n\n\t...mandando señal $senal al proceso $proc con PID: `pidof $proc`"
kill -s $senal `pidof $proc`









