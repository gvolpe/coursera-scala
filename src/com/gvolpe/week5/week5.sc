package com.gvolpe.week5

import com.gvolpe.week5._

object week5 {
  
  var mlf = MoreListsFunctions                    //> mlf  : com.gvolpe.week5.MoreListsFunctions.type = com.gvolpe.week5.MoreLists
                                                  //| Functions$@787a1f99
  
  var lista = List(3,6,23,54,33,12)               //> lista  : List[Int] = List(3, 6, 23, 54, 33, 12)
  mlf.last(lista)                                 //> res0: Int = 12
  mlf.init(lista)                                 //> res1: List[Int] = List(3, 6, 23, 54, 33)
  mlf.reverse(lista)                              //> res2: List[Int] = List(12, 33, 54, 23, 6, 3)
  
  mlf.removeAt(1, lista)                          //> res3: List[Int] = List(23, 54, 33, 12)
}