package com.gvolpe.week3

object classes {
  val t1 = new NonEmpty(3, Empty, Empty)          //> t1  : com.gvolpe.week3.NonEmpty = {.3.}
  val t2 = t1 incl 4                              //> t2  : com.gvolpe.week3.IntSet = {.3{.4.}}
  
  t2 contains 3                                   //> res0: Boolean = true
  t2 contains 6                                   //> res1: Boolean = false
}