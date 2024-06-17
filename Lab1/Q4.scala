object wholesaleCalculator {
  def main(args: Array[String]): Unit = {
    val oneBook = 24.95
    val discount = 0.40
    val shippingFirst50 = 3.00
    val additionalShipping = 0.75
    val numberOfCopies = 60

    val totalCost = calculateTotalWholesaleCost(oneBook, discount, shippingFirst50, additionalShipping, numberOfCopies)
    println(s"The total wholesale cost for $numberOfCopies copies is Rs. $totalCost")
  }

  def calculateTotalWholesaleCost(oneBook: Double, discount: Double, shippingFirst50: Double, additionalShipping: Double, numberOfCopies: Int): Double = {
    val discountedPrice = oneBook * (1 - discount)
    val totalBookCost = discountedPrice * numberOfCopies

    val additionalCopies = if (numberOfCopies > 50) numberOfCopies - 50 else 0
    val totalShippingCost = shippingFirst50 + (additionalShipping * additionalCopies)

    totalBookCost + totalShippingCost
  }
}
