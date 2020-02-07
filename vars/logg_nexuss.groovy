def call(message)
{
  println(message)
  Date date = new Date() 
 
      sh " echo '${date}'Nexus ${message} >> log.txt"
}
