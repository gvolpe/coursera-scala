package com.gvolpe.week5

import com.gvolpe.week5._

object week5 {
  
  var mlf = MoreListsFunctions                    //> mlf  : com.gvolpe.week5.MoreListsFunctions.type = com.gvolpe.week5.MoreLists
                                                  //| Functions$@68f1e723
  
  var lista = List(3,6,23,54,33,12)               //> lista  : List[Int] = List(3, 6, 23, 54, 33, 12)
  mlf.last(lista)                                 //> res0: Int = 12
  mlf.init(lista)                                 //> res1: List[Int] = List(3, 6, 23, 54, 33)
  mlf.reverse(lista)                              //> res2: List[Int] = List(12, 33, 54, 23, 6, 3)
  
  mlf.removeAt(1, lista)                          //> res3: List[Int] = List(3, 23, 54, 33, 12)
  
  var sort = MergeSorting                         //> sort  : com.gvolpe.week5.MergeSorting.type = com.gvolpe.week5.MergeSorting$@
                                                  //| 26651f73
  sort.msort(lista)                               //> res4: List[Int] = List(3, 6, 12, 23, 33, 54)
  
  sort.genericmsort(lista)((x, y) => x < y)       //> res5: List[Int] = List(3, 6, 12, 23, 33, 54)
  var letters = List("a", "y", "x", "e", "r", "c", "g")
                                                  //> letters  : List[String] = List(a, y, x, e, r, c, g)
  sort.genericmsort(letters )((x, y) => x.compareTo(y) < 0)
                                                  //> res6: List[String] = List(a, c, e, g, r, x, y)
                                                   
  sort.msortWithOrdering(lista)(Ordering.Int)     //> res7: List[Int] = List(3, 6, 12, 23, 33, 54)
  sort.msortWithOrdering(letters)(Ordering[String])
                                                  //> res8: List[String] = List(a, c, e, g, r, x, y)
  // Implicit parameter
  sort.msortWithOrdering(lista)                   //> res9: List[Int] = List(3, 6, 12, 23, 33, 54)
}