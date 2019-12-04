pipeline {
  agent any
  
  stages {
    stage ('Compile Stage') {
      
      steps { 
        echo 'Running compile stage'
        echo "{env.JAVA_HOME}"
        bat "javac HelloWorld.java"
      }
    }
    
   stage ('Test Stage') {
     steps { 
      echo 'Running Test stage'
       bat "java HelloWorld"
     
     }
    }
  }
}
