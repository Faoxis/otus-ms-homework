minikube delete
minikube start --driver=virtualbox --memory 16192 --cpus 8

kubectl create namespace m

helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx/
helm repo update
helm install nginx ingress-nginx/ingress-nginx --namespace m -f nginx-ingress.yaml

kubectl apply -f kuber/Deployment.yml
kubectl apply -f kuber/Service.yml
sleep 30
kubectl apply -f kuber


helm install pg oci://registry-1.docker.io/bitnamicharts/postgresql -f pg/values.yml

minikube ip
kubectl get pods -w
