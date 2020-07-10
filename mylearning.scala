package org.inceptez.scalaprograms

object mylearning {
  def main(args:Array[String]){
    //Var are mutable and val is immutableyy
    println("Scala UseCases");
    //static definition and dynamic inference
    //simple data types particulary under anyval
    //conditional structure using nested if , else if and else then nested if
    //control structures / Looping construct
    //var s:String="bigdata"
    //println(Palindrome(s))
    //Using try...catch
    try
    {
      //Checked Inpput values: (10,2) and (10,0)
      println(metexception(10,0))
    }
    catch
    {
      case a: java.lang.ArithmeticException => 
        { 
            println(metexception(10,1));
            
        }
    } 
  
 //Find Array is Empty or Higest value 
def EmptyArray(a:Array[Int]):Any=
  {
    if (a.isEmpty)
    {
      println("Array is empty");
    }
    else
    {
      var m=a.max
      println("Display the highest value of array:"+m)
    }  
   }
println(EmptyArray(Array(1,2,3,4)))
 //shows Array is mutable
  var ar1 = Array(1,2,3,4,5)
  //ar1(4)=6
       println("This shows Array is mutable " + ar1(4))
       //println("Fourth element of Array(1,2,3,4,5) is : " + ar1(3))
 
  //shows Array is Non Resizable
  var ar2 = Array(1,2,3,4,5)
  //ar2(5)=6
  //println("This shows Array is Non Resizable" +ar2(5))
  
  //shows ArrayBuffer is Mutable
  var ar3= scala.collection.mutable.ArrayBuffer(1,2,3,4,5) 
  ar3(4)=6
  println("This shows Array Buffer is mutable " + ar3(4))
  
  /*
  //shows ArrayBuffer is Immutable
  //var ar4= scala.collection.immutable.ArrayBuffer(1,2,3,4,5) 
  ar4(4)=6
  println("This shows ArrayBuffer is immutable " + ar4(4))
  */
  
  //shows ArrayBuffer is Resizable
  var ar5 = scala.collection.mutable.ArrayBuffer(1,2,3,4,5)
  ar5+=6
  ar5(0)=7
  ar5-=ar5(0)
  println("This shows Array is Resizable" +ar5)
  
  //shows List is immutable
  var fruits = List("apples", "oranges", "mangoes")
  //fruits(2)="watermelon"
  println("This shows List is immutable" +fruits(2))
  
  //shows List is Non Resizable
  var fruitsList=List("apples", "oranges", "mangoes")
  //fruitsList-="apples"
   println("This shows List is Non Resizable" +fruitsList(0))
   
   //Create Tuple and stored in another tuple
   val emp = (101,"Absar",200.00,"IT")
      val empid = emp._1
      val empname = emp._2
      val empsal = emp._3
      val empdep = emp._4
      var emp2= emp._2 + emp._4
      //var emp3=empid+empsal
      val emp1 = (101,"Absar",200.00,("New Street","Chennai","TN"))
      val empcity = emp1._4._2
      
      //maximum value out of (2,3,1,5,4) elements in the array
       val arMaxi = Array(2,3,1,5,4)
       println("Max element of Array is : " + ar1.max)
       
       //Find the Max/Min Value stord another array
       val arMax=Array(2,3,1,5,4)
       println("Max element of Array is : " + arMax.max)
       val arMin=Array(2,3,1,5,4)
       println("Min element of Array is : " + arMin.min)
       val arMaxMin=arMax.max + arMin.min
       println("Max and Min element stored another Array is : " + arMaxMin)   
}
//List with 5 different values Range with Sum Values
  var ListRange=List(1,2,3,4,5)
  var sumvalue=Range(1,5).sum
  println("Display Range and Sum values:"+sumvalue)

//String List and count the number of elements in the list
  var ListString=List[String]("Spark","Scala","Python","Java","Hadoop")
  var CountList=ListString.length
  println("Count the number of elements in the list:"+CountList)

  //Store using map
  var MapCountries=scala.collection.mutable.Map("China"->"Beijing","India"->"New Delhi","USA"->"Washington","UK"->"London")
  MapCountries+="Japan"->"Tokyo"
  MapCountries("India")="TamilNadu"
  println("Display Countries and Captial city:"+MapCountries)
  var CountriesOnly=MapCountries.keys
  var StoredArray=CountriesOnly.toArray
  StoredArray.foreach(println)
  
  //Take Only Countries and Stored in Set
  var setCountries=CountriesOnly.toSet 
  //Create Case class using tuple
  case class employ(a:Int,name:String,Amt:Double,Dept:String)
  var emp1 = employ(101,"Absar",200.00,"IT")
  println(emp1.name)
  emp1.Dept
  
  //Check whether Met Exceptioin or not
  def metexception(numerator:Int,denominator:Int):Int=
  {
    val x=numerator/denominator
    println("MetException:"+x)
    return x
  }
  
  //Course Fee
    def Course_Fee(x:Double,x1:Double,y:Double,z:Double){
     if ( x == 25000){
     println("BigData Fees is:" +x) 
     if ( x1 == 15000)
     {
     println ("Spark Fees is:" +y)
     }
     }
     else
     if ( y == 35000)
     println("Machine Learning Fee is:" +y)
     else if ( z == 45000)
     println ("Deep Learning Fee is:" +z)  
    }
  
  //Checked Palindrome or Not 
  def Palindrome(s:String="madam"):String = {
    if (s.length == 0 || s.length == 1)
      "String is polindrome"
    else
      if (s.charAt(0).toLower == s.charAt(s.length - 1).toLower)
        Palindrome(s.substring(1, s.length - 1))
      else
        "String is not polindrome"
  }
  println(Palindrome("malayalam"))
  
  def OddEven(n:Int)=
  {
    val n=20;
   for(i <- 5 to n){
     if(i%2==0)
     {
     println("even"+i)
     }
     else
      {
     println("odd"+i)
      }
    }
  }
  
  //Increment of Three
  var n=21;
  for(g <- 0 until n by 3)
  {
    println("Increment of Three value:" +g)
    //i=i+3
  }
  
  def DivideByFour(n:Int)=
      {
         var n=20
         for(i <- 1 to n)
     {
            if(i%4==0)
     {
            println("Even Number Not match in range:"+i)
     }
       
      }
      }
      
  //Creating Method with Multiple Return Type
  def MultipleReturn(a:Int,b:Int):(Int,Int)=
  {
    val c=a+b;
    println("Creating Method with Multiple Return Type:"+c)
    return (a,b)
    return (c,b)
  }
  
  //Creating Calculator with 3 Arguments
  def Calculator3Argument(a:Int,b:Int,c:String):Any=
  {
    var add=a+b
    //var c="add"
    println("Addition:" +add);
    //return (add,c)
    
    var sub=a-b
    println("Subtraction:" +sub);
  } 
  
  //DataTypeMatch
  def DataTypeMatch(a:Int,b:Int,op:String):Any = 
       op match
        {
    
          case "f" | "float" =>
            {
              println("Display Float value:")
              return a.toFloat;
            }
          case "s" | "string" =>
          {
            println("Display string value")
            return a.toString()
          }
          case "b" | "boolean" =>
          {
            var a:Boolean=true
            var b:Boolean=false
            if(a==b){
              println("boolean value"+a)
              return a;
              }
            else{
              println("booleanvalue"+b)
              return b
              }
          }
          case "c" | "char" =>
          {
            println("Display char value")
            return a.toChar
            
          }
          case _ =>
          {
            println("Operation Not matched")
            "No Match"
          }
        }
        
}
