class Car {
    var model: String? = null // jer su var, zato su promjenjive
    var topSpeed = 200

    fun start(){
        println("Starting the $model")
    }

    fun drive(speed: Int){
        println("Driving at a speed of $speed")
    }
}