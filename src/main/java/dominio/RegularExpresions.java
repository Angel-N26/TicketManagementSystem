package dominio;

import java.util.regex.Pattern;

/**
 * @author angel
 **/
public interface RegularExpresions {
    Pattern EMAIL = Pattern.compile("[a-zA-Z0-9]*@[a-z]*.(com|es)");
    
    Pattern TLF = Pattern.compile("[0-9]{9}");
    
    Pattern DNI = Pattern.compile("[0-9]{8}[A-Z]");
    
    Pattern NUMERO = Pattern.compile("[0-9]+");
    
    Pattern CIF = Pattern.compile("G[0-9]{8}");
    
    Pattern CCPP = Pattern.compile("[0-9]{5}");
    
    Pattern DOUBLE = Pattern.compile("[0-9]+.[0-9]+");
    
    Pattern PISO = Pattern.compile("[0-9]+[A-Z]");
    
    Pattern DIRECCION = Pattern.compile("C/[a-zA-Z]*,[0-9]*,[0-9]{5},[[a-zA-Z]*],[[a-zA-Z]*]");
}