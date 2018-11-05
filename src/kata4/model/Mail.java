
package kata4.model;

public class Mail {
        private String mail;

    public Mail(String linea) {
        linea = mail;
    }
       
    public String getDomain(){
            String[] res = mail.split("@");
            String dominio=res[1];
            return dominio;
        }
    
}
