pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        git 'https://github.com/basil/warnings-ng-reproducer.git'
        sh './gradlew --no-daemon --stacktrace clean check'
      }

      post {
        success {
          recordIssues(aggregatingResults: true, tools: [
            findBugs(pattern: '**/build/reports/findbugs/*.xml'),
            spotBugs(pattern: '**/build/reports/spotbugs/*.xml')
          ])
        }
      }
    }
  }
}
