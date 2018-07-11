import smile.math.Math._
import smile.math.matrix.{DenseMatrix, matrix}
import utils.Utils

import scala.util.Random

object Matrices extends App {
  val a: DenseMatrix = matrix(
    c(Array.fill(3)(Random.nextDouble): _*),
    c(Array.fill(3)(Random.nextDouble): _*),
    c(Array.fill(3)(Random.nextDouble): _*)
  )

  val B = Array(
    Array.fill(3)(Random.nextDouble),
    Array.fill(3)(Random.nextDouble),
    Array.fill(3)(Random.nextDouble))

  val b = matrix(B)

  Utils.printMatrix(a, "A")
  Utils.printMatrix(b, "B")
  Utils.printMatrix(a.add(b), "A + B")
  Utils.printMatrix(a.mul(b), "A * B")
  Utils.printMatrix(a.sub(b), "A - B")
  Utils.printMatrix(a.div(b), "A / B")
  Utils.printMatrix(a.transpose(), "A.t")
  Utils.printMatrix(a.inverse(), "A^-1")

  println("--- Decomposition ---")
  println("SVD")

  val svdA = a.svd()
  Utils.printMatrix(svdA.getS, "S(A)")
  Utils.printMatrix(svdA.getU, "U(A)")
  Utils.printMatrix(svdA.getV, "V(A)")

  println("Eigen")

  val eigenA = a.eigen()
  Utils.printMatrix(eigenA.getD, "D(A)")
  Utils.printMatrix(eigenA.getEigenVectors, "eigen vectors of A")
  Utils.printVector(eigenA.getEigenValues, "Eigen values of A")
  Utils.printVector(eigenA.getImagEigenValues, "Image eigen values of A")
  Utils.printVector(eigenA.getRealEigenValues, "Real eigen values of A")

  println("QR")

  val qrA = a.qr()
  Utils.printMatrix(qrA.getQ, "Q(A)")
  Utils.printMatrix(qrA.getR, "R(A)")

  println("Cholesky")

  val choleskyA = a.cholesky()
  Utils.printMatrix(choleskyA.getL, "L(A)")
}
