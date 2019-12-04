pipeline {
  agent any
  
  stages {
    stage ('Compile Stage') {
      
      steps { 
        echo 'Running compile stage'
        bat """
        C:\\Product\\Java\\jdk-13.0.1\\bin\\javac HelloWorld.java
        """
      }
    }
    
   stage ('Test Stage') {
     steps { 
      echo 'Running Test stage'
     
     }
    }
  }
}
