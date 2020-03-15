#! /bin/bash
clear
echo "este es el valor del primer parametro $1"
echo "este es el valor del segundo parametro $2"
echo "este es el valor del tercero parametro $3"
echo "este es el valor del cuarto parametro $4"
echo "este es el valor del quinto parametro $5"
echo "este es el valor del sexto parametro $6"
echo "este es el valor del septimo parametro $7"
echo "este es el valor del octavo parametro $8"
echo "este es el valor del noveno parametro $9"

shift #...corro los parametros a la izquierda, pierdo uno
echo -e "\n\n .....hacemos shift . . l. . ."
echo -e "\n\n el mundo numero de parametros es : $# \n\n" 
echo "este es el valor del primer parametro $1"
echo "este es el valor del segundo parametro $2"
echo "este es el valor del tercero parametro $3"
echo "este es el valor del cuarto parametro $4"
echo "este es el valor del quinto parametro $5"
echo "este es el valor del sexto parametro $6"
echo "este es el valor del septimo parametro $7"
echo "este es el valor del octavo parametro $8"
echo "este es el valor del noveno parametro $9"
