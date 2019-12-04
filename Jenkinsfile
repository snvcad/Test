pipeline {
  agent any
  
  stages {
    stage ('Compile Stage') {
      
      steps { 
        echo 'Running compile stage'
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
