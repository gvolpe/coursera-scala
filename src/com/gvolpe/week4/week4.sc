package com.gvolpe.week4

import com.gvolpe.week3._

object week4 {
  MyList()                                        //> res0: com.gvolpe.week3.lists.GenericList[Unit] = {()}{Nil}
  MyList(1,3)                                     //> res1: com.gvolpe.week3.lists.GenericList[Int] = {1}{3}{Nil}
  MyList(4)                                       //> res2: com.gvolpe.week3.lists.GenericList[Int] = {4}{Nil}
  
  //def assertAllPos[S <: IntSet](r: S): S = Empty
  def assertAllPos(r: IntSet): IntSet = Empty     //> assertAllPos: (r: com.gvolpe.week3.IntSet)com.gvolpe.week3.IntSet
  
  // Peano numbers (natural numbers)
  Zero                                            //> res3: com.gvolpe.week4.Zero.type = Zero
  new Succ(Zero)                                  //> res4: com.gvolpe.week4.Succ = One
  var dos = new Succ(new Succ(Zero))              //> dos  : com.gvolpe.week4.Succ = Two
  var tres = new Succ(new Succ(new Succ(Zero)))   //> tres  : com.gvolpe.week4.Succ = Tree
  var cinco = tres + dos                          //> cinco  : com.gvolpe.week4.Nat = Five
  var seis = tres + tres                          //> seis  : com.gvolpe.week4.Nat = Six
  var nueve = seis + tres                         //> nueve  : com.gvolpe.week4.Nat = Nine
  var doce = seis + seis                          //> doce  : com.gvolpe.week4.Nat = Natural number not found
}