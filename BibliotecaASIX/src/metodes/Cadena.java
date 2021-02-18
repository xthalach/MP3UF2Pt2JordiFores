/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**
 *
 * @author xThalach
 */
public class Cadena {
    
    /**
     * Aquet metode el que fa es que el salta les paraules de una frase respecte un index.
     */
    public static String juntaSaltejats(int num, String... caracters){
        //Declaració de variables
        int salts = num;
        String resultat = "",frase="";
        int contaCaracters=0;
        
        //Cas especial si, el index que ens introdueixen es mes petit de 1 retornem 0.
        if(num<1){
            resultat = "0";
            return resultat;
        }  
        // Cas especial si, el index es major o igual que 1 pero no hi ha cap frase retornem 0.
        if(num>=1 && caracters.length==0){
            resultat="0";
            return resultat;
        }
        
        
        // Cos del metode, bucle for per anar saltant les paraules respecte l'index.
        // He afegit que si una paraula era null si l'index cau sobre aquesta paraula retorne null.
        for (int i =0; i < caracters.length;i+=num) {
            if(caracters[i]==null) caracters[i]="null";
            contaCaracters += caracters[i].trim().length();
            frase += caracters[i];
            
        }
        
        return contaCaracters+":"+frase;
    }
    
}
