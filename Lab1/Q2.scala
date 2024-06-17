object TempFahrenheit {
  def main(args: Array[String]): Unit = {

    val tempInC = 35

    val tempInF = convertToFahrenheit(tempInC)

    println(s"The temperature in Fahrenheit of $tempInC°C is $tempInF°F")
  }

  def convertToFahrenheit(tempInC: Double): Double = {

    tempInC * 1.8000 + 32.00
  }
}
