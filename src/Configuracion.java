public class Configuracion{
    private static final String letrasMayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private static final String letrasMinusculas = "abcdefghijklmnñopqrstuvwxyz";
    private static final String mapaMinusculas = "efghijklmnñopqrstuvwxyzabcd";
    private static final String mapaMayusculas = "EFGHIJKLMNÑOPQRSTUVWXYZABCD";
    private String claveVigenere;

    public void setClaveVigenere(String clave){
        if(clave.isEmpty()){
            System.out.println(">ERROR. Clave no válida.");
            return;
        }
        for(var it : clave.toCharArray()){
            char a = it;
            if((a>='A' && a<='Z') || a=='Ñ') continue;
            else{
                System.out.println(">ERROR. Clave no válida.");
                return;
            }
        }
        claveVigenere = clave;
        System.out.println(">Clave establecida: " + claveVigenere);
    }

    //getters
    public String getLetrasMayusculas(){ return letrasMayusculas; }
    public String getLetrasMinusculas(){ return letrasMinusculas; }
    public String getMapaMayusculas(){ return mapaMayusculas; }
    public String getMapaMinusculas(){ return mapaMinusculas; }
    public String getClave(){ return claveVigenere; }

}
