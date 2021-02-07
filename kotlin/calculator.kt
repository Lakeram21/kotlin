import com.sun.jdi.connect.Connector
import javax.print.attribute.IntegerSyntax
import java.util.Scanner




//thi is the amin function
fun main() {
    var go = true
    while(go){

        val reader = Scanner(System.`in`)
        //getting numbers from user
        println("Enter number: ")
        var num1: Int = reader.nextInt()
        println("Enter 2 number: ")
        val num2: Int = reader.nextInt()

        //create object of the Cal class
        val compute = Cal(num1, num2)

        println("Kotlin Calculator:What do you want to do with these numbers?")
        println("1. Add")
        println("2. Sub")
        println("3. Div")
        println("4. Multi")
        println("5. Press to do (Area of Triangle)")
        println("6. Done with app")

        //start the program with choices
        when (reader.nextInt()) {
            1 -> compute.add()
            2 -> compute.sub()
            3 -> compute.div()
            4 -> compute.multi()
            5 -> {
                println("Whats the base: ")
                var base: Float = reader.nextFloat()
                println(base)

                // getting height
                println("Whats the Height: ")
                var height: Float = reader.nextFloat()

                //getting area
                println("Whats the area: ")
                var area: Float = reader.nextFloat()

                //creating an object of Area
                val areaOfObject = Area(base, height, area)
                areaOfObject.areaTri()
            }
            6 -> go = false
        }
    }
}







