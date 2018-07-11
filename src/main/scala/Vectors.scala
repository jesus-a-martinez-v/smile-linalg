import smile.math.Math._
import utils.Utils

object Vectors extends App {
  val x = c(1.0, 2.0, 3.0, 4.0)
  val y = c(4.0, 3.0, 2.0, 1.0)

  Utils.printVector(x, "X")
  Utils.printVector(y, "Y")
  println(s"norm(X): ${norm(x)}")
  println(s"dot(X, Y): ${dot(x, y)}")
  println(s"cov(X, Y): ${cov(x, y)}")
  println(s"distance(X, Y): ${distance(x, y)}")
  println(s"KullbackLeiblerDivergence(X, Y): ${KullbackLeiblerDivergence(x, y)}")
  println(s"JensenShannonDivergence(X, Y): ${JensenShannonDivergence(x, y)}")
  println(s"cor(X, Y): ${cor(x, y)}")
  println(s"spearman(X, Y): ${spearman(x, y)}")
  println(s"kendall(X, Y): ${kendall(x, y)}")

  unitize(x)
  Utils.printVector(x, "unitize(X)")
}
