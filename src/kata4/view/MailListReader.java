package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    public static List<Mail> read (String fileName) throws FileNotFoundException{
        List<Mail> lista = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String ar ="@";
        
        try {
        archivo = new File (fileName);
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);

         // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null)
            System.out.println(linea);
            if(linea.contains(ar)){
                lista.add(new Mail(linea));
           }
        }
        catch(IOException e){
            e.printStackTrace();
        }finally{
            try{                    
                if( null != fr ){   
                    fr.close();     
                }                  
            }catch (IOException e2){ 
                 e2.printStackTrace();
            }
        }
        return lista;
    }
    
}
