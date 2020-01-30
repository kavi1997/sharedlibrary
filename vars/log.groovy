def call(String message)
{
 sh 'echo "${message}" >>log.txt'
}
