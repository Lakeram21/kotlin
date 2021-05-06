class Area ( var base:Float,  var height:Float,  var area:Float){

    fun areaTri(){

        var result = 0.10f

        if (area == 0.0f){
            result = 0.5f * base * height
            println("Area of Triangle: $result")
        }

        //if base and area != 0 but height == 0
        if(base == 0.0f){
            result = (2.0f * area) / height
            println("Base of Triangle: $result")
        }

        if(height == 0.0f){
            result = (2.0f * area) / base
            println("Height of Triangle: $result")
        }
    }





}
