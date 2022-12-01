package com.bofa.sseinterview.basic

trait Fold {

  /**
   * See the original foldLeft implementation below:
   *
   * ``def foldLeft[B](z: B)(op: (B, A) => B): B = {
   *   var acc = z
   *   var these: LinearSeq[A] = coll
   *   while (!these.isEmpty) {
   *     acc = op(acc, these.head)
   *     these = these.tail
   *    }
   *   acc
   * }``
   *
   * Write your own version of foldLeft function and avoid using mutable vars.
   **/
  def foldLeft[A, B](list: Seq[A], z: B)(op: (B, A) => B): B

}
