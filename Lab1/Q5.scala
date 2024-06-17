object timeCalculator {
  def main(args: Array[String]): Unit = {
    val first = 2
    val second = 3
    val third = 2
    val easyPace = 8
    val tempo = 7

    val totalRunningTime = calculateTotalTime(first, second, third, easyPace, tempo)
    println(s"The total time taken is $totalRunningTime minutes")
  }

  def calculateTotalTime(first: Int, second: Int, third: Int, easyPace: Int, tempo: Int): Int = {
    first * easyPace + second * tempo + third * easyPace
  }
}
