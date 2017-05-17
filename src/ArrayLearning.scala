import scala.collection.mutable.ArrayBuffer


class ArrayLearning {
  //1
  {val nums = new Array[Int](10);
  for(i<- 0 until nums.length) nums(i)=math.ceil(math.random*nums.length).intValue();
  }
  
  //2
  {
    val nums1 = Array(1,2,3,4,5);
    var t=0;
    for(i <- 0 until nums1.length-1 if i%2==0) {t=nums1(i);nums1(i) = nums1(i+1); nums1(i+1)=t;}
  }
  //3
  {
    val nums1 = Array(1,2,3,4,5,6);
    //var t=0;
    val r = new Array[Int](nums1.length);
    for(i <- 0 until nums1.length) yield {if (i%2==0) {if((i+1)==nums1.length) nums1(i) else nums1(i+1)} else nums1(i-1)}
  }
  //4
  {
    val nums = Array(1,-1,2,-2,3,-3);
    val newNums = new scala.collection.mutable.ArrayBuffer[Int];
    val negtives = new scala.collection.mutable.ArrayBuffer[Int];
    for(i <- 0 until nums.length)  {if(nums(i)>0) newNums.append(nums(i)) else negtives.append(nums(i))}
    newNums.appendAll(negtives);
     newNums.toArray;
  }
  //5
  {
    val nums1 = Array(1,2,3,4,5,6,1200000.11);
    (nums1.sum)/nums1.length;
  }
  //6 块中最后一个表达式的值就是块的值
  {
    val nums = Array(1,2,3,4,5,6,7);
    val pivotal = nums.length/2 - 1;
    var t = 0;
    for(i <- 0 to pivotal) {t=nums(i);nums(i) = nums(nums.length-1-i); nums(nums.length-1-i)=t;}
    nums;
  }
  
  {
    import scala.collection.mutable.ArrayBuffer
    val nums =  ArrayBuffer(1,2,3,4,5,6,7);
    nums.reverse;
  }
  //7
  {
    val nums = Array(1,1,2,3,4,3,5,6,1,7,4);
    nums.distinct;
  }
  
  
  //9
  {
    val tzs = java.util.TimeZone.getAvailableIDs;
    for(tz<- tzs if tz.startsWith("America")) yield tz.substring(tz.indexOf("/")+1)
  }
  
  //10
  {
    import scala.collection.JavaConversions.asScalaBuffer;
    import java.awt.datatransfer._
    
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap];
    val result = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    result
    
  }
}