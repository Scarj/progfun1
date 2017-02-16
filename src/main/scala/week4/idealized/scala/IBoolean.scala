package week4.idealized.scala

abstract class IBoolean {
  def ifThenElse[T](t: => T, e: => T): T

  def && (x: => IBoolean): IBoolean = ifThenElse(x, IFalse)
  def || (x: => IBoolean): IBoolean = ifThenElse(ITrue, x)
  def unary_! : IBoolean = ifThenElse(IFalse, ITrue)

  def == (x:IBoolean):IBoolean = ifThenElse(x, x.unary_!)
  def != (x:IBoolean):IBoolean = ifThenElse(x.unary_!, x)
  def < (x:IBoolean):IBoolean = ifThenElse(IFalse, x)

}

object ITrue extends IBoolean {
  override def ifThenElse[T](t: => T, e: => T): T = t
}

object IFalse extends IBoolean {
  override def ifThenElse[T](t: => T, e: => T): T = e
}
