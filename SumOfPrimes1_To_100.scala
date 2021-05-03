
object MyClass {
    def main(args: Array[String]) {
        var isPrime = true
        var sum = 2
        for(i <- 3 to 100){
            for(j <- 2 to i/2+1){
                if(i%j==0){
                    isPrime = false
                }
            }
            if(isPrime==true){
                sum = sum + i
            }
            isPrime = true
        }
       println("Sum of all the prime numbers between 1 to 100 is: "+sum) 
    }
}