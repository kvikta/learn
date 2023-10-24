fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    println("Circle Area: ${circle.area()}")
    println("Circle Perimeter: ${circle.perimeter()}")
    println("Rectangle Area: ${rectangle.area()}")
    println("Rectangle Perimeter: ${rectangle.perimeter()}")
}

open class Shape {
    open fun area(): Double {
        return 0.0
    }
    open fun perimeter(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    override fun perimeter():Double {
        return (Math.PI*2*radius)
    }
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
    override fun perimeter(): Double {
        return 2*(width + height)
    }
}


