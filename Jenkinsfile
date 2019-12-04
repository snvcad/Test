pipeline {
  agent any
  
  stages {
    stage ('Compile Stage') {
      
      steps { 
        echo 'Running compile stage'
        bat "${env.JAVA_HOME}\bin\javac HelloWorld.java"
      }
    }
    
   stage ('Test Stage') {
     steps { 
      echo 'Running Test stage'
     
     }
    }
  }
}
