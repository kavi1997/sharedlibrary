def call(message)
{
  

 println(message)
  def mes=message
  Date date = new Date() 
  
      sh " echo '${date}' Bamboo  ${message}  >>log.txt"
   
}

