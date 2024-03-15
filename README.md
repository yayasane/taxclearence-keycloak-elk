![work status](https://img.shields.io/badge/work-on%20progress-red.svg)
![Yaya SANE](https://img.shields.io/badge/Yaya%20SANE-Java-green)
![Java](https://img.shields.io/badge/Yaya%20SANE-JEE-yellowgreen)
![Spring](https://img.shields.io/badge/Yaya%20SANE-Spring%20boot-green)

# Deploy Spring Boot application with MySql database in Kubernetes cluster (minikube)

In this project, I have demonstrated how to deploy and run Springboot application with Mysql database in Kubernetes cluster. Here I have created REST API's to add and retrieve ExchangeRate in the MySql database.

### Prerequisites:
 - [Docker](https://docs.docker.com/engine/install/) or [Docker alternative - Colima](https://github.com/abiosoft/colima)
 - [Minikube](https://minikube.sigs.k8s.io/docs/start/)
 - [Helm](https://helm.sh/docs/intro/install/)
 - [kubectl](https://kubernetes.io/docs/tasks/tools/)
 - IDE and JDK
 - MySql Client: [DBeaver](https://dbeaver.io/download/)

## Perform the following steps to deploy spring boot app on Minikube :

1. Clone this repository
2. From the terminal cd into your project directory and build project using ``` mvn clean install --skip-tests ``` or ``` mvn build ```
3. Start docker on the system
4. Start minikube using ``` minikube start --driver=docker ```
5. Enable docker env using command :  ``` eval $(minikube docker-env)  ```  [Command Reference](https://minikube.sigs.k8s.io/docs/commands/docker-env/)
6. Build docker image in minikube : ``` docker build -t taxclearencesystem:latest . ```
7. To see the created image run command : ``` minikube image ls ```
8. To deploy on kubernetes cluster run command : ``` helm install mychart taxclearencechart ```
9. To see deployed helm chart : ``` helm ls ```
10. Check deployments : ``` kubectl get all ```
11. To connect the taxclearence app run ``` kubectl get services ``` and copy taxclearence service name. Then run command like this : ``` minikube service mychart-taxclearence-service --url ```
12. To call Rest api's, open a new Terminal, and run command : ``` minikube tunnel ``` and call api from the Postman or any of your favourite tool.
13. Remove or delete deployed setup from kubernetes cluster : ``` helm uninstall mychart ```
14. Stop minikube using : ``` minikube stop ```

### Chart installation

![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/chartinstall.png)


### Taxcleaerence NodePort service url

![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/taxclearence-service-url.png)


### Taxcleaerence app exposed

![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/taxclearence-app.png)


## API Documentation

![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/api-doc.png)

## Collection Postman

![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/collection-postman.png)

# Features

### Declarants management (CRUD)

![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/create-declarant.png)
![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/retrieve-declarants.png)
![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/retrieve-declarant-declarations.png)

### Declarations management (CRUD)

![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/create-declaration.png)
![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/retrieve-declarations.png)

### Declaration payments (CRUD)

![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/create-payment.png)
![](https://github.com/yayasane/taxcleareance-k8s/blob/main/screenshots/retrieve-payments.png)

## Made By

- [@yayasane](https://github.com/yayasane)
