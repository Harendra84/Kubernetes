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
