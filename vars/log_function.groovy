def call(message)
{
  println(message)
  Date date = new Date() 
 
      sh " echo '${date}'  ${message} >> log.txt"
}
