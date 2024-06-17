object DiskAreaCalculator {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = calculateArea(radius)
    println(s"The area of a disk with radius $radius is $area")
  }

  def calculateArea(radius: Double): Double = {
    math.Pi * radius * radius
  }
}
