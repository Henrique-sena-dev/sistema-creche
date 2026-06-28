public class E_ExercicioCarro {
  
  private String modelo;
  private int ano;
  private boolean ignicao;

  public void setModelo( String modeloCarro){
    this.modelo = modeloCarro;

  }

  public String getModelo(){
    return modelo;
  }


  public void setAno(int anoCarro){
    this.ano = anoCarro;

  }
  public int getAno(){
    return ano;
  }
  
   public void setIgnicao( boolean ligarCarro){
    this.ignicao = ligarCarro;
   }
   public boolean getIgnicao(){
    return ignicao;
   }
   
  
  
  public void status(){
    System.out.println("===== informações =====");
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println("Carro ligado: " + getIgnicao());
  } 

  
  
  






}
