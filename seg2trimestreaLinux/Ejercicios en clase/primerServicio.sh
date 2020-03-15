: <<EOF
	Mi primer servicio . . .
EOF
#!/bin/bash

while true
do
 	case "$1" in 
		"start")
			#.....lazo servicio  con parametros 
				# $0 = nombre del script del servicio

		#$$  dice el pid del comando actual que se esta ejecutando 
				/etc/init.d/$0
				;;
				"stop")
					# paro el servicio...
					## El pid del script del servicio
						kill -s SIGSTOP $$
					;;
					"status")
				if pidof $0 
					then 
						echo "servicio ejecutandose "
					else 
						echo "servicio parado"
			fi
			;;
		*)
 			echo "uso: ~0 start|stop|status"
				;;

done

