abstract class Shape (){
    abstract fun perimeter(): Float
    abstract fun area() : Float
}
 class PryamougolniTriangle (var katet1: Float, var katet2: Float, var gipotenuza: Float ): Shape()
{
    override fun perimeter(): Float {
        return katet1 +  katet2 + gipotenuza;
    }

    override fun area(): Float{
        return (katet1 * katet2)/2
    }
}
 class Circle (var chislopi: Float, var radius: Float): Shape(){
    override fun area(): Float{
        return chislopi * radius * radius;
    }

     override fun perimeter(): Float {
         return 2 * chislopi * radius;
     }

}
 class Quadrate(var storona: Float): Shape(){
    override fun perimeter(): Float {
        return 4 * storona;
    }

    override fun area(): Float {
        return storona * storona;
    }
}
fun main(){
    val pryamougolniTriangle:PryamougolniTriangle = PryamougolniTriangle(6.1F,8.3F , 9.1F)
    val circle:Circle = Circle(3.14F, 5F)
    val quadrate:Quadrate = Quadrate(7F)
    pryamougolniTriangle.perimeter()
    pryamougolniTriangle.area()
    circle.area()
    quadrate.perimeter()
    println("Perimeter pryamougolnjgoTriangle =  ${pryamougolniTriangle.perimeter()}")
    println("Area pryamougolnjgoTriangle = ${pryamougolniTriangle.area()} ")
    println("Perimeter circle = ${circle.perimeter()} ")
    println("Area Circle = ${circle.area()}")
    println("Perimeter quadrate = ${quadrate.perimeter()}")
    println("Area quadrate = ${quadrate.area()}")


}

