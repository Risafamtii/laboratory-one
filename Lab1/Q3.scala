object DiskVolumeCalculator {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val volume = calculateVolume(radius)
    println(s"The volume of a disk with radius $radius is $volume")
  }

  def calculateVolume(radius: Double): Double = {
    math.Pi * radius * radius * radius *(4.0 / 3.0) 
  }
}
