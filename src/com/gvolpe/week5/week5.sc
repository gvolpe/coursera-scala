package com.gvolpe.week5

import com.gvolpe.week5._

object week5 {
  
  var mlf = MoreListsFunctions                    //> mlf  : com.gvolpe.week5.MoreListsFunctions.type = com.gvolpe.week5.MoreLists
                                                  //| Functions$@1e397bcb
  
  var lista = List(3,6,23,54,33,12)               //> lista  : List[Int] = List(3, 6, 23, 54, 33, 12)
  mlf.last(lista)                                 //> res0: Int = 12
  mlf.init(lista)                                 //> res1: List[Int] = List(3, 6, 23, 54, 33)
  mlf.reverse(lista)                              //> res2: List[Int] = List(12, 33, 54, 23, 6, 3)
  
  mlf.removeAt(1, lista)                          //> res3: List[Int] = List(3, 23, 54, 33, 12)
  
  var sort = MergeSorting                         //> sort  : com.gvolpe.week5.MergeSorting.type = com.gvolpe.week5.MergeSorting$@
                                                  //| 347e5c86
  sort.msort(lista)                               //> res4: List[Int] = List(3, 6, 12, 23, 33, 54)
}