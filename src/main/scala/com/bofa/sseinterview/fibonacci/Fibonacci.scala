package com.bofa.sseinterview.fibonacci

trait Fibonacci {

  /**
   * In mathematics, the Fibonacci numbers are the numbers in the following integer sequence, called the Fibonacci sequence
   * and characterized by the fact that every number after the first two is the sum of the two preceding ones.
   * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
   * Implement a function to calculate the nth element of this series, so calculateNth(6) should return 8
   */
  def calculateNth(n: Int): Int

  /**
   * Implement a function to calculate the nth element of the Fibonacci series.
   * It should consume the least time to complete and be time-efficient.
   * @param n
   */
  def calculateNthTheMostTimeEfficient(n: Int): Int

  /**
   * Implement a function to calculate the nth element of the Fibonacci series.
   * It should consume the least space/memory/storage and be space-efficient.
   * @param n
   */
  def calculateNthTheMostSpaceEfficient(n: Int): Int

}
