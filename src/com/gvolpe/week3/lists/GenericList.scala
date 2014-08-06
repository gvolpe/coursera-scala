package com.gvolpe.week3.lists

trait GenericList[T] {

  def isEmpty: Boolean
  def head: T
  def tail: GenericList[T]

}
