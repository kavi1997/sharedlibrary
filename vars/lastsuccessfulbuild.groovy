def call(jobname){
sh "curl -s http://3.18.105.111:8080/job/'${jobname}'/lastSuccessfulBuild/api/json --user vj:11e428e94b267ffbab27fa713e2da8e6e8"
}
