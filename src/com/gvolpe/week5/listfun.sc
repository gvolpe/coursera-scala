package com.gvolpe.week5

object listfun {
  var nums = List(2, 6, -5, 32, -87, -4, 18)      //> nums  : List[Int] = List(2, 6, -5, 32, -87, -4, 18)

  // List filter
  nums filter (x => x > 0)                        //> res0: List[Int] = List(2, 6, 32, 18)
  nums filterNot (x => x > 0)                     //> res1: List[Int] = List(-5, -87, -4)
  // Pair of Lists with filter and filterNot results
  nums partition (x => x > 0)                     //> res2: (List[Int], List[Int]) = (List(2, 6, 32, 18),List(-5, -87, -4))
  
  // Longest prefix with predicated true
  nums takeWhile (x => x > 0)                     //> res3: List[Int] = List(2, 6)
  nums dropWhile (x => x > 0)                     //> res4: List[Int] = List(-5, 32, -87, -4, 18)
  // Pair of Lists with takeWhile and dropWhile results
  nums span (x => x > 0)                          //> res5: (List[Int], List[Int]) = (List(2, 6),List(-5, 32, -87, -4, 18))
}