public class Curso {

  String nome;
  Disciplina discipina1;
  Disciplina discipina2;
  Disciplina discipina3;

  float calcularMedia() {
    float media = (disciplina1.notaFinal
                  +disciplina2.notafinal1
                  +disciplina3,notaFinal)/3;
    return media;
  }
  boolean estaAprovado()  {
    boolean estaAprovado = false;
    if(calcularMedia() >= 60){
      estaAprovado = true;
    }else{
      estaAprovado = false;
      }
    return estaAprovado;
  }

float notaPorDisciplina(int id) {
  return of;
}

  
}