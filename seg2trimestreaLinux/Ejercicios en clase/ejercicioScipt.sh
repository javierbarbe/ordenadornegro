: <<ol

	script que te pida el nombre del proceso al que quieres mandar una señal, despues te 		muestra :
			Señal a mandar..		
		1- SIGSTOP
		2- SIGKILL
		3- SIGTERM
		4- SIGUP
			opcion_
	Debes mandar la señal seleccionada al proceso	
ol

read -p "Nombre del proceso a mandar la señal: " proc # las variables al ser declaradas van sin $
pid=`ps -o pid -C $proc --no-headers` # tambien podria ser pidof nombre

echo 		"----------------
		Señal a mandar..
		----------------		
		1- SIGSTOP
		2- SIGKILL
		3- SIGTERM
		4- SIGUP"
read -p "Introduce una opcion" opcion

case $opcion in
1)  ;;





cat 
