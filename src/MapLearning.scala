

class MapLearning {
  {
    val m = Map("macbook"->12000,"phone"->5000); 
    for((k,v)<-m) yield (k,v*0.9);
  }
  
  {
    //可变映射统计单词
    val m = new scala.collection.mutable.HashMap[String,Int]();
    val in = new java.util.Scanner(new java.io.File("c:\\tmp\\myfile.txt"));
    while(in.hasNext()){
      val key = in.next();
    	m.put(key, m.getOrElse(key, 0)+1);
    }
    
    for((k,v)<-m) Console.println(k+" "+v);
      
  }
  
   {
     //不可变映射
    var m = Map[String,Int]();
    val in = new java.util.Scanner(new java.io.File("c:\\tmp\\myfile.txt"));
    
    while(in.hasNext()){
      val key = in.next();
    	m = m + (key -> (m.getOrElse(key, 0)+1));
    }
    
    for((k,v)<-m) Console.println(k+" "+v);
      
  }
   
   
  {
    //sorted map
    var m = scala.collection.immutable.SortedMap[String,Int]();
    val in = new java.util.Scanner(new java.io.File("c:\\tmp\\myfile.txt"));
    
    while(in.hasNext()){
      val key = in.next();
    	m = m + (key -> (m.getOrElse(key, 0)+1));
    }
    
    for((k,v)<-m) Console.println(k+" "+v);
      
  }
  
  {
    // 与java 交互
    import scala.collection.JavaConversions.mapAsScalaMap;
    var m:scala.collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int];
    val in = new java.util.Scanner(new java.io.File("c:\\tmp\\myfile.txt"));
    
    while(in.hasNext()){
      val key = in.next();
      m = m +(key -> (m.getOrElse(key, 0)+1));
    }
    
    for((k,v)<-m) Console.println(k+" "+v);
      
  }
  
  {
    //链式映射
    var m = scala.collection.mutable.LinkedHashMap[String,Int]();
    m += ("Mondany" -> java.util.Calendar.MONDAY);
    m += ("Tuesday" -> java.util.Calendar.TUESDAY);
    m += ("Wednesday" -> java.util.Calendar.WEDNESDAY);
    m += ("Thursday" -> java.util.Calendar.THURSDAY);
    m += ("Friday" -> java.util.Calendar.FRIDAY);
    m += ("Saturday" -> java.util.Calendar.SATURDAY);
    m += ("Sunday" -> java.util.Calendar.SUNDAY);
    
    for((k,v) <- m) Console.println(k+" "+v);
  }
  
  {
    //打印系统属性
    import scala.collection.JavaConversions.propertiesAsScalaMap;
    val pros:scala.collection.Map[String,String] = System.getProperties();
    val maxLength = pros.keySet.maxBy(_.length()).length();
    Console.println(maxLength);
    val formatLength = maxLength+8;
    for((k,v) <- pros) Console.println(k+(" "*(formatLength-k.length()))+"|"+v)
    
  }
  
  {//对偶，定义函数并调用
      def minmax(values:Array[Int]) = {
        (values.min,values.max);
      }
      
      val array = Array(1,2,3,4,5);
      Console.println(minmax(array));
  }
  
  {
      def lteqgt(values:Array[Int],v:Int) = {
        var ltnum,eqnum,gtnum = 0;
        for(n <- values){
          if(n<v) ltnum += 1;
          if(n==v) eqnum += 1;
          if(n>v) gtnum += 1;
        }
        (ltnum,eqnum,gtnum);
      }
      
       val array = Array(1,2,3,4,5);
       Console.println(lteqgt(array,2));
  }
  
  {
    Console.println("Hello".zip("Worldd"));
  }
}