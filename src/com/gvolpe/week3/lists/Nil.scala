package com.gvolpe.week3.lists

class Nil[T] extends GenericList[T] {

  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")

}