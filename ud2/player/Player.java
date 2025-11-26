public class Player {
    // creamos os atributos de instancia
    public String username;
    public String password;
    public String email;
    // atributo de clase
    public static String games;
// creamos os metodos
public void Comprar(String nomeC){
  System.out.println("O xogo que estas comprando e: "+nomeC);
}
public void Vender(String nomeV){
     System.out.println("O xogo que estas vendendo e: "+nomeV);
}
public Player(){
   

}
 public Player(String username,String password,String email){
    this.username=username;
    this.password=password;
    this.email=email;
}






}
