pipeline {
  agent any
  
  stages {
    stage ('Compile Stage') {
      
      steps { 
        echo 'Running compile stage'
        echo "${env.JAVA_HOME}"
        bat "${env.JAVA_HOME}\\bin\\javac -classpath ${env.CLASSPATH} UpdateContent.java"
    
      }
    }
    
   stage ('Test Stage') {
     steps { 
      echo 'Running Test stage'
       bat "${env.JAVA_HOME}\\bin\\java -classpath ${env.CLASSPATH} UpdateContent"

     }
    }
    
    stage ('Production Stage') {
       steps { 
        echo 'Opening change ticket in servicenow'
        bat "c:\\product\\python\\python36\\python PythonSNOW.py"
       }  
    }
  }
}
