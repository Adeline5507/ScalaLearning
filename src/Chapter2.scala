

class Chapter2 {
  //过程，是没有返回值的函数，不用等号
  def countdown(n:Int){
    for(i <- (0 to n).reverse) Console.printf(i+"");
  }
  
  countdown(5);
  
  
  def unicodeProduct(str:String){
     var r = 1L;
     for(c <- str) r = r*c;
     printf("%d\n",r);
  }
  
  unicodeProduct("Hello");
  
  def unicodeProductWithoutLoop(str:String){
      var t = 1L
      str.foreach({t *= _});
      printf("%d\n",t);
  }
  unicodeProductWithoutLoop("Hello");
  
  def unicodeProductWithRecursion(str:String):Long = {
     if(str.length() == 1) str.charAt(0) else str.last * unicodeProductWithRecursion(str.substring(0, str.length()-1));
  }
  
  printf("%d\n",unicodeProductWithRecursion("Hello"));
  
  def powerWithRecursion(x:Int,n:Int):Long = {
    if(n==0) 1 
    else if(n<0) 1/powerWithRecursion(x,-n) 
    else if(n%2==1) x*powerWithRecursion(x,n-1) 
    else powerWithRecursion(x,n/2) * powerWithRecursion(x,n/2)
  }
  
  printf("%d\n",powerWithRecursion(2,11));
}