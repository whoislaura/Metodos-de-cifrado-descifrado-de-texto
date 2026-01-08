public class metodosDeCifrado {


    public metodosDeCifrado(){
        this.letrasMayusculas = "ABCDEFGHIJKLMÑNOPQRSTUVWXYZ";
        this.letrasMinusculas = "abcdefghijklmñnopqrstuvwxyz";
        this.mapaMinusculas = "efghijklmñnopqrstuvwxyzabcd";
        this.mapaMayusculas = "EFGHIJKLMÑNOPQRSTUVWXYZABCD";
    }
    //cifrar la frase por sustitucion
    public String cifrarxSust(String frase){
        String ans = "";
        for(int i = 0; i < frase.length(); i++){
            String a = String.valueOf(frase.charAt(i));
            if(a.equals(" ")){
                ans += " ";
            }
            if(letrasMayusculas.contains(a)){
                ans += mapaMayusculas.charAt(i);
            }
            else{
                ans += mapaMinusculas.charAt(i);
            }
        }
        return ans;
    }
    //descifrar la frase por sustitucion
    public String descifrarxSust(String frase){
        String ans = "";
        for(int i = 0; i < frase.length(); i++){
            String a = String.valueOf(frase.charAt(i));
            if(a.equals(" ")){
                ans += " ";
            }
            if(letrasMayusculas.contains(a)){
                ans += letrasMayusculas.charAt(i);
            }
            else{
                ans += letrasMinusculas.charAt(i);
            }
        }
        return ans;
    }
    //adaptar la clave dada por el usuario
    public String adaptarClave(String clave, String frase){
        String nueva = "";
        int it = 0;
        for(int i = 0; i < frase.length(); i++){
            String a = String.valueOf(frase.charAt(i));
            if(a.equals(" ")){
                nueva += " ";
                continue;
            }
            if(letrasMayusculas.contains(a)){
                nueva += String.valueOf(clave.charAt(it % clave.length())).toUpperCase();
            }
            else{
                nueva += String.valueOf(clave.charAt(it % clave.length())).toLowerCase();
            }
        }
        return nueva;
    }
    //cifrar la frase por vigenere
    public String cifrarxClave(String clave, String frase){
        String nueva = adaptarClave(clave, frase);
        String ans = "";
        for(int i = 0; i < frase.length(); i++){
            String a = String.valueOf(frase.charAt(i));
            if(a.equals(" ")){
                ans += " ";
                continue;
            }
            if(letrasMayusculas.contains(a)){
                int pos = (letrasMayusculas.indexOf(frase.charAt(i)) + letrasMayusculas.indexOf(nueva.charAt(i)) % letrasMayusculas.length());
                ans += letrasMayusculas.charAt(pos);
            }
            else{
                int pos = (letrasMinusculas.indexOf(frase.charAt(i)) + letrasMinusculas.indexOf(nueva.charAt(i)) % letrasMinusculas.length());
                ans += letrasMinusculas.charAt(pos);
            }
        }
        return ans;
    }
    //descifrar la frase por vigenere
    /*
    public String descifrarxClave(String frase){
        String nueva = adaptarClave(clave, frase);
        String ans = "";
        for(int i = 0; i < frase.length(); i++){
            String a = String.valueOf(frase.charAt(i));
            if(a.equals(" ")){
                ans += " ";
                continue;
            }
            if(letrasMayusculas.contains(a)){
                int pos = (letrasMayusculas.indexOf(frase.charAt(i)) + letrasMayusculas.indexOf(nueva.charAt(i)) % letrasMayusculas.length());
                ans += letrasMayusculas.charAt(pos);
            }
            else{
                int pos = (letrasMinusculas.indexOf(frase.charAt(i)) + letrasMinusculas.indexOf(nueva.charAt(i)) % letrasMinusculas.length());
                ans += letrasMinusculas.charAt(pos);
            }
        }
        return ans;
    }*/
}
