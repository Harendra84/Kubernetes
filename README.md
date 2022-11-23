# Task 3. Kubernetes.
#### Use the application that you created in task #1 or task #2. Create dockerfiles and build docker
#### images. Create kubernetes yaml manifests for the application (at least a deployment and a
#### service). It’s ok to expose the application with a LoadBalancer or NodePort service or with an
#### ingress. Spin up a single-node local Kubernetes cluster (Docker Desktop, Kind or Minikube) or
#### use a managed cluster like EKS, AKS, GKE etc. Deploy MongoDB to the cluster (it’s ok to use a
#### community helm chart for this, any other approach is fine as well). Then deploy the application
#### to the cluster by applying your manifests. The following requirements should be fulfilled:
#####   ● you can bring your application up by applying your yaml manifests
#####   ● mongodb is running in a separate pod
#####   ● the application should take mongo connection details from the environment variables
#####   ● the app endpoints should be available from your host machine
#####   ● a persistent volume should be used to store the MongoDB data. I.e., when you delete
#####    the MongoDB pod the records in the db should not disappear.

### Project Structure 

![Screenshot_20221123_170354](https://user-images.githubusercontent.com/82948471/203546176-6a8a23af-8567-4987-ad18-91eef24a5e9d.png)

### -> First create dockerfile for loading docker image

![image](https://user-images.githubusercontent.com/82948471/203629806-cf14ff10-0bf3-48b2-b7b0-909af04420c2.png)

### -> Start minikube 

![Screenshot_20221123_215939](https://user-images.githubusercontent.com/82948471/203630152-0a33b25a-7f5b-45b1-860e-c8843f46449b.png)

### -> Build docker images

![Screenshot_20221123_220259](https://user-images.githubusercontent.com/82948471/203630429-36f52c9a-6688-4357-bdd2-f4e999f41718.png)

### -> Then create deployment.yaml file

![image](https://user-images.githubusercontent.com/82948471/203631609-ad7f6365-0463-4c05-9dca-79abdb1251ad.png)

### -> Then create service.yaml file

![image](https://user-images.githubusercontent.com/82948471/203631809-d19a4af8-a3d7-4622-a7c1-e69b6c26a717.png)

### -> Create deployment and service object

![Screenshot_20221123_233611](https://user-images.githubusercontent.com/82948471/203632455-ea78fdc1-2e6e-4dcf-877f-8130c85519c3.png)

### -> respected sir, I have done up-to only in this task.








