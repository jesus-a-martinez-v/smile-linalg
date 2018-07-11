package utils

import smile.math.matrix.DenseMatrix

object Utils {
  def printMatrix(m: DenseMatrix, name: String): Unit =
    println(s"$name: \n$m")

  def printVector(vector: Array[Double], name: String): Unit =
    println(s"$name: ${vector.mkString("[", ", ", "]")}")
}
