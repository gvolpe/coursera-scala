package com.gvolpe.week4

import com.gvolpe.week3._

object week4 {
  MyList()                                        //> res0: com.gvolpe.week3.lists.GenericList[Unit] = {()}{Nil}
  MyList(1,3)                                     //> res1: com.gvolpe.week3.lists.GenericList[Int] = {1}{3}{Nil}
  MyList(4)                                       //> res2: com.gvolpe.week3.lists.GenericList[Int] = {4}{Nil}
  
  //def assertAllPos[S <: IntSet](r: S): S = Empty
  def assertAllPos(r: IntSet): IntSet = Empty     //> assertAllPos: (r: com.gvolpe.week3.IntSet)com.gvolpe.week3.IntSet
}