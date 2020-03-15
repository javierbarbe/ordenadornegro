var letras="abcdefghijklmnñopqrstuvwxyz"
var numeros="1234567890"
var mayus="AQWERTYUIOPSDFGHJKLÑZXCVBNM"
var simbolos="!·$%&/()=?¿^*¨Ç_:;|@#~~€¬{}[]\ "
function revisaCont(){

    var contra= document.getElementById('pass1').value;
    var ok=1;
    if (contra.length>=8){
    for(var i=0; i<contra.length; i++){
        var car= contra.charAt(i);
        //alert(car);
        if(letras.indexOf(car)==-1 ){   // && && 
            alert('minuscilas ??');
            ok=0;
        } else{
            if (numeros.indexOf(car)==-1 ){ 
            alert ('numeros??');
            document.getElementById('pass1').style.backgroundColor="red";
            ok=0;
            }
            else{ 
                if(simbolos.indexOf(car)==-1 ){
                    alert('simbolo???');
                    ok=0;
                    document.getElementById('pass1').style.backgroundColor="red";
                }else{
                    if( mayus.indexOf(car)==-1){
                        alert('mayusculas??');
                        ok=0;
                    document.getElementById('pass1').style.backgroundColor="red";

                    }
                }
            }
            // if(simbolos.indexOf(car)!=-1 && mayus.indexOf(car)!=-1){
            //     alert('todo comprobado');
            // } else{ ok=0;}
        } 
    } alert(ok);
} else{alert(' tu contraseña es demasiado corta '+ contra.length);
document.getElementById('pass1').style.backgroundColor="red";}
}

function comparaCont(){
    var contra= document.getElementById('contra').value;
    var contra2=document.getElementById('repiteContra').value;
    if(contra!=contra2){
        alert('las contraseñas no coinciden');
        document.getElementById('repiteContra').value="";
        document.getElementById('repiteContra').style.backgroundColor="red";
    }
}

