import scala.io.StdIn._

object Actividad6 {
  def main(args: Array[String]): Unit = {
    println("-------------EJERCICIO 2-------------")
    var listaE2 = List("hola", "adios", "saludos", "palabra", "cantar")
    println(listaE2)
    var pal1 = readLine("Ingresa una primer palabra")
    var pal2 = readLine("Ingresa una segunda palabra")
    for(x<-0 to listaE2.length-1){
      if(listaE2(x).equalsIgnoreCase(pal1)){
        listaE2=listaE2.updated(x, pal2)
      }
    }
    println(listaE2)
    println("-------------EJERCICIO 4-------------")
    var listaE4 = List("hola", "adios", "saludos", "palabra", "cantar")
    val listaE4_2 = List("albar", "adios", "correr", "nadar", "cantar")
    println("Lista 1 "+listaE4)
    println("Lista 2 "+listaE4_2)
    for(x<-0 to listaE4.length-1){
      for(y<-0 to listaE4_2.length-1){
        if(listaE4(x).equals(listaE4_2(y))){
          listaE4=listaE4.updated(x, "")
        }
      }
    }
    println(listaE4)
    
    println("-------------EJERCICIO 6-------------")
    var listaE6 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(listaE6)
    
    def sumaAcumulada(l : List[Int]) : List[Int] = {
      var listaE6=l
      for(x<-1 to listaE6.length-1){
        listaE6=listaE6.updated(x, (listaE6(x-1)+listaE6(x)))
      }
      listaE6
    }
    println(sumaAcumulada(listaE6))
    
    println("-------------EJERCICIO 8-------------")
    var listaE8 = List(101, 22, 123, 321, 404, 525, 666, 1221, 789)
    println(listaE8)
    
    def capicuas(l : List[Int]): List[Int] = {
      var listaE8=l
      for(x<-1 to listaE8.length-1){
        if(!listaE8(x).toString().equals(listaE8(x).toString().reverse)){
          listaE8=listaE8.updated(x, 0)
        }
      }
      listaE8
    }
    println(capicuas(listaE8))
    
    println("-------------EJERCICIO 10-------------")
    var listaE10 = List(1, 1, 0, 1, 1, 1, 1, 0, 0, 1)
    println(listaE10)
    
    def empaquetar(l:List[Int], buscar:Int, repe:Int): List[Int]={
      var listaE10 = l
      var listaRes = List.empty[Int]
      var cont = 0
      var cont2 = 0
      for(x<-0 to listaE10.length-1){
        if(listaE10(x)==buscar){
          cont+=1
          if(cont==repe){
            for(x<-0 to cont){
              listaRes=listaRes:+buscar
              cont2+=1
            }
            cont+=0
          }
        }else{
          cont=0
        }
      }
      listaRes
    }
    println(empaquetar(listaE10, 1, 2))
    
    
    
  }//main
}