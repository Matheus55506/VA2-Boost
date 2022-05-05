package Alunos 

  public class Aluno {
    public String nome;
    public int nota1,nota2;

    public double calcularMedia(){
      return (nota1+nota2) / 2;
    }

    public String getSituacao() {
      double media = this.calcularMedia();

      if(media >= 7) {
        return "Aprovado";
      }else{
        return "reprovado  "
      }
    }
  }