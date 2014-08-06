package com.gvolpe.week3.lists

class Cons[T](val head: T, val tail: GenericList[T]) extends GenericList[T] {

  def isEmpty = false

  override def toString = "{" + head + "}" + tail.toString()

}