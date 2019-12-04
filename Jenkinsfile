pipeline {
  agent any
  
  stages {
    stage ('Compile Stage') {
      
      steps { 
        echo 'Running compile stage'
        echo "${env.JAVA_HOME}"
        bat "C:\\Product\\Java\\jdk-13.0.1\\bin\\javac HelloWorld.java"
      }
    }
    
   stage ('Test Stage') {
     steps { 
      echo 'Running Test stage'
       bat "C:\\Product\\Java\\jdk-13.0.1\\bin\\java HelloWorld"
     
     }
    }
  }
}
