project_name = "jenkins-pipeline-python"
repo = "https://github.com/ingdany/jenkins-jobdsl.git"
repo_name = "repo"

pipelineJob(project_name) {
    scm {
        git {
            remote {
                name(repo_name)
                url(repo)
            }
        }
        scriptPath("Jenkinsfile")
    }    
}